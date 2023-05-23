import { createRouter, createWebHistory } from 'vue-router'
import MusicView from "../views/MusicView.vue"
import HomeView from "../views/HomeView.vue"
import Home from "@/views/memory/Home.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/music',
      name: 'music',
      component: HomeView
    },
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/center',
      name: 'center',
      // component: MusicView
      component: () => import('../views/CenterView.vue')
    },
    {
      path: '/musicInfo',
      name: 'music-info',
      // component: MusicView
      component: () => import('../views/MusicInfo.vue')
    },
    {
      path: '/music',
      name: 'music',
      component: MusicView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    }
  ]
})

export default router
