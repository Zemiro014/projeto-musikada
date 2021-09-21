<template>
  <div>
    <b-container class="bv-example-row">
      <b-row>
        <b-col cols="6" v-for="(cifra, index) in cifras" :key="index">
          <Cipher
            v-bind:singerName="cifra.name"
            v-bind:songTitle="cifra.title"
          />
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import Cipher from "@/components/Cipher.vue";

export default {
  name: "TopCiphers",
  components: {
    Cipher,
  },
  data() {
    return {
      cifras: [],
    };
  },
  created() {
    this.getCiphers();
  },
  methods: {
    getCiphers() {
      this.axios.get("/musikada/cifras").then((response) => {
        this.cifras = response.data.cifras;
      });
    },
  },
};
</script>
<style scoped>
.teste {
  padding-bottom: 10px;
}
</style>
