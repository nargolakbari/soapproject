package consumesoap.classes;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import consumesoap.soapclient.stubs.GetConsentTemplateResponse;
import javax.xml.bind.JAXBElement;
public class getconsenttempclient extends WebServiceGatewaySupport {
    public  GetConsentTemplateResponse getconsenttemplate(String url, Object request){
        JAXBElement res2 = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (GetConsentTemplateResponse) res2.getValue();
    
}
}






