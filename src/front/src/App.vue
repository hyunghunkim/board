<template>
  <v-app id="inspire">
    <v-navigation-drawer
        v-model="drawer"
        app
    >
      <v-list-item-title>
        <v-list-item>
          <router-link to="/">홈</router-link>
        </v-list-item>
        <v-list-item v-if="isLogin">
          <router-link to="/mypage">마이페이지</router-link>
        </v-list-item>
        <v-list-item v-else>
          <router-link to="/login">로그인</router-link>
        </v-list-item>
        <v-list-item>
          <router-link to="/board">게시판</router-link>
        </v-list-item>
      </v-list-item-title>
    </v-navigation-drawer>

    <v-app-bar app color="primary">
      <v-app-bar-nav-icon @click="drawer = !drawer"></v-app-bar-nav-icon>

      <v-toolbar-title>Application</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-menu offset-y v-if="isLogin">
        <template v-slot:activator="{ on, attrs }">
          <v-btn
              color="primary"
              dark
              v-bind="attrs"
              v-on="on"
          >
            마이 메뉴
          </v-btn>
        </template>
        <v-list>
          <v-list-item>
            <v-btn text router :to="{name: 'mypage'}">마이페이지</v-btn>
          </v-list-item>
          <v-list-item>
            <v-btn text @click="$store.dispatch('logout')">로그아웃</v-btn>
          </v-list-item>
        </v-list>
      </v-menu>

      <v-btn v-else router :to="{ name: 'login'}">로그인</v-btn>

    </v-app-bar>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>
import {mapState} from "vuex"

export default {
  data: () => ({ drawer: null }),
  computed:{
    ...mapState(["isLogin"])
  }
}
</script>