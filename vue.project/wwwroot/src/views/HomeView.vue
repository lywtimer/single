<template>
    <TopNav></TopNav>
    <IconList></IconList>
    <MusicCard/>
</template>

<style>
.top-nav{
  width: 100%;
  padding: 10px;
  display: flex;
  justify-content: space-between;
}
.icon {
  width: .5rem;
  height: .5rem;
  vertical-align: -0.15em;
  fill: currentColor;
  overflow: hidden;
}
</style>

<script>

import {defineComponent} from "vue";
import MusicCard from "@/components/home/MusicCard.vue";
import IconList from "@/components/home/IconList.vue";
import TopNav from "@/components/home/TopNav.vue";

export default defineComponent({
  components: {TopNav, IconList, MusicCard}
})
</script>