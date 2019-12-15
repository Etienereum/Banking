package com.orason.model.customer.abCustomer;

import com.orason.model.abModel.Participant;

public abstract class Customer implements Participant {

    private Long ID;
    private String fName;
    private String lName;
    private String email;
    private int phoneNum;
    private String level;

}