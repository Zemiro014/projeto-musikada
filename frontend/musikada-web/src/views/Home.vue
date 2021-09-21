<template>
  <div class="home">
    <div class="home-body">
      <div class="topCipher">
        <h4>Top Cifras</h4>
        <TopCiphers />
      </div>
      <div class="topEventos">
        <TopEvents />
      </div>
    </div>
    <TopVideos />
    <MusikadaFooter />
  </div>
</template>

<script>
import TopCiphers from "@/components/TopCiphers.vue";
import TopEvents from "@/components/TopEvents.vue";
import TopVideos from "@/components/TopVideos.vue";
import MusikadaFooter from "@/components/MusikadaFooter.vue";

export default {
  name: "Home",
  components: {
    TopCiphers,
    MusikadaFooter,
    TopEvents,
    TopVideos,
  },
  data() {
    return {
      ciphersData: [],
    };
  },
  methods: {
  },
};
</script>

<style scoped>
.home-body {
  display: flex;
  flex-direction: row;
  text-align: center;
}
.topEventos {
  display: flex;
  justify-content: center;
  align-items: center;
  padding-top: 35px;
}
.topCipher,
.topEventos {
  width: 50%;
  float: left;
}
.topCipher {
  border-right: 8px;
}
</style>
