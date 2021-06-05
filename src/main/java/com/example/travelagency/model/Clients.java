package com.example.travelagency.model;

import lombok.Data;

@Data
public class Clients {

    private Integer code;
    private String firstname;
    private String lastname;
    private String fathersname;
    private String address;
    private String fonenumber;

    public Clients(Integer code, String firstname, String lastname, String fathersname, String address, String fonenumber) {
        this.code = code;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fathersname = fathersname;
        this.address = address;
        this.fonenumber = fonenumber;
    }
}
