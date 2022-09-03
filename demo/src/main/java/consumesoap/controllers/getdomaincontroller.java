package consumesoap.controllers;
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
import consumesoap.config.*;


@RestController
@RequestMapping("/gics")
public class getdomaincontroller {

    @Autowired
    private domainclient client; 
    @PostMapping("/getdomain")
     public DomainDTO sum(@RequestBody String dName){
        ObjectFactory objectFactory = new ObjectFactory();
        GetDomain type = new GetDomain();
        type.setDomainName(dName);

        GetDomainResponse response = client.getdomain("http://localhost:8080/gics/gicsService",
        objectFactory.createGetDomain(type));//.createGetBank(type));
        return response.getReturn();

    }
    
}
