<template>
  <div>
    <b-container class="bv-example-row">
      <b-row> 
         <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
          </b-col>
           <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
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
    return {};
  },
};
</script>