package consumesoap.classes;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import consumesoap.soapclient.stubs.GetDomainResponse;
import consumesoap.soapclient.stubs.ListModulesResponse;

import javax.xml.bind.JAXBElement;
public class listmaduleclient extends WebServiceGatewaySupport {
    public  ListModulesResponse getallmadulelist(String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (ListModulesResponse) res.getValue();
        }
}
//ListModulesResponse