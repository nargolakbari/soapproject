package consumesoap.classes;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import consumesoap.soapclient.stubs.ListPoliciesResponse;

import javax.xml.bind.JAXBElement;
public class listpolicyclient extends WebServiceGatewaySupport {
    public  ListPoliciesResponse getallpolicylist(String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (ListPoliciesResponse) res.getValue();
        }
}
