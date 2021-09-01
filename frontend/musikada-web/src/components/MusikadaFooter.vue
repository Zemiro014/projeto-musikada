<template>
  <div class="footer-home">
    <div id="rodape">
      <p id="copyright">
        Copyright &copy; 2020 - Todos direitos reservados a Musikada
      </p>
      <img src="image/logo.png" alt="logotipo" id="logorodape" />
      <ul id="musikada">
        <li><strong>Musikada</strong></li>
        <li><a href="homemusikada.html">Home</a></li>
        <li><a href="sobrenos.html">Sobre nós</a></li>
        <li><a href="">Termos e Politicas</a></li>
      </ul>
      <ul id="organizador">
        <li><strong>Para organizador de eventos</strong></li>
        <li><a href="">Como funciona</a></li>
        <li><a href="">Serviços</a></li>
        <li><a href="">Portal</a></li>
      </ul>
      <ul id="central">
        <li>Central de Ajuda</li>
        <li><a href="faleconosco.html">Fale conosco</a></li>
      </ul>
      <div class="rede">
        <h1>Siga nos</h1>
        <a href=""><img src="image/facebook.png" alt="" /></a>
        <a href=""><img src="image/instagram.png" alt="" /></a>
        <a href=""><img src="image/twitter.png" alt="" /></a>
        <a href=""><img src="image/youtube.png" alt="" /></a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MusikadaFooter",
  data() {},
};
</script>
<style scoped>
.footer-home {
  background-color: black;
  color: white;
}

#rodape {
  background-color: black;
  color: white;
  display: block;
}

p #copyright {
  position: relative;
  top: 100px;
}
#logorodape {
  width: 120px;
  height: 80px;
  position: relative;
  margin-left: 380px;
}
ul #musikada {
  list-style: none;
  position: relative;
  margin-left: 510px;
  top: -60px;
}
ul #musikada li {
  margin: 4px;
}
ul #organizador {
  list-style: none;
  position: relative;
  margin-left: 680px;
  top: -140px;
}
ul #organizador li {
  margin: 4px;
}
ul#central {
  list-style: none;
  position: relative;
  margin-left: 910px;
  top: -200px;
}
ul#central a {
  margin: 4px;
}
footer div a {
  color: white;
  text-decoration: none;
}
footer div a:hover {
  text-decoration: underline;
}
.rede {
  position: relative;
  margin-top: -120px;
  margin-left: 380px;
}
.rede h1 {
  font-size: 1.3em;
}

.rede a {
  display: inline-flex;
  margin: 1.5%;
}
.rede img {
  width: 30px;
}
</style>