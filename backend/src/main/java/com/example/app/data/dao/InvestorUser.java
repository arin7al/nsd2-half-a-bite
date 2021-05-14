package com.example.app.data.dao;

import javax.persistence.Embedded;

public class InvestorUser extends User {
    @Embedded
    Balance balance;
}
