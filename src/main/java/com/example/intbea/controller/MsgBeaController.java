package com.example.intbea.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MsgBeaController {

    @GetMapping("/testemsg")
    public String testMsgBea() {
        return "PC01201706200911581019009021";
    }

    @GetMapping("testeprefixo")
    public String testMsgPrefixBea() {
        return "PC01";
    } //testando commit
}