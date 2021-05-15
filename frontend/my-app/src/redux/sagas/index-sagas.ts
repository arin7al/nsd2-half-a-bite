import loginWatcher from './main.saga'

export default function* IndexSagas() {
    yield [
        loginWatcher(),
        // firmwareWatcher(),
    ]
}
