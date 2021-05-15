import { GeneralActionTypes, SagaActionTypes } from './../../types/redux.types';

//actions
export const loadOn = () => {
    return ({ type: GeneralActionTypes.START_LOADING })
}
export const loadOff = () => {
    return ({ type: GeneralActionTypes.FINISH_LOADING })
}

//saga actions
export const requestLogin = (login: string, password: string) => {
    return ({ type: SagaActionTypes.REQUEST_LOGIN, payload: { login, password } })
}
