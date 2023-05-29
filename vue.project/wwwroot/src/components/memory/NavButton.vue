<template>
  <button ref="buttonRef" class="nav-button"
          @mousedown="handleMouseDown"
          @mouseup="handleMouseUp"
          @mousemove="handleMouseMove"
          @mouseleave="handleMouseLeave"
  >
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
    let initialMouseX = 0;
    let initialMouseY = 0;
    let initialButtonX = 0;
    let initialButtonY = 0;

    const handleMouseDown = (event) => {
      isDragging = true;
      initialMouseX = event.clientX;
      initialMouseY = event.clientY;
      initialButtonX = buttonPosition.x;
      initialButtonY = buttonPosition.y;
    };

    const handleMouseUp = () => {
      isDragging = false;
    };

    const handleMouseMove = (event) => {
      if (isDragging) {
        const deltaX = event.clientX - initialMouseX;
        const deltaY = event.clientY - initialMouseY;
        buttonPosition.x = initialButtonX + deltaX;
        buttonPosition.y = initialButtonY + deltaY;
        buttonRef.value.style.transform = `translate(${buttonPosition.x}px, ${buttonPosition.y}px)`;
      }
    };

    const handleMouseLeave = () => {
      if (isDragging) {
        isDragging = false;
      }
    };

    return {
      buttonRef,
      handleMouseDown,
      handleMouseUp,
      handleMouseMove,
      handleMouseLeave,
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