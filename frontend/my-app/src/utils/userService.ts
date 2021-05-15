import { useTypedSelector } from './../hooks/useTypedSelector';
import { useState } from "react";
import store from "../redux/store";
import { getCookie } from "./cookieManager";


/* Regular */

export const isLogged = () => Boolean(store.getState().main.isLogged);

export const getAuthorizationToken = () => getCookie("AuthToken");
export const getAuthorizationHeader = () => ({ Authorization: `Bearer ${getAuthorizationToken()}` });

/* Hooks */

export const useLogged = () => {
    const storeLogged = useTypedSelector(store => store.main.isLogged);
    const [logged, setLogged] = useState(storeLogged);

    if (logged !== storeLogged)
        setLogged(storeLogged);

    return logged;
};