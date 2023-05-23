<template>
  <div class="navbar">
      <!-- 导航栏项 -->
      <div class="nav-items">Nav Item 1</div>
      <div class="nav-items">Nav Item 2</div>
      <div class="nav-items">Nav Item 3</div>
  </div>

  <div class="main-box">
    <div class="main-box-item" v-for="i in state.playList">
      {{i}}
    </div>
  </div>
</template>

<script>
import {reactive} from "vue";

export default {
  name: "Home",
  setup() {
    const state=reactive({
      playList:[1,2,3,4,5,6,7,8,9,10,11,12,13]
    });
    state.playList = Array.from({length:20}, (_, index) => index + 1)

    return {state}
  }
}


</script>

<style lang="less" scoped>
.navbar {
  width: 2rem;
  display:flex;
  flex-direction:column;
  background-color: aquamarine;
  animation:mymove 5s infinite;
  position:relative;
}
@keyframes mymove
{
  from {top:0px;}
  to {top:200px;}
}
.main-box{
  background-color: #8cb9d7;
  display: none;
  flex-wrap:wrap;
  justify-items: center;
  //align-content: center;
  height: 20rem;
  .main-box-item{
    margin: 0.1rem;
    width: 1rem;
    height: 1rem;
    border-radius: 0.2rem;
    background-color: pink;
    display: flex;
    justify-content: center;
    align-items: center;
    color: #ffffff;
    font-weight: bold;
  }
  .main-box-item:nth-child(3){
    color: green;
    //align-items: flex-end;
    order: 0;
    //flex-grow: 0;
    //flex-shrink: 0.5;
    //flex-basis: 3rem;
    align-self:  baseline;
  }
}

</style>