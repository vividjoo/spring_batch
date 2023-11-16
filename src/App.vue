<template>
  <img alt="Vue logo" src="./assets/logo.png" />
  <HelloWorld msg="Welcome to Your Vue.js App" />
  <button @click="onClick">버튼</button>
</template>

<script>
import HelloWorld from "./components/HelloWorld.vue";
import axios from "axios";

export default {
  name: "App",
  components: {
    HelloWorld,
  },
  methods: {
    onClick: () => {
      console.log("dfa");
      axios({
        method: "GET",
        url: "/download",
        responseType: "blob", // 가장 중요함
      })
        .then((response) => {
          const url = window.URL.createObjectURL(
            new Blob([response.data], {
              type: response.headers["content-type"],
            })
          );
          const link = document.createElement("a");
          link.href = url;
          link.setAttribute("download", `${new Date()}.xlsx`);
          document.body.appendChild(link);
          link.click();
        })
        .catch((err) => {
          console.log("err: ", err.message);
        });
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
