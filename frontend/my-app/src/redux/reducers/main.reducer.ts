import { GeneralActionTypes, generalState } from './../../types/redux.types';

const initialState: generalState = {
    isLoading: false,
    isLogged: false,
    userStatus: null,
}

export default (state = initialState, action: any) => {
    switch (action.type) {

        case GeneralActionTypes.LOG_IN:
            return { ...state, isLogged: true }
        case GeneralActionTypes.SET_USER_STATUS:
            return { ...state, userStatus: action.payload }
        case GeneralActionTypes.LOG_OUT:
            return { ...state, isLogged: false, userStatus: null }
        case GeneralActionTypes.START_LOADING:
            return { ...state, isLoading: true }
        case GeneralActionTypes.FINISH_LOADING:
            return { ...state, isLoading: false }

        default:
            return state
    }
}


