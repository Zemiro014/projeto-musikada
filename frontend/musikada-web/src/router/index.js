import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

Vue.mixin({
    created: function() {
        //this.$root.pessoaId;
        //this.$root.loading = false;
        //this.$root.rootArray;
        // var myOption = this.$options.myOption
        // if (myOption) {
        //     console.log(111, myOption);
        // }
    },
    data: function() {
        return {
            pessoaId: '',
            loading: false,
            rootArray: []
        }
    }
});

const routes = [
    {
        path: '/',
        name: 'home',
        component: () =>
            import ('../views/Home.vue')
    }
]
const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
});

export default router;