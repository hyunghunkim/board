<template>
  <div class="pt-10">
    <v-card
        class="mx-auto"
        max-width="900"
        outlined
    >
      <v-list-item three-line>
        <v-list-item-content>
          <div class="overline mb-4">createdDate</div>
          <v-list-item-title class="headline mb-1 pb-3">title</v-list-item-title>
          <v-list-item-subtitle>content</v-list-item-subtitle>
        </v-list-item-content>
      </v-list-item>

      <v-card-actions>
        <v-btn text>수정</v-btn>
        <v-btn text>삭제</v-btn>
      </v-card-actions>
    </v-card>
  </div>
</template>
<script>
// import {mapState} from "vuex"
//
// export default {
//   data(){
//
//   },
//   computed:{
//     ...mapState(["boardDetail"])
//   }
// }
</script>