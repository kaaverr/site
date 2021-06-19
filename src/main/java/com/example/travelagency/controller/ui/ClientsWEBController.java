package com.example.travelagency.controller.ui;

import com.example.travelagency.form.ClientForm;
import com.example.travelagency.model.Client;
import com.example.travelagency.services.client.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ui/rooms")
public class ClientsWEBController {

    @Autowired
    ClientsService service;

    @RequestMapping("/clients")
    String getAll(Model model) {
        System.out.println("hello       ");
        model.addAttribute("clients", service.getAll());
        return "clients";
    }

    @RequestMapping("/delete/{code}")
    String delete(Model model, @PathVariable("code") Integer code) {
        service.delete(code);
        model.addAttribute("clients", service.getAll());
        return "clients";
    }

    @GetMapping("/create")
    String create(Model model) {
        ClientForm clientForm = new ClientForm();
        model.addAttribute("form", clientForm);
        return "createclient";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model,
                  ClientForm clientForm) {
        System.out.println("haha");
        Client client = new Client();
        client.setFirstname(clientForm.getFirstname());
        client.setLastname(clientForm.getLastname());
        client.setFathersname(clientForm.getFathersname());
        client.setAddress(clientForm.getAddress());
        client.setFonenumber(clientForm.getFonenumber());
        service.create(client);
        model.addAttribute("clients", service.getAll());
        return "clients";
    }

    @GetMapping("/update/{code}")
    String update(Model model, @PathVariable("code") Integer code) {
        Client client = service.get(code);
        ClientForm clientForm = new ClientForm();
        clientForm.setCode(client.getCode());
        clientForm.setFirstname(client.getFirstname());
        clientForm.setLastname(client.getLastname());
        clientForm.setFathersname(client.getFathersname());
        clientForm.setAddress(client.getAddress());
        clientForm.setFonenumber(client.getFonenumber());
        model.addAttribute("form", clientForm);
        return "update";
    }

    @RequestMapping(value = "/update/{code}", method = RequestMethod.POST)
    String update(Model model,
                  ClientForm clientForm) {
        System.out.println("babl");
        Client client = new Client();
        client.setFirstname(clientForm.getFirstname());
        client.setLastname(clientForm.getLastname());
        client.setFathersname(clientForm.getFathersname());
        client.setAddress(clientForm.getAddress());
        client.setFonenumber(clientForm.getFonenumber());
        client.setCode(clientForm.getCode());
        service.update(client);
        model.addAttribute("clients", service.getAll());
        return "clients";

    }
}
