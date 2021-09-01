<template>
  <div>
    <b-container class="bv-example-row">
      <div class="teste">
        <b-row class="justify-content-md-center">
          <b-col col lg="2"
            ><Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Olá'" />
          </b-col>
          <b-col cols="12" md="auto"></b-col>
          <b-col col lg="2"
            ><Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Olá'"
          /></b-col>
        </b-row>
      </div>
      <div>
        <b-row class="justify-content-md-center">
          <b-col col lg="2"
            ><Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Olá'" />
          </b-col>
          <b-col cols="12" md="auto"></b-col>
          <b-col col lg="2"
            ><Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Olá'"
          /></b-col>
        </b-row>
      </div>
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
  data() {},
};
</script>
<style scoped>
.teste{
  padding-bottom: 10px;
}
</style>
