import { GeneralActionTypes, ResponseGenerator, SagaActionTypes } from '../../types/redux.types';
import { call, put, takeEvery, takeLatest } from 'redux-saga/effects'
import * as api from '../../api'

// worker Saga: will be fired on USER_FETCH_REQUESTED actions
function* requestLogIn(action: any) {
    try {
        const requestStatus: ResponseGenerator = yield call(api.login, action.payload);
        yield put({ type: GeneralActionTypes.LOG_IN });
    } catch (e) {
        yield put({ type: "USER_FETCH_FAILED", message: e.message });
    }
}

function* loginWatcher() {
    yield takeEvery(SagaActionTypes.REQUEST_LOGIN, requestLogIn);
}

export default loginWatcher;