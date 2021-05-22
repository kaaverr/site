package com.example.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vouchers {

    private Integer routecode;
    private Integer customercode;
    private Integer dateofdeparture;
    private Integer number;
    private Integer discount;

}
