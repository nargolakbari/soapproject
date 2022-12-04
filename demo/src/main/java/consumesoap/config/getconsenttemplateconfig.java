package consumesoap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import consumesoap.classes.*;
import consumesoap.soapclient.stubs.*;


@Configuration
public class getconsenttemplateconfig {
    @Bean
public Jaxb2Marshaller marshaller4()  {
Jaxb2Marshaller marshaller4 = new Jaxb2Marshaller();
marshaller4.setContextPath("consumesoap.soapclient.stubs");
return marshaller4;
}
@Bean
public getconsenttempclient getconsenttempclientConnector(Jaxb2Marshaller marshaller4) {
    getconsenttempclient client = new getconsenttempclient();
    
    client.setDefaultUri("http://192.168.0.106:8085/gics/gicsService");
    client.setMarshaller(marshaller4);
    client.setUnmarshaller(marshaller4);
    return client;
}
    
}
