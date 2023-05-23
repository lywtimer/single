<template>
  <InfoHeader :playlist="state.playList"></InfoHeader>
  <InfoPlayList></InfoPlayList>
</template>

<script>
import {onMounted, reactive} from "vue";
import {useRoute} from "vue-router";
import {getPlaylistDetail} from "@/request/api/detail";
import InfoHeader from "@/components/info/InfoHeader.vue";
import InfoPlayList from "@/components/info/InfoPlayList.vue";

export default {
  components: {InfoPlayList, InfoHeader},
  setup() {
    const state=reactive({
      playList:{}
    });
    onMounted(async()=>{
      let id=useRoute().query.id
      let res= await getPlaylistDetail(id)
      state.playList=res.data.playlist
      sessionStorage.setItem('infoDetail',JSON.stringify(state))
    })
    return {state}
  }
}
</script>

<style scoped>

</style>