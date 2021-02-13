import Axios from "axios";

const getUserInfo = (username, password) => {
  return Axios.get("get-user-info", {
    params: {
      username: username,
      password: password
    }
  });
};
export default {
  async login(username, password) {
    try {
      const getUserInfoPromise = await getUserInfo(username, password);
      const userInfoResponse = await Promise.all([getUserInfoPromise]);
      if (userInfoResponse.data.length === 0) return " noAuth";
      return userInfoResponse;
    } catch (err) {
      console.log(err);
    }
  }
};
