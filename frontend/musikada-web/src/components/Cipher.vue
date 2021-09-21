<template>
  <div class="cifras-container">
    <div class="cifras" @click="goToCifras">
      <div class="nome-cantor">
        <h5>{{ singerName }}</h5>
      </div>
      <div class="conteudo">
        <p>{{ songTitle }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Cipher",
  props: ["singerName", "songTitle"],
  data() {
    return {};
  },
  methods: {
    goToCifras() {
      this.$router.push({ name: "CiphersView" });
    },
  },
};
</script>
<style scoped>
.cifras-container {
  padding-bottom: 20px;
}
.cifras {
  background-color: #c4c4c4;
  width: 100%;
}
.cifras:hover {
  cursor: pointer;
}
.nome-cantor {
  padding-top: 20px;
}
.conteudo {
  padding-top: 20px;
  padding-bottom: 10px;
}
</style>