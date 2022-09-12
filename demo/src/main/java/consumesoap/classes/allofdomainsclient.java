package consumesoap.classes;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import consumesoap.soapclient.stubs.ListDomainsResponse;

import javax.xml.bind.JAXBElement;
public class allofdomainsclient extends WebServiceGatewaySupport {
    public ListDomainsResponse getalldomain(String url, Object request)
    {
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (ListDomainsResponse) res.getValue();

    }
}
