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
public class getalldomainscontroller {
    @Autowired
    allofdomainsclient client; 
    @PostMapping("/getalldomains")
    public JAXBElement<Return> listalldom(){
        ObjectFactory objectFactory = new ObjectFactory();
        
        ListDomains value=new ListDomains();
        ListDomainsResponse response1= client.getalldomain("http://localhost:8080/gics/gicsService",
        objectFactory.createListDomains(value));
        return response1.getReturn();

    }
}
