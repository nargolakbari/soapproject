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
import consumesoap.soapclient.stubs.ListDomainsResponse.Return;
import consumesoap.config.*;


@RestController
@RequestMapping("/gics")
public class getdomaincontroller {

    @Autowired
    private domainclient client; 
    private allofdomainsclient listclient;
  
    @PostMapping("/getdomain")
     public DomainDTO showdomain(@RequestBody String dName){
        ObjectFactory objectFactory = new ObjectFactory();
        GetDomain type = new GetDomain();
        type.setDomainName(dName);
        

        GetDomainResponse response = client.getdomain("http://192.168.0.106:8085/gics/gicsService",
        objectFactory.createGetDomain(type));//.createGetBank(type));
        return response.getReturn();//

    }
   
    
}
