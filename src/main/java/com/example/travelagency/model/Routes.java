package com.example.travelagency.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Routes {

    private Integer routecode;
    private String country;
    private String climate;
    private String duration;
    private Integer hotel;
    private Integer cost;

}

