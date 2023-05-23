<template>
  <div class="icon-list">
    <div class="icon-item" v-for="icon in state.iconList" :key="icon">
      <svg class="icon" aria-hidden="true">
        <use :href="'#' + icon.name"></use>
      </svg>
      <span>{{icon.title}}</span>
    </div>
  </div>
</template>

<script>
import {reactive} from "vue";

export default {
  name: "IconList",
  setup() {
    const state = reactive({
      iconList : [
        {
          name:"icon-musicweinituijian",
          title:"每日推荐"
        },
        {
          name:"icon-musica-tupianyihuifu-15",
          title:"私人FM"
        },
        {
          name:"icon-musicsonglist-01",
          title:"歌单"
        },
        {
          name:"icon-musicpaihangbang4",
          title:"排行榜"
        },
      ]
    })
    return {state}
  },
}

</script>

<style lang="less" scoped>
.icon-list{
  width: 100%;
  height: 2rem;
  margin-top: .2rem;
  display: flex;
  justify-content: space-around;
  align-items: center;
  .icon-item{
    width: 25%;
    height: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    .icon{
      width: 1rem;
      height: 1rem;
    }
  }
}
</style>