package consumesoap.controllers;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import consumesoap.classes.*;
import consumesoap.soapclient.stubs.*;
import consumesoap.soapclient.stubs.ListPoliciesResponse;
import consumesoap.soapclient.stubs.ListPoliciesResponse.Return;
import consumesoap.config.*;

@RestController
@RequestMapping("/gics")
public class listpolicycontroller {
    @Autowired
    listpolicyclient client; 
    @PostMapping("/listpolicies")
    public JAXBElement<Return> showpolicies(@RequestBody String dName){
        ObjectFactory objectFactory = new ObjectFactory();
        ListPolicies type=new ListPolicies();
        type.setDomainName(dName);
        type.setOnlyFinal(true);
       
        ListPoliciesResponse response = client.getallpolicylist("http://localhost:8080/gics/gicsService", 
        objectFactory.createListPolicies(type));
        return response.getReturn();
        
} 

    
}
