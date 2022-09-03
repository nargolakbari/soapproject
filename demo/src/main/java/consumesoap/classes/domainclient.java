package consumesoap.classes;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import consumesoap.soapclient.stubs.GetDomainResponse;
import javax.xml.bind.JAXBElement;
public class domainclient extends WebServiceGatewaySupport{
    public  GetDomainResponse getdomain(String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (GetDomainResponse) res.getValue();
        }

}
