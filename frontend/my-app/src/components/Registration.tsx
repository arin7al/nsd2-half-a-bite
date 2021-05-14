import React from 'react'
import { Button, Card, Form } from 'react-bootstrap';


export default function registration() {
    return (
        <div>
            <Card style={{ width: '25rem' }}>
                <Card.Body>
                <Card.Title> Регистрация </Card.Title>
                <Form>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Label>Email address</Form.Label>
                    <Form.Control type="email" placeholder="Enter email" />
                        <Form.Text className="text-muted">
                            We'll never share your email with anyone else.
                        </Form.Text>
                    </Form.Group>

                    {/* <Form.Group controlId="formName">
                        <Form.Label>Имя</Form.Label>
                    <Form.Control type="name" placeholder="Ваше имя" />
                    </Form.Group>

                    <Form.Group controlId="formName">
                        <Form.Label>Фамилия</Form.Label>
                    <Form.Control type="LastName" placeholder="Ваша фамилия" />
                    </Form.Group> */}

                    <Form.Group controlId="formBasicPassword">
                         <Form.Label>Password</Form.Label>
                            <Form.Control type="password" placeholder="Password" />
                    </Form.Group>

                <Form.Group controlId="EmiterOrInvestor">
                    <Form.Label>Вы инвестор или эмитер?</Form.Label>
                    <Form.Control as="select">
                        <option>Инвестор</option>
                        <option>Эмитер</option>
                    </Form.Control>
                    </Form.Group>

                    <Button variant="primary" type="submit">
                    Submit
                    </Button>
                </Form>
             </Card.Body>
            </Card>
        </div>
    )
}

