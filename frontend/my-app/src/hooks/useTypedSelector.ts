import { RootState } from './../redux/store';
import { useSelector, TypedUseSelectorHook } from 'react-redux'
export const useTypedSelector: TypedUseSelectorHook<RootState> = useSelector
