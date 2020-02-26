package com.lhespinel.springboot.demo_consume_soap.services;

import com.lhespinel.springboot.demo_consume_soap.dtos.MessageReponse;
import com.lhespinel.springboot.demo_consume_soap.external_resources.soap.number_convertion.NumberToWords;
import com.lhespinel.springboot.demo_consume_soap.external_resources.soap.number_convertion.NumberToWordsResponse;
import com.lhespinel.springboot.demo_consume_soap.utils.soap.SoapConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class EntryServiceImpl implements iEntryService {

    @Autowired
    @Qualifier("SoapConnectorNumberConversion")
    SoapConnector soapConnector;

    @Override
    public MessageReponse translateNumber(Integer numberToTranslate) {
        // Send request to SOAP web service
        NumberToWords numberToWordsRequest=new NumberToWords();
        numberToWordsRequest.setUbiNum(new BigInteger(numberToTranslate+""));
        NumberToWordsResponse response=(NumberToWordsResponse) soapConnector.callWebService("https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL",numberToWordsRequest);
        return new MessageReponse(response.getNumberToWordsResult(),System.currentTimeMillis()+"");
    }
}
