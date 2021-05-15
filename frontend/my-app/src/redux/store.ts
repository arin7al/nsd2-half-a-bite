



import { createStore, applyMiddleware } from 'redux'
import { combineReducers } from 'redux'
import createSagaMiddleware from 'redux-saga'
import { composeWithDevTools } from "redux-devtools-extension";
import mainReducer from './reducers/main.reducer'

import mySaga from './sagas/main.saga'

const rootReducer = combineReducers({
    main: mainReducer
})
// create the saga middleware
const sagaMiddleware = createSagaMiddleware()
// mount it on the Store
const store = createStore(
    rootReducer, composeWithDevTools(applyMiddleware(sagaMiddleware))
)

// then run the saga
sagaMiddleware.run(mySaga)
export default store;
export type RootState = ReturnType<typeof rootReducer>


// render the application