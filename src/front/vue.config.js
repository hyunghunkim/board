module.exports = {
  outputDir: "/Users/jiwonpark/Desktop/jpaboard/src/main/resources/static",
  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:8082",
        ws: true,
        changeOrigin: true
      }
    }
  },
  transpileDependencies: ["vuetify"]
};
