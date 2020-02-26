package com.lhespinel.springboot.demo_consume_soap.config;

import com.lhespinel.springboot.demo_consume_soap.utils.soap.SoapConnector;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ConfigSoapClient {

    @Bean
    @Qualifier("marshallerNumberConvertion")
    public Jaxb2Marshaller marshallerForNumberConvertion() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.lhespinel.springboot.demo_consume_soap.external_resources.soap.number_convertion");
        return marshaller;
    }

    @Bean
    @Qualifier("SoapConnectorNumberConversion")
    public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
        SoapConnector client = new SoapConnector();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}