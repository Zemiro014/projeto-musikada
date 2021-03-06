"use strict";

import Vue from 'vue';
import axios from "axios";

// Full config:  https://github.com/axios/axios#request-config
// axios.defaults.baseURL = process.env.baseURL || process.env.apiUrl || '';
// axios.defaults.headers.common['Authorization'] = '';
axios.defaults.headers.common['parceiro'] = 'BPP';

let config = {
    baseURL: process.env.baseURL || process.env.apiUrl || "http://localhost:3000/api"
};

const _axios = axios.create(config);


_axios.interceptors.request.use(
    (config) => {
        config.headers.common['Authorization'] = sessionStorage.token;
        return config;
    },
    (error) => {
        return Promise.reject(error);
    }
);

// Add a response interceptor
_axios.interceptors.response.use(
    (response) => {
        if (response.config.url.includes('/oauth/token') && response.data.token) {
            sessionStorage.setItem('token', response.data.token);
            sessionStorage.setItem('pessoaId', response.data.pessoaId);
        }
        return response;
    },
    (error) => {
        return Promise.reject(error);
    }
);

Plugin.install = function(Vue) {
    Vue.axios = _axios;
    window.axios = _axios;
    Object.defineProperties(Vue.prototype, {
        axios: {
            get() {
                return _axios;
            }
        },
        $axios: {
            get() {
                return _axios;
            }
        },
    });
};

Vue.use(Plugin)

export default Plugin;
