package com.example.travelagency.controller.ui;

import com.example.travelagency.model.Clients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ClientsWEBController{

    private List<Clients> clients = new ArrayList<>(
            Arrays.asList(
                    new Clients(1 , "Kola" , "call" , "Olegovich" , "green" , "0995638205"),
                    new Clients(2 , "Eola" , "delain" , "Maksumovuch" , "backer-street" , "0665393661"),
                    new Clients(3 , "Max" , "ilichuk" , "Valeriovuch" , "mehanizatoriv" , "0655480158"),
                    new Clients(4 , "Oleg" , "tkach" , "Dmutrovich" , "kuivska" , "0975601447"),
                    new Clients(5 , "Den" , "horuk" , "Vasilovich" , "lobulanska" , "0664784638"),
                    new Clients(6 , "Geo" , "baby" , "Vasilovich" , "lobulanska" , "0994284638")

            )
    );

    @RequestMapping("/ui/clients")
    String getAll(Model model){
        System.out.println("hello");
        model.addAttribute("clients" , clients);
        return "clients";
    }

}
