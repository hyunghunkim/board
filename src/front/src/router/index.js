import Vue from "vue";
import VueRouter from "vue-router";
import login from "@/views/Login";
import loginAPI from "@/service/loginAPI";
import myPage from "@/views/Mypage"
import home from "@/views/Home";
import store from "@/store/index";
import board from "@/views/Board";
import Axios from "axios";
import boardDetail from "@/views/BoardDetail"

Vue.use(VueRouter);

const rejectAuthUser = (to, from , next) => {
  if(store.state.isLogin){
    alert("이미 로그인 되었습니다.")
    next("/")
  } else {
    next()
  }
}

const onlyAuthUser = (to, from, next) => {
  if (store.state.isLogin) {
    next()
  } else {
    alert("로그인 하세요.")
    next("/login")
  }
}

const boardList = (to, from, next) => {
  Axios
      .get("api/boardList")
      .then( res => {
        store.state.boardList = res.data
      })
      .catch( err => {
        console.log(err)
      })
      .then( () => {
        next()
      })
}

const routes = [
  { path: "/login", name: "login", component: login, beforeEnter: rejectAuthUser},
  { path: "/mypage", name: "mypage", component: myPage, beforeEnter: onlyAuthUser},
  { path: "/", name: "home", component: home },
  { path: "/board", name: "board", component: board ,beforeEnter: boardList},
  { path: "/boardDetail", name: "boardDetail", component: boardDetail }
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
  async login(uid, password) {
    try {
      return await loginAPI.login(uid, password);
    } catch (err) {
      console.error(err);
    }
  }
});

export default router;
