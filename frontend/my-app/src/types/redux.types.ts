export type jsx = Array<React.ComponentType> | null

//actions
export enum SagaActionTypes {
    REQUEST_LOGIN = 'REQUEST_LOGIN',
}

export enum GeneralActionTypes {

    FINISH_LOADING = 'FINISH_LOADING',
    START_LOADING = 'START_LOADING',
    LOG_IN = 'LOG_IN',
    LOG_OUT = 'LOG_OUT',
    SET_USER_STATUS = 'SET_USER_STATUS',
}
export enum OperatorActionTypes {

    ACCEPT_EMITER = 'ACCEPT_EMITER',
    DECLINE_EMITER = 'DECLINE_EMITER',
    GET_TRANSACTIONS = 'GET_TRANSACTIONS',
    GIVE_RIGHTS = 'GIVE_RIGHTS'

}

export enum InvestorActionTypes {
    TRANSFER_COINS = 'TRANSFER_COINS',
    BUY_COINS = 'BUY_COINS',
    GET_NOTIFICATIONS = 'GET_NOTIFICATIONS',
}
export enum IssuerActionTypes {
    GET_RIGHTS = 'GET_RIGHTS',
    REQUEST_EMMISSION = 'REQUEST_EMMISSION',
    BUY_COIN = 'BUY_COIN',
}

//states
export interface generalState {
    isLoading: boolean,
    isLogged: boolean,
    userStatus: string | null,
    pseudoData: string

}
export interface issuerState {

}
export interface operatorState {

}
export interface investorState {

}
