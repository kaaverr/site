package com.example.travelagency.services.client;

import com.example.travelagency.model.Client;
import com.example.travelagency.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ClientsService {
    private List<Client> clients;

    @Autowired
    ClientRepository repository;

    @PostConstruct
    void init(){
        clients = new ArrayList<>(
                Arrays.asList(
                        new Client(2 , "Malva" , "GG" , "las" ,  "backer-street" , "0448475992"),
                        new Client(4 , "Kykak" , "FF" , "lor" ,  "backer-street" , "0669223550"),
                        new Client(8 , "Damal" , "RR" , "vor" ,  "backer-street" , "0992256197"),
                        new Client(1 , "Lilov" , "SS" , "zak" ,  "backer-street" , "0556783743"),
                        new Client(3 , "Kamar" , "BB" , "pop" ,  "backer-street" , "0462646728")

                )
        );

    repository.saveAll(clients);
    clients = clients;

    }

    public List<Client> getAll() {

        return clients;
    }

    public void delete(Integer code) {
        repository.deleteById(code);
    }

    public void create(Client client) {
    Random random = new Random();
    int id = random.nextInt(1000);
    client.setCode(id);
    repository.save(client);
    }

    public Client get(Integer code) {
    return repository.findById(code).get();
    }

    public void update(Client client) {
    repository.save(client);
    }
}