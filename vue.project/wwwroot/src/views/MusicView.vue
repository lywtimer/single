<template>
<!--  <TopNav></TopNav>-->
<!--  <IconList></IconList>-->
<!--  <MusicCard/>-->
  <TopNav/>
</template>

<style>
.top-nav{
  width: 100%;
  padding: 10px;
  display: flex;
  justify-content: space-between;
}
</style>

<script>

import {defineComponent} from "vue";
import TopNav from "@/App.vue";

export default defineComponent({
  components: {TopNav}
})
</script>