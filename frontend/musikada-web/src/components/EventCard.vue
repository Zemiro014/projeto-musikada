<template>
  <div class="event-card">
    <div class="header-event-card" @click="mostrarInfo">
      <img src="@/assets/images/sumer.png" fluid alt="Responsive image" />
    </div>
    <div class="content-event-card">
      <h4>{{ description }}</h4>
      <p>{{ data }}</p>
      <p>{{ local }}</p>
    </div>
    <div class="icons-event-card">
      <div class="icons-heart">
        <b-icon icon="heart" font-scale="1.5"></b-icon>
      </div>
      <div class="icons-share">
        <b-icon icon="share-fill" font-scale="1.5"></b-icon>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: "EventCard",
  props: ["urlImage", "description", "local", "data"],
  data() {
    return {};
  },
  mounted() {},
  methods: {
    mostrarInfo() {
      this.$router.push({ name: "EventsView" });
    },
  },
};
</script>
<style scoped>
.event-card {
  padding: 15px;
  border-radius: 10px;
  width: 350px;
  font-size: 18px;
  box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.25);
}
.header-event-card,
.icons-heart,
.icons-share:hover {
  cursor: pointer;
}
.header-event-card img {
  width: 100%;
}
.content-event-card {
  padding-top: 15px;
  border-bottom: 1px solid #e1e1e1;
}
.content-event-card h4 {
  letter-spacing: -0.015em;
  font-size: 1em;
  font-weight: bold;
}
.content-event-card p {
  margin-bottom: 0;
}
.icons-event-card {
  margin-top: 10px;
  display: flex;
  justify-content: center;
  align-items: center;
}
.icons-heart {
  padding-right: 25px;
}
</style>
