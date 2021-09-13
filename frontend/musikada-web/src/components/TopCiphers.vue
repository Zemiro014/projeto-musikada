<template>
  <div>
    <b-container class="bv-example-row">
        <b-row >
          <b-col cols="6" >
            <Cipher v-bind:singerName="'Telma Lee'" v-bind:songTitle="'Te quero'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Olá'"/>
          </b-col>
           <b-col cols="6">
            <Cipher v-bind:singerName="'C4 Pedro'" v-bind:songTitle="'Tu és a mulher'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Anselmo Ralph'" v-bind:songTitle="'Curtição'"/>
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Gerilson Israel'" v-bind:songTitle="'Tarzan'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Pérola'" v-bind:songTitle="'Ninguém caminha só'"/>
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Yola Semedo'" v-bind:songTitle="'Todo dia da semana'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Filho do Zua'" v-bind:songTitle="'Ndoki'"/>
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'C4 Pedro'" v-bind:songTitle="'Tudo ou nada'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Sei la'"/>
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Telma Lee'" v-bind:songTitle="'Te quero'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Olá'"/>
          </b-col>
           <b-col cols="6">
            <Cipher v-bind:singerName="'C4 Pedro'" v-bind:songTitle="'Tu és a mulher'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Anselmo Ralph'" v-bind:songTitle="'Curtição'"/>
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Gerilson Israel'" v-bind:songTitle="'Tarzan'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Pérola'" v-bind:songTitle="'Ninguém caminha só'"/>
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Yola Semedo'" v-bind:songTitle="'Todo dia da semana'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Filho do Zua'" v-bind:songTitle="'Ndoki'"/>
          </b-col>
           <b-col cols="6">
            <Cipher v-bind:singerName="'C4 Pedro'" v-bind:songTitle="'Tudo ou nada'" />
          </b-col>
          <b-col cols="6">
            <Cipher v-bind:singerName="'Ary'" v-bind:songTitle="'Sei la'"/>
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
    return{
      
    }
  },
};
</script>
<style scoped>
.teste{
  padding-bottom: 10px;
}
</style>
