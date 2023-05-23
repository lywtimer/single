<template>
  <div class="music-info-header">
    <img :src="playlist.coverImgUrl" class="music-info-header-bg-img">
    <div class="music-info-header-left">
      <svg class="icon" aria-hidden="true" @click="$router.go(-1)">
        <use xlink:href="#icon-musicfanhui1"></use>
      </svg>
      <span>歌单</span>
    </div>
    <div class="music-info-header-right">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#icon-musicsousuo"></use>
      </svg>
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#icon-musicliebiao2"></use>
      </svg>
    </div>
  </div>
</template>

<script>
export default {
  name: "InfoHeader",
  setup(props) {

    if (props.playlist.creator===""){
      props.playlist.creator=JSON.parse(sessionStorage.getItem())
    }
  },
  props:['playlist']
}
</script>

<style lang="less" scoped>
.music-info-header{
  width: 100%;
  height: 1rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  .music-info-header-left, .music-info-header-right{
    width: 25%;
    height: 100%;
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin: 0 0.2rem;
    span{
      font-size: 0.4rem;
      color: #ffffff;
    }
    .icon{
      fill: #fff;
      width: 0.5rem;
      height: 0.5rem;
      vertical-align: -0.15em;
    }
  }
  .music-info-header-bg-img{
    width: 100%;
    height: 11rem;
    position: fixed;
    z-index: -1;
    filter: blur(30px);
  }

}
</style>