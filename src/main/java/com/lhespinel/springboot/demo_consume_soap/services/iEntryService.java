package com.lhespinel.springboot.demo_consume_soap.services;

import com.lhespinel.springboot.demo_consume_soap.dtos.MessageReponse;
import org.springframework.stereotype.Service;

@Service
public interface iEntryService {

    public MessageReponse translateNumber(Integer numberToTranslate);

}
