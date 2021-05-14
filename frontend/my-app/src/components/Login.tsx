import React from 'react'
import { Button, Card, Form } from 'react-bootstrap';

const Login = () => {
    return (
<Card style={{ width: '25rem' }}>
    <Card.Body>
        <Card.Title> Авторизация </Card.Title>
        <Form>
            <Form.Group controlId="formBasicEmail">
                <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" />
                    <Form.Text className="text-muted">
                    We'll never share your email with anyone else.
                    </Form.Text>
                </Form.Group>

                <Form.Group controlId="formBasicPassword">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Password" />
                </Form.Group>


            <Button variant="primary" type="submit">
                Submit
            </Button>
            <a href="#!" className="text-muted">У вас уже есть аккаунт?</a>
        </Form>
    </Card.Body>
</Card>
    )
}

export default Login
