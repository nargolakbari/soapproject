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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import consumesoap.classes.*;
import consumesoap.soapclient.stubs.*;
import consumesoap.soapclient.stubs.ListPoliciesResponse.Return;
import consumesoap.config.*;
@RestController
//@RequestMapping("/gics")
public class getconsenttempcontroller {
    @Autowired
    private getconsenttempclient client2;
   @PostMapping("/gics/getconsenttemp")
  
    public ConsentTemplateDTO showcosenttemp(){//} (@RequestBody ConsentTemplateKeyDTO mykey){//String dName, @RequestBody String tname, @RequestBody String tversion){
       ObjectFactory objectFactory = new ObjectFactory();
       ConsentTemplateKeyDTO mykey= new ConsentTemplateKeyDTO();
       //mykey.setDomainName(dName);
      // mykey.setName(tname);
      // mykey.setVersion(tversion);

       mykey.setDomainName("domain003");
       mykey.setName("customer event");
       mykey.setVersion("1.0");
       GetConsentTemplate type= new GetConsentTemplate(); 
       type.setConsentTemplateKey(mykey);
       GetConsentTemplateResponse response1 = client2.getconsenttemplate("http://192.168.0.106:8085/gics/gicsService",
        objectFactory.createGetConsentTemplate(type));//.createGetBank(type));
        return response1.getReturn();

    }
    
}


