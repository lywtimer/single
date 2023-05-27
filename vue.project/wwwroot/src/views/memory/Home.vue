<template>
<!--  <div class="navbar">-->
<!--      &lt;!&ndash; 导航栏项 &ndash;&gt;-->
<!--      <div class="nav-items">Nav Item 1</div>-->
<!--      <div class="nav-items">Nav Item 2</div>-->
<!--      <div class="nav-items">Nav Item 3</div>-->
<!--  </div>-->
  <NavButton @click="handleButtonClick">Click Me!</NavButton>

<!--  <div class="main-box">-->
<!--    <div class="main-box-item" v-for="i in state.playList">-->
<!--      {{i}}-->
<!--    </div>-->
<!--  </div>-->
</template>

<script>
import { ref } from 'vue';
import NavButton from '@/components/memory/NavButton.vue';

export default {
  components: {
    NavButton,
  },
  setup() {
    const handleButtonClick = () => {
      // 处理按钮点击事件
    };

    return {
      handleButtonClick,
    };
  },
};


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
.circle {
  position: relative;
  width: 200px;
  height: 200px;
  border-radius: 50%;
  background-color: #ccc;
  cursor: grab;
}

.circle-image {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 80%;
  height: auto;
}
</style>