import React, { useState, useEffect } from 'react'
import { Button, Card, Form, Row, Container } from 'react-bootstrap';

const Login = () => {
    //state
    const [login, setLogin] = useState('');
    const [password, setPassword] = useState('');


    // handlers
    const handleLogin = (e: any) => {
        setLogin(e.target.value);
    }
    const handlePassword = (e: any) => {
        setPassword(e.target.value);
    }
    const handleSubmit = () => {
        if (login !== '' || password !== '') {

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
                                <Form.Control value={login} onChange={(e) => handleLogin(e)} type="email" placeholder="Enter email" />
                                <Form.Text className="text-muted">
                                    We'll never share your email with anyone else.
                                </Form.Text>
                            </Form.Group>

                            <Form.Group controlId="formBasicPassword">
                                <Form.Label>Password</Form.Label>
                                <Form.Control value={password} onChange={(e) => handlePassword(e)} type="password" placeholder="Password" />
                            </Form.Group>


                            <Button onClick={() => handleSubmit} variant="primary" type="submit">
                                Submit
                        </Button>

                        </Form>
                    </Card.Body>
                </Card>
            </Row>
        </Container>
    )
}

export default Login
