<template>
  <div>
    <b-card-group deck>
      <b-card bg-variant="light" header="singerName" class="text-center">
        <b-card-text>{{songTitle}}</b-card-text>
      </b-card>
    </b-card-group>
  </div>
</template>

<script>
export default {
  name: "Cipher",
  props: ["singerName", "songTitle"],
  data() {},
};
</script>