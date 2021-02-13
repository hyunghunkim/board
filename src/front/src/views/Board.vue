<template>
  <v-simple-table>
    <template v-slot:default>
      <thead>
      <tr>
        <th class="text-left">글번호</th>
        <th class="text-left">글제목</th>
        <th class="text-left">작성자</th>
        <th class="text-left">작성일</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="item in boardList" :key="item.id" @click="boardDetail(item.id)">
        <td>{{ item.id }}</td>
        <td>{{ item.title }}</td>
        <td>{{ item.name }}</td>
        <td>{{ item.createdDate }}</td>
      </tr>
      </tbody>
    </template>
  </v-simple-table>
</template>

<script>
import {mapState,mapActions} from "vuex"


  export default {
    data() {
      return {

      }
    },
    computed:{
      ...mapState(["boardList"])
    },
    methods:{
      ...mapActions(["boardDetail"])
    }

  }
</script>
