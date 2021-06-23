import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Cbr from '../views/Cbr.vue'
import Bayesian from '../views/Bayesian.vue'
import Fuzzy from '../views/Fuzzy.vue'
import Attacks from '../views/Attacks.vue'

Vue.use(VueRouter)

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
    path: '/bayesian',
    name: 'Bayesian',
    component: Bayesian
  },
  {
    path: '/fuzzy',
    name: 'Fuzzy',
    component: Fuzzy
  },
  {
    path: '/attacks',
    name: 'Attacks',
    component: Attacks
  },
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
  })
  
  export default router