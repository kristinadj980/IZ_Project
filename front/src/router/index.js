import Vue from 'vue'
import VueRouter from 'vue-router'
import Cbr from '../views/Cbr.vue'
import Bayesian from '../views/Bayesian.vue'
import Fuzzy from '../views/Fuzzy.vue'
import Attacks from '../views/Attacks.vue'

Vue.use(VueRouter)

const routes = [
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