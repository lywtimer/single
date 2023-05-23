<template>
<div class="home-music-card">
  <div class="music-top">
    <div class="title">发现好歌单</div>
    <div class="more">查看更多</div>
  </div>
  <div class="music-card-list">
    <van-swipe :loop="false" :width="150" class="music-card" :show-indicators="false">
      <van-swipe-item v-for="card in state.musicCardLIst">
        <router-link :to="{path:'/musicInfo',query:{id:card.id}}">
          <img :src="card.picUrl" alt=""/>
          <span class="play-count">
            <svg class="icon" aria-hidden="true">
              <use xlink:href="#icon-musicbofang1"></use>
            </svg>
            {{playCountFormat(card.playCount)}}
          </span>
          <span class="card-name">{{card.name}}</span>
        </router-link>
      </van-swipe-item>
    </van-swipe>
  </div>
</div>
</template>

<script>
import {onMounted, reactive} from "vue";
import {getBanner, getPersonalized} from "@/request/api/home";

export default {
  name: "MusicCard",
  setup() {
    const state = reactive({
      musicCardLIst : []
    })
    // 定义方法
    const playCountFormat = (num) => {
      if (num>=100000000){
        return (num/10000000).toFixed(1) + "亿"
      }else if(num>=100000){
        return (num/10000000).toFixed(1) + "万"
      }else{
        return num
      }
    }
    onMounted(async()=>{
      let res=await getPersonalized(10);
      state.musicCardLIst = res.data.result
    })
    return {state,playCountFormat}
  },
}
</script>

<style lang="less" scoped>
.home-music-card{
  width: 100%;
  height: 5rem;
  padding: 0.2rem;
  .music-top{
    width: 100%;
    height: .6rem;
    display: flex;
    justify-content: space-between;
    margin-bottom: .2rem;
    .title{
      font-size: .4rem;
      font-weight: 900;
    }
    .more{
      border: 1px solid;
      text-align: center;
      line-height: .6rem;
      padding: 0 .2rem;
      border-radius: .4rem;
    }
  }
  .music-card-list{
    width: 100%;
    height: 4rem;
    .music-card{
      height: 100%;
      position: relative;
      img{
        width: 95%;
        height: 3rem;
        border-radius: 0.2rem;
      }
      .play-count{
        position: absolute;
        top: 0.1rem;
        right: 0.2rem;
        color: white;
      }
    }
  }
}
</style>