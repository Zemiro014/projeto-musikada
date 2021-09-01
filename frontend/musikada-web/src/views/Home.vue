<template>
  <div class="home">
    <Header 
        v-bind:Perfil="'Hulk'"
        v-bind:Entrar="'Iron Man'"
        v-bind:Sair="'BatMan'"
    />
    <div class="home-body">
      <div class="topCipher">
        <h4>Top Cifras</h4>
        <TopCiphers />
      </div>
      <div class="topEventos">
        <div class="localizacao">
          <b-form inline >
            <label class="mr-sm-2" for="inline-form-custom-select-pref">Localização: </label>
            <b-form-select
              id="inline-form-custom-select-pref"
              class="mb-2 mr-sm-2 mb-sm-0"
              :options="[{ text: 'Escolha...', value: null }, 'Maianga', 'Golf', 'Rangel', 'Cacuaco', 'Ilha', 'Mussulo', 'Outros']"
              :value="null"
            ></b-form-select>
          </b-form>
        </div>
        <TopEvents />
      </div>
    </div>
    <TopVideos />
    <MusikadaFooter />
  </div>
</template>

<script>
import Header from "@/components/Header.vue";
import TopCiphers from "@/components/TopCiphers.vue";
import TopEvents from "@/components/TopEvents.vue";
import TopVideos from "@/components/TopVideos.vue";
import MusikadaFooter from "@/components/MusikadaFooter.vue";

export default {
  name: "Home",
  components: {
    Header,
    TopCiphers,
    MusikadaFooter,
    TopEvents,
    TopVideos,
  },
  data() {
      return {
      }
    }
};
</script>

<style scoped>
.home-body {
  display: flex;
  flex-direction: row;
  text-align: center;
}
.topCipher,
.topEventos {
  width: 50%;
  float: left;
}
.localizacao{
  padding-top: 10px;
  padding-bottom: 15px;
}
</style>
