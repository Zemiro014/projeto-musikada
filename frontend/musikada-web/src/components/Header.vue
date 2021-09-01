<template>
  <div id="header">
    <b-navbar toggleable="lg" type="dark" variant="info" style="color-bg: red">
      <b-navbar-brand href="#">
          <b-img src="@/assets/images/logo.png" fluid alt="Fluid image"></b-img>
      </b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item href="#">Home</b-nav-item>
          <b-nav-item href="#">Cantor</b-nav-item>
          <b-nav-item href="#">Cifras</b-nav-item>
          <b-nav-item href="#">Eventos</b-nav-item>
          <b-nav-item href="#">Sobre nós</b-nav-item>
          <b-nav-item href="#">{{title}}</b-nav-item>
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto" text-variant="white">
          <b-nav-item-dropdown right>
            <!-- Using 'button-content' slot -->
            <template #button-content>
              <em @click="getDataInDataBase">User</em>
            </template>
            <b-dropdown-item href="#">{{Perfil}}</b-dropdown-item>
            <b-dropdown-item href="#">{{Entrar}}</b-dropdown-item>
            <b-dropdown-item href="#">{{Sair}}</b-dropdown-item>
             <!-- <b-dropdown-item v-for="item in objeto" :key="item.idade" href="#">{{item.name}}</b-dropdown-item> -->
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
    <b-nav tabs align="center" class="nav-bottom">
      <b-nav-form>
        <b-input-group class="mt-3">
          <template #append>
            <b-input-group-text
              ><b-icon icon="search"></b-icon
            ></b-input-group-text>
          </template>
          <b-form-input
            type="search"
            placeholder="Qual musica tocar ?"
          ></b-form-input>
        </b-input-group>
      </b-nav-form>
    </b-nav>
  </div>
</template>

<script>
export default {
  name: "Header",
  props:[
    'Perfil',
    'Entrar',
    'Sair'

  ],
  data(){
    return{
      resultado:'',
      teste: true,
      objeto:[]
    }
  },
  methods:{
    getDataInDataBase(){
      const objectoLocal = 
      [
        { "name": 'Mena', "idade": "20"},
        { "name": 'Artur', "idade": "19"},
        { "name": 'Joao', "idade": "15"}
      ];
      this.objeto = objectoLocal;
    }
  },
  components: {},
};
</script>
<style scoped>
.bg-info {
  background-color: #f0833b !important;
}
.navbar-dark .navbar-nav .nav-link,
.navbar-dark .navbar-brand,
em {
  color: black;
}
.nav-bottom {
  padding-bottom: 10px;
}
.navbar-dark .navbar-nav a.nav-link:hover,
.justify-content-center {
  background-color: #a8a5a5ea;
}
.navbar-dark .navbar-nav a.nav-link:hover {
  border-radius: 10px;
}
.img-fluid {
    max-width: 90px;
    height: auto;
}
</style>
