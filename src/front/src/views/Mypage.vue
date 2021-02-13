<template>
  <div class="mypage">
    <v-container fill-height>
      <v-layout align-center>
        <h1>{{ userInfo.name }} 님 환영합니다.</h1>
      </v-layout>
    </v-container>
  </div>
</template>

<script>
import { mapState } from "vuex"

export default {
  computed:{
    ...mapState(["userInfo"])
  }
};
</script>
