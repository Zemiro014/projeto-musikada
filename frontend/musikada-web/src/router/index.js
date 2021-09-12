import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

Vue.mixin({
    created: function() {
        //this.$root.pessoaId;
        this.$root.loading = false;
        //this.$root.rootArray;
        // var myOption = this.$options.myOption
        // if (myOption) {
        //     console.log(111, myOption);
        // } /home/jeronimo/Documentos/projectos/MUSIKADA/projeto-musikada/frontend/musikada-web/src/
    },
    data: function() {
        return {
            //pessoaId: '',
            loading: false,
            //rootArray: []
        }
    }
});

const routes = [
    {
        path: '/',
        name: 'Home',
        component: () =>
            import ('../views/Home.vue')
    },
    {
        path: '/singers',
        name: 'SingerView',
        component: () => import ('../views/SingerView.vue')
    },
    {
        path: '/ciphers',
        name: 'CiphersView',
        component: () => import ('../views/CiphersView.vue')
    },
    {
        path: '/events',
        name: 'EventsView',
        component: () => import ('../views/EventsView.vue')
    },
    {
        path: '/about',
        name: "AboutUsView",
        component: () => import ('../views/AboutUsView.vue')
    }
]
const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
});

export default router;