<template>
  <div>
    <h2>Log In</h2>
    <form @submit="onSubmit">
      <input placeholder="Enter your ID" v-model="username">
      <input placeholder="Enter your password" v-model="password">
      <button type="submit">Login</button>
    </form>
  </div>
</template>
<script>

</script>