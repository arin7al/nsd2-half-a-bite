import { createStore, applyMiddleware } from 'redux'
import { combineReducers } from 'redux'
import createSagaMiddleware from 'redux-saga'
import { composeWithDevTools } from "redux-devtools-extension";
import mainReducer from './reducers/main.reducer'

import IndexSagas from './sagas/index-sagas';
import investorReducer from './reducers/investor.reducer';
import issuerReducer from './reducers/issuer.reducer';
import operatorReducer from './reducers/operator.reducer';

const rootReducer = combineReducers({
    main: mainReducer,
    investor: investorReducer,
    issuer: issuerReducer,
    operator: operatorReducer,

})
// create the saga middleware
const sagaMiddleware = createSagaMiddleware()
// mount it on the Store
const store = createStore(
    rootReducer, composeWithDevTools(applyMiddleware(sagaMiddleware))
)

// then run the saga
sagaMiddleware.run(IndexSagas)
export default store;
export type RootState = ReturnType<typeof rootReducer>


// render the application