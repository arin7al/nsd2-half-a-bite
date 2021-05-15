import { GeneralActionTypes } from './../../types/redux.types';

//actions
export const loadOn = () => {
    return ({ type: GeneralActionTypes.START_LOADING })
}
export const loadOff = () => {
    return ({ type: GeneralActionTypes.FINISH_LOADING })
}

