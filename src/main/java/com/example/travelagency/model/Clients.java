package com.example.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Clients {

    private Integer code;
    private String firstname;
    private String lastname;
    private String fathersname;
    private String address;
    private String fonenumber;

}
