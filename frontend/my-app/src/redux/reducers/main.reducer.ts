const initialState = {

}

export default (state = initialState, action: any) => {
    switch (action.type) {

        case 'ss':
            return { ...state, ...action.payload }

        default:
            return state
    }
}


