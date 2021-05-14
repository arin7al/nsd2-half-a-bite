package com.example.app.data.dto;

import javax.persistence.Embedded;

public class InvestorUser extends User {
    @Embedded
    Balance balance;
}
