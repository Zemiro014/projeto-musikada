<template>
  <div id="header">
    <b-navbar toggleable="lg" type="dark" variant="info" style="color-bg: red">
      <b-navbar-brand href="#">
        <b-img src="@/assets/images/logo.png" fluid alt="Fluid image"></b-img>
      </b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item @click="gotToHome">Página inicial</b-nav-item>
          <b-nav-item @click="gotToSinger">Cantor</b-nav-item>
          <b-nav-item @click="gotToCiphers">Cifras</b-nav-item>
          <b-nav-item @click="gotToEvents">Eventos</b-nav-item>
          <b-nav-item @click="gotToAbout">Sobre nós</b-nav-item>
          <b-nav-item></b-nav-item>
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto" text-variant="white">
          <div class="avatar-bell-user">
            <div class="bell" style="font-size: 3rem">
              <b-icon icon="bell-fill" class="p-2"></b-icon>
            </div>
            <div class="avatar">
              <b-avatar
                variant="dark"
                badge="7"
                badge-variant="danger"
              ></b-avatar>
            </div>
            <div class="user">
              <b-nav-item-dropdown right>
                <!-- Using 'button-content' slot -->
                <template #button-content>
                  <em>Xand Lara</em>
                </template>
                <b-dropdown-item href="#">Profile</b-dropdown-item>
                <b-dropdown-item href="#">Sign Out</b-dropdown-item>
              </b-nav-item-dropdown>
            </div>
          </div>
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
  props: ["Perfil", "Entrar", "Sair"],
  data() {
    return {
      resultado: "",
      teste: true,
      objeto: [],
    };
  },
  methods: {
    getDataInDataBase() {
      const objectoLocal = [
        { name: "Mena", idade: "20" },
        { name: "Artur", idade: "19" },
        { name: "Joao", idade: "15" },
      ];
      this.objeto = objectoLocal;
    },
    gotToSinger() {
      this.$router.push({ name: "SingerView" });
    },
    gotToCiphers() {
      this.$router.push({ name: "CiphersView" });
    },
    gotToHome() {
      this.$router.push({ name: "Home" });
    },
    gotToEvents() {
      this.$router.push({ name: "EventsView" });
    },
    gotToAbout() {
      this.$router.push({ name: "AboutUsView" });
    },
  },
  components: {},
};
</script>
<style scoped>
.bg-info {
  background-color: #a8a5a5ea !important;
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
  background-color: #f0833b;
  opacity: 0.8;
}
.navbar-dark .navbar-nav a.nav-link:hover {
  border-radius: 10px;
}
.img-fluid {
  max-width: 100px;
  height: auto;
}
.avatar-bell-user {
  display: flex;
  justify-content: center;
  align-items: center;
}
.user,
.avatar {
  padding-left: 20px;
}
.user p {
  margin-bottom: 0;
  font-weight: bold;
}
</style>
