<template>
  <div>
    <b-container class="bv-example-row">
      <b-row>
        <b-col v-for="(evento, index) in eventos1" :key="index">
          <EventCard
            v-bind:urlImage="evento.urlImage"
            v-bind:description="evento.description"
            v-bind:local="evento.local"
            v-bind:data="evento.data"
          />
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import EventCard from "../components/EventCard.vue";

export default {
  name: "TopEvents",
  components: {
    EventCard,
  },
  data() {
    return {
      eventos1: [],
    };
  },
  created() {
    this.getEventos();
  },
  methods: {
    getEventos() {
      this.axios.get("/musikada/eventos").then((response) => {
        console.log(response.data.eventos);
        this.eventos1 = response.data.eventos;
        console.log(this.eventos1);
      });
    },
  },
};
</script>