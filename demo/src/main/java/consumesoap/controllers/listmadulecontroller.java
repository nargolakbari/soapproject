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
import consumesoap.soapclient.stubs.ListModulesResponse;
import consumesoap.soapclient.stubs.ListModulesResponse.Return;
import consumesoap.config.*;
@RestController
@RequestMapping("/gics")
public class listmadulecontroller {

    @Autowired
    listmaduleclient client; 
    @PostMapping("/listmadules")
    public JAXBElement<Return> showmadules(@RequestBody String dName){
        ObjectFactory objectFactory = new ObjectFactory();
        ListModules type=new ListModules();
        type.setDomainName(dName);
        type.setOnlyFinal(true);
        ListModulesResponse response = client.getallmadulelist("http://192.168.0.106:8085/gics/gicsService", 
        objectFactory.createListModules(type));
        return response.getReturn();
        
} 
}
