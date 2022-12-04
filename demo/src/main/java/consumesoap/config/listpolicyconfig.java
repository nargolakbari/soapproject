package consumesoap.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import consumesoap.classes.*;
import consumesoap.soapclient.stubs.*;
@Configuration
public class listpolicyconfig {
@Bean
public Jaxb2Marshaller marshaller2()  {
Jaxb2Marshaller marshaller2 = new Jaxb2Marshaller();
marshaller2.setContextPath("consumesoap.soapclient.stubs");
return marshaller2;
}
@Bean
public listpolicyclient listpolicyConnector(Jaxb2Marshaller marshaller2) {
    listpolicyclient client = new listpolicyclient();

    client.setDefaultUri("http://localhost:8080/gics/gicsService");
    client.setMarshaller(marshaller2);
    client.setUnmarshaller(marshaller2);
    return client;
}
    
}
