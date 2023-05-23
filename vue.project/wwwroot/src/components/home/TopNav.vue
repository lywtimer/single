<template>
  <div class="top-nav">
    <div class="top-left">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#icon-musicfavoriteslist"></use>
      </svg>
    </div>
    <div class="top-center">
      <span>我的</span>
      <span class="active">发现</span>
      <span>云村</span>
      <span>视频</span>
    </div>
    <div class="top-left">
      <svg class="icon" aria-hidden="true">
        <use xlink:href="#icon-musicsearchlist"></use>
      </svg>
    </div>
  </div>
  <TopSwiper></TopSwiper>

</template>

<style lang="less" scoped>
.top-nav {
  width: 100%;
  height: 50px;
  padding: 10px;
  display: flex;
  justify-content: space-between;
  align-items: center;

  .top-center {
    width: 60%;
    height: 100%;
    display: flex;
    justify-content: space-around;
    align-items: center;
    font-size: 18px;

    .active {
      font-weight: bold;
    }
  }
}
</style>

<script>
import TopSwiper from "@/components/home/TopSwiper.vue";

export default {
  components: {
    TopSwiper
  }
};
</script>