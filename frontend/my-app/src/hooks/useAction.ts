import { useDispatch } from 'react-redux';
import { bindActionCreators } from 'redux'
import * as mainActionCreators from '../redux/actionCreators/main.action'
export const useAction = () => {
    const dispatch = useDispatch()
    return bindActionCreators(mainActionCreators, dispatch)
}