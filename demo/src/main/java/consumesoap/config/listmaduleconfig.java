package consumesoap.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import consumesoap.classes.*;
import consumesoap.soapclient.stubs.*;
@Configuration
public class listmaduleconfig {
@Bean
public Jaxb2Marshaller marshaller1()  {
Jaxb2Marshaller marshaller1 = new Jaxb2Marshaller();
marshaller1.setContextPath("consumesoap.soapclient.stubs");
return marshaller1;
}
@Bean
public listmaduleclient Connector1(Jaxb2Marshaller marshaller1) {
    listmaduleclient client = new listmaduleclient();

    client.setDefaultUri("http://localhost:8080/gics/gicsService");
    client.setMarshaller(marshaller1);
    client.setUnmarshaller(marshaller1);
    return client;
}
}
