package com.orason.model.banker;

import com.orason.model.banker.abBanker.BankStaff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BankManager")
public class BankManager extends BankStaff {

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

    public BankManager() { super(); }

    public BankManager(Long ID, String  fName, String lName, String email, int phoneNum, String level) {
        super();
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNum = phoneNum;
        this.level = level;
    }

    public String getfName() { return fName; }

    public void setfName(String fName) { this.fName = fName; }

    public String getlName() { return lName; }

    public void setlName(String lName) { this.lName = lName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getPhoneNum() { return phoneNum; }

    public void setPhoneNum(int phoneNum) { this.phoneNum = phoneNum; }

    public Long getID() { return ID; }

    public void setID(Long ID) { this.ID = ID; }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    @Override
    public String viewDetails() {
        return null;
    }

    @Override
    public String viewHistory() {
        return null;
    }
}