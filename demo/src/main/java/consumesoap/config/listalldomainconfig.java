package consumesoap.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import consumesoap.classes.*;
import consumesoap.soapclient.stubs.*;
@Configuration
public class listalldomainconfig {
    @Bean
public Jaxb2Marshaller marshallerlistdoman()  {
Jaxb2Marshaller marshallerlistdoman = new Jaxb2Marshaller();
marshallerlistdoman.setContextPath("consumesoap.soapclient.stubs");
return marshallerlistdoman;
}
@Bean
public allofdomainsclient Connectorlistdomain(Jaxb2Marshaller marshallerlistdoman) {
    allofdomainsclient client = new allofdomainsclient();

    client.setDefaultUri("http://localhost:8080/gics/gicsService");
    client.setMarshaller(marshallerlistdoman);
    client.setUnmarshaller(marshallerlistdoman);
    return client;
}
    
    
}
