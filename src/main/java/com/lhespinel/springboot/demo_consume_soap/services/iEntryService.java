package com.lhespinel.springboot.demo_consume_soap.services;

import com.lhespinel.springboot.demo_consume_soap.dtos.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public interface iEntryService {

    public MessageResponse translateNumber(Integer numberToTranslate);

}
