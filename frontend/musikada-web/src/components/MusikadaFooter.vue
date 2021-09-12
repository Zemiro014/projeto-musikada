<template>
  <div class="footer">
    <div class="footer-left">
      <div class="footer-logo-menu">
        <div class="footer-logo">
          <b-img src="@/assets/images/logo.png" fluid alt="Fluid image"></b-img>
        </div>
        <div class="footer-menu">
          <h5>Musikada</h5>
          <div class="menus">
            <ul>
              <li>Home</li>
              <li>Sobre nós</li>
              <li>Termos e Políticas</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="footer-copyright-redes">
        <div class="footer-copyright">
          <p>Copyright © 2019 - Todos direitos reservados a Musikada</p>
        </div>
        <div class="footer-redes">
          <h5>Siga-nos</h5>
          <div class="redes" style="font-size: 1.5rem">
            <div class="facebook"> <b-icon icon="facebook"></b-icon></div>
            <div class="instagram"><b-icon icon="instagram"></b-icon></div>
            <div class="linkedin"><b-icon icon="linkedin"></b-icon></div>
            <div class="twitter"><b-icon icon="twitter"></b-icon></div>
          </div>
        </div>
      </div>
    </div>
    <div class="footer-right">
      <div class="para-organizadores">
        <h5>Para organizadores de evento</h5>
        <ul>
          <li>Como funciona</li>
          <li>Serviços</li>
        </ul>
      </div>
      <div class="central-ajuda">
        <h5>Central de ajuda</h5>
        <p>Fale conosco</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MusikadaFooter",
  data() {
    return {};
  },
};
</script>
<style scoped>
.footer {
  background-color: black;
  color: white;
  display: flex;
  flex-direction: row;
  text-align: center;
  padding: 25px;
  justify-content: space-between;
}
.footer-right {
  width: 50%;
  float: right;
  display: flex;
  justify-content: space-between;
}
.footer-logo-menu {
  display: flex;
  justify-content: space-between;
  padding-bottom: 20px;
}
.footer-menu, .para-organizadores, .central-ajuda{
  text-align: left;
}
.footer-menu ul, .para-organizadores ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  justify-content: right;
}
.footer-menu ul li:hover{
  cursor: pointer;
}
.para-organizadores ul li:hover{
  cursor: pointer;
}
.central-ajuda p:hover{
  cursor: pointer;
}
.footer-copyright-redes {
  display: flex;
   justify-content: space-between;
}
.footer-copyright{
  text-align: unset;
  margin-top: 20%;
}
.footer-copyright p{
  margin: 0;
}
.footer-redes {
  padding-right: 20px;
}
.redes {
  display: flex;
}
.footer-redes h5, .footer-menu h5, .central-ajuda h5, .para-organizadores h5{
  font-weight: bold;
}
.facebook,
.instagram,
.linkedin {
  padding-right: 15px;
}
.facebook,
.instagram,
.linkedin,
.twitter :hover{
  cursor: pointer;
}
.img-fluid {
  max-width: 100px;
  height: auto;
}
</style>