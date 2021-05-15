export type jsx = Array<React.ComponentType> | null

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