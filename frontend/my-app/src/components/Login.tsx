import React, { useState, useEffect } from 'react'
import { Button, Card, Form, Row, Container } from 'react-bootstrap';
import { useAction } from '../hooks/useAction';
import { useTypedSelector } from '../hooks/useTypedSelector';

const Login = () => {
    //state
    const [loginInput, setLoginInput] = useState('');
    const [passwordInput, setPasswordInput] = useState('');
    const pseudoData = useTypedSelector(state => state.main.pseudoData)

    //

    // const { login } = useAction();

    // handlers
    const handleLogin = (e: any) => {
        setLoginInput(e.target.value);
    }
    const handlePassword = (e: any) => {
        setPasswordInput(e.target.value);
    }
    const handleSubmit = () => {
        if (loginInput !== '' || passwordInput !== '') {
            // login(loginInput, passwordInput)
        }
    }
    return (
        <Container>
            <Row className="justify-content-md-center">
                <Card style={{ width: '25rem' }}>
                    <Card.Body>
                        <Card.Title> Login </Card.Title>
                        <Form>
                            <Form.Group controlId="formBasicEmail">
                                <Form.Label>Email address</Form.Label>
                                <Form.Control value={loginInput} onChange={(e) => handleLogin(e)} type="email" placeholder="Enter email" />
                                <Form.Text className="text-muted">
                                    We'll never share your email with anyone else.
                                </Form.Text>
                            </Form.Group>

                            <Form.Group controlId="formBasicPassword">
                                <Form.Label>Password</Form.Label>
                                <Form.Control value={passwordInput} onChange={(e) => handlePassword(e)} type="password" placeholder="Password" />
                            </Form.Group>


                            <Button onClick={() => handleSubmit} variant="primary" type="submit">
                                {pseudoData}
                                {/* here it is */}
                            </Button>

                        </Form>
                    </Card.Body>
                </Card>
            </Row>
        </Container>
    )
}

export default Login
