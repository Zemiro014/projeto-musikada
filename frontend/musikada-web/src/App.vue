<template>
  <div id="app">
    <Header
      v-bind:Perfil="'Hulk'"
      v-bind:Entrar="'Iron Man'"
      v-bind:Sair="'BatMan'"
    />
    <router-view>
      <Home />
    </router-view>
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
import Home from "@/views/Home.vue";

export default {
  name: "App",
  components: {
    Home,
    Header,
  },
  created: function () {},
};
</script>