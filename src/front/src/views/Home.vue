<template>
    <v-container>
      <v-layout>
        <h1>spring boot, JPA, vue.js 연습 프로젝트</h1>
      </v-layout>
    </v-container>
</template>

<script>
import { mapState } from "vuex"

export default {
  computed:{
    ...mapState(["userInfo"])
  }
};
</script>
