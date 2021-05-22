package com.example.travelagency.controller.rest;

import com.example.travelagency.model.Clients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClientsController {

    private List<Clients> clients;


    @PostConstruct
    void init(){
        clients = new ArrayList<>(
                Arrays.asList(
                        new Clients(27 , "Kola" , "call" , "Olegovich" , "green" , "0995638205"),
                        new Clients(42 , "Eola" , "delain" , "Maksumovuch" , "backer-street" , "0665393661"),
                        new Clients(67 , "Max" , "ilichuk" , "Valeriovuch" , "mehanizatoriv" , "0655480158"),
                        new Clients(12 , "Oleg" , "tkach" , "Dmutrovich" , "kuivska" , "0975601447"),
                        new Clients(293 , "Den" , "horuk" , "Vasilovich" , "lobulanska" , "0664784638")

                )
        );
    }

    @RequestMapping("/clients")
    List<Clients> getAll(){
        return clients;
    }
}
