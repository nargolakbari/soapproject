package consumesoap.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import consumesoap.classes.*;
import consumesoap.classes.domainclient;
import consumesoap.soapclient.stubs.*;
import consumesoap.config.*;
@Configuration
public class domainconfig {
@Bean
public Jaxb2Marshaller marshaller()  {
Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
marshaller.setContextPath("consumesoap.soapclient.stubs");
return marshaller;
}

@Bean
public domainclient soapConnector(Jaxb2Marshaller marshaller) {
    domainclient client = new domainclient();

    client.setDefaultUri("http://localhost:8080/gics/gicsService");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
}



}
