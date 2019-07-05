import Vue from 'vue'
import Router from 'vue-router'
import main from '@/components/main'
import LoginForm from '@/components/Layout/LoginForm.vue'
import JoinForm from '@/components/Layout/JoinForm.vue'
import Board from '@/components/Layout/Board.vue'
import personal from '@/components/Layout/personal.vue'
import Mypage from '@/components/Layout/Mypage.vue'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'main',
      component: main
    },
    {
      path: '/Login',
      name: 'LoginForm',
      component: LoginForm
    },
    {
      path: '/Join',
      name: 'JoinForm',
      component: JoinForm
    },
    {
      path: '/Board',
      name: 'Board',
      component: Board
    },
    {
      path: '/personal',
      name: 'personal',
      component: personal
    },
    {
      path: '/Mypage',
      name: 'Mypage',
      component: Mypage
    }

   
  ]
})
