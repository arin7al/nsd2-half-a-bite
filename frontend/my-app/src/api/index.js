import axios from "axios";

const instance = axios.create({
    baseURL: 'dd'
});


const makeRequest = function (url, method, data, params, header) {
    return instance(url, {
        method, data, params, headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            ...header
        }
    });
};
export default makeRequest;

export * from "./rest/login";
// export * from "./rest/registration";
// export * from "./rest/profile";
