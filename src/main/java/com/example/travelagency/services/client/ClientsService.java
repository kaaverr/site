package com.example.travelagency.services.client;

import com.example.travelagency.model.Clients;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientsService {
    private List<Clients> clients;

    @PostConstruct
    void init(){
        clients = new ArrayList<>(
                Arrays.asList(
                        new Clients(2 , "Malva" , "GG" , "las" ,  "backer-street" , "0448475992"),
                        new Clients(4 , "Kykak" , "FF" , "lor" ,  "backer-street" , "0669223550"),
                        new Clients(8 , "Damal" , "RR" , "vor" ,  "backer-street" , "0992256197"),
                        new Clients(1 , "Lilov" , "SS" , "zak" ,  "backer-street" , "0556783743"),
                        new Clients(3 , "Kamar" , "BB" , "pop" ,  "backer-street" , "0462646728")

                )
        );
    }

    public List<Clients> getAll() {

        return clients;
    }
}