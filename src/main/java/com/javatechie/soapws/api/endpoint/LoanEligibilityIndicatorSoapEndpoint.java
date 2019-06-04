package com.javatechie.soapws.api.endpoint;

import com.javatechie.soapws.api.Acknowledgement;
import com.javatechie.soapws.api.CustomerRequest;
import com.javatechie.soapws.api.service.LoanEligibilityIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEligibilityIndicatorSoapEndpoint {

    private static final String NAMESPACE_URI = "http://www.javatechie.com/soapws/api";

    @Autowired
    private LoanEligibilityIndicatorService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement checkLoanEligibility(@RequestPayload CustomerRequest request){
        return service.checkEligibility(request);
    }
}
