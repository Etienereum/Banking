package com.orason.model.banker;

import com.orason.model.banker.abBanker.BankStaff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cashier")
public class Cashier extends BankStaff {

    @Id
    @Column(name = "ID")
    private Long ID;

    @Column(name = "FirstName" )
    private String fName;

    @Column(name = "LastName")
    private String lName;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNum")
    private int phoneNum;

    @Column(name = "Level")
    private String level;

    public Cashier () { super(); }

    public Cashier (Long ID, String  fName, String lName, String email, int phoneNum, String level) {
        super();
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.level = level;
    }

    @Override
    public String viewDetails() {
        return null;
    }

    @Override
    public String viewHistory() {
        return null;
    }
}