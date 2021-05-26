import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Cbr from '../views/Cbr.vue'
import Fuzzy from '../views/Fuzzy.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: function () {
      return import(/* webpackChunkName: "about" */ '../views/About.vue')
    }
  },
  {
    path: '/cbr',
    name: 'Cbr',
    component: Cbr
  },
  {
    path: '/fuzzy',
    name: 'Fuzzy',
    component: Fuzzy
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
