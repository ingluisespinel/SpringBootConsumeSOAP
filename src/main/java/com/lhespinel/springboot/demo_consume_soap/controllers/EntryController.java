package com.lhespinel.springboot.demo_consume_soap.controllers;

import com.lhespinel.springboot.demo_consume_soap.dtos.MessageReponse;
import com.lhespinel.springboot.demo_consume_soap.services.iEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class EntryController {

    @Autowired
    iEntryService entryService;

    @GetMapping(value = "convert_number")
    public MessageReponse convertNumber(@RequestParam(value="number") Integer number){
        return entryService.translateNumber(number);
    }

}
