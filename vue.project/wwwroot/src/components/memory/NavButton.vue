<template>
  <button ref="buttonRef" class="nav-button" @mousedown="handleMouseDown" @mouseup="handleMouseUp" @mousemove="handleMouseMove">
    <slot></slot>
  </button>
</template>

<script>
import {ref, defineComponent, reactive} from 'vue';

export default defineComponent({
  name: 'NavButton',
  setup(_, { slots, emit }) {
    const buttonRef = ref(null);
    const buttonPosition = reactive({
      x: 0,
      y: 0,
    });
    let isDragging = false;
    let prevMouseX = 0;
    let prevMouseY = 0;

    const handleMouseDown = (event) => {
      isDragging = true;
      prevMouseX = event.clientX;
      prevMouseY = event.clientY;
      console.log('handleMouseDown')
    };

    const handleMouseUp = () => {
      isDragging = false;
      console.log('handleMouseUp')
    };

    const handleMouseMove = (event) => {
      if (isDragging) {
        const deltaX = event.clientX - prevMouseX;
        const deltaY = event.clientY - prevMouseY;
        prevMouseX = event.clientX;
        prevMouseY = event.clientY;
        buttonPosition.x += deltaX;
        buttonPosition.y += deltaY;
        buttonRef.value.style.transform = `translate(${buttonPosition.x}px, ${buttonPosition.y}px)`;
        console.log('handleMouseMove')
      }
    };

    return {
      buttonRef,
      handleMouseDown,
      handleMouseUp,
      handleMouseMove,
    };
  },
});
</script>

<style lang="less" scoped>
.nav-button {
  width: 200px;
  height: 200px;
  border-radius: 50%;
  background-color: #ccc;
  border: none;
  outline: none;
  cursor: grab;
  position: absolute;
  user-select: none;
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: 24px;
  color: #fff;
}

@keyframes rotate {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}
</style>