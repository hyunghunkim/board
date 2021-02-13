import Vue from "vue";
import Vuex from "vuex";
import router from "@/router";
import Axios from "axios";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
    userInfo: null,
    isLogin: false,
    isLoginError: false,
    boardList: [],
    boardDetail: null
  },
  mutations: {
    //로그인 성공시
    loginSuccess(state, payload){
      state.isLogin = true
      state.isLoginError = false
      state.userInfo = payload
    },
    //로그인 실패시
    loginError(state){
      state.isLogin = false
      state.isLoginError = true
    },
    logout(state){
      state.isLogin = false
      state.isLoginError = false
      state.userInfo = null
    },
    boardDetail(state, board){
      state.boardDetail = board
    }
  },
  actions: {
    //로그인을 시도
    login({commit},loginObj){
      Axios
          .post("api/login",{
            email: loginObj.email,
            password: loginObj.password
          })
          .then( res =>{ //성공시 실행
            commit("loginSuccess", res.data)
            router.push({name: "mypage"})
          })
          .catch( err =>{ //에러시 실행
            console.log(err)
          })
          .then( () =>{
            //성공,실패 상관없이 무조건 실행
          })
    },
    logout({commit}){
      commit("logout")
      router.push({name:"home"})
    },
    boardDetail({commit},id){
      Axios
          .get("api/boardDetail?id="+id)
          .then( res => {
            console.log(res)
            commit("boardDetail", res.data)
          })
          .catch( err => {
            console.log(err)
          })
          .then( () => {
            router.push({name:"boardDetail"})
          })
    }
  },
  modules: {}
});
