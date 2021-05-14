import { call, put, takeEvery, takeLatest } from 'redux-saga/effects'

// worker Saga: will be fired on USER_FETCH_REQUESTED actions
function* fetchUser(action: any) {
    try {
        yield put({ type: "USER_FETCH_SUCCEEDED", user: 12 });
    } catch (e) {
        yield put({ type: "USER_FETCH_FAILED", message: e.message });
    }
}

function* mySaga() {
    yield takeEvery("USER_FETCH_REQUESTED", fetchUser);
}

export default mySaga;