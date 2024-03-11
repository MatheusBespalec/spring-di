package com.matheus.algaworks.springdi.controller;

import com.matheus.algaworks.springdi.model.Client;
import com.matheus.algaworks.springdi.service.ActiveClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    private ActiveClientService activeClientService;
    public FirstController(ActiveClientService activeClientService) {
        this.activeClientService = activeClientService;
        System.out.println("controller");
    }

    @GetMapping
    @ResponseBody
    public String test() {
        this.activeClientService.active(new Client("Matheus"));
        return "Test";
    }
}
