import React from 'react'
import { Button, Card, Container, Row, ListGroup, Col, Form } from 'react-bootstrap';

const TradeOfferFromUser = () => {
    return (
        <Container>
            <Row>
                <Card>
                    <Card.Body>
                        <Card.Header>A trade offer from @Username</Card.Header>

                            <ListGroup variant="flush">
                                <ListGroup.Item>Tokens offered:  Amount:  </ListGroup.Item>
                                <ListGroup.Item>Tokens requested:   Amount:</ListGroup.Item>
                            </ListGroup>
                            <Button variant="primary" type="submit">
                            Confirm transaction
                            </Button>
                            <Button variant="danger" type="submit">
                            Refuse transaction
                            </Button>
                    </Card.Body>
                </Card>
            </Row>
        </Container>
    )
}

export default TradeOfferFromUser
