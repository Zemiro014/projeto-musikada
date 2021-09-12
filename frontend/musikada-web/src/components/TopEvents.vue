<template>
  <div>
    <div>
      <b-card-group deck>
        <b-row>
          <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
          </b-col>
        </b-row>
      </b-card-group>
    </div>
    <div class="mt-3">
      <b-card-group deck>
         <b-row>
          <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
          </b-col>
        </b-row>
      </b-card-group>
    </div>
    <div class="mt-3">
      <b-card-group deck>
        <b-row>
          <b-col>
            <EventCard />
          </b-col>
          <b-col>
            <EventCard />
          </b-col>
        </b-row>
      </b-card-group>
    </div>
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