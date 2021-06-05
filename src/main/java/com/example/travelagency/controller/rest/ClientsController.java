package com.example.travelagency.controller.rest;

import com.example.travelagency.model.Clients;
import com.example.travelagency.services.client.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class ClientsController {

    @Autowired
    ClientsService service;

    @RequestMapping
    List<Clients> getAll() {
        return service.getAll();
    }
    @PostMapping
    Clients create(Clients clients) {
        return null;
    }
    @GetMapping("/{code}")
    Clients get(String code) {
        return null;
    }
    @PutMapping
    Clients update(Clients clients) {
        return null;
    }
    @DeleteMapping
    Clients delate(String name){

        return null;
    }
}

