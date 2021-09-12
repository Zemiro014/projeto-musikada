<template>
  <b-container fluid class="p-4">
    <b-row>
      <b-col>
        <b-embed
          type="iframe"
          aspect="16by9"
          src="https://www.youtube.com/embed/b3E6E6hYSSI"
          allowfullscreen
        ></b-embed>
      </b-col>
      <b-col>
        <b-embed
          type="iframe"
          aspect="16by9"
          src="https://www.youtube.com/embed/zpOULjyy-n8?rel=0"
          allowfullscreen
        ></b-embed>
      </b-col>
      <b-col>
        <b-embed
          type="iframe"
          aspect="16by9"
          src="https://www.youtube.com/embed/zpOULjyy-n8?rel=0"
          allowfullscreen
        ></b-embed>
      </b-col>
      <b-col>
        <b-embed
          type="iframe"
          aspect="16by9"
          src="https://www.youtube.com/embed/b3E6E6hYSSI"
          allowfullscreen
        ></b-embed>
      </b-col>
      <b-col>
        <b-embed
          type="iframe"
          aspect="16by9"
          src="https://www.youtube.com/embed/hXQxSi34GWY"
          allowfullscreen
        ></b-embed>
      </b-col>
      <b-col>
        <b-embed
          type="iframe"
          aspect="16by9"
          src="https://www.youtube.com/embed/LNUcQ3QbqdY"
          allowfullscreen
        ></b-embed>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
export default {
  name: "TopVideos",
    data() {
    return{
      
    }
  },
};
</script>
<style scoped>
.video-home {
  margin-left: 20px;
  padding-top: 20px;
  padding-bottom: 20px;
  display: flex;
  flex-direction: row;
  text-align: center;
}
.video {
  margin-left: 15px;
  float: left;
}

</style>
