//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.04 at 05:15:20 PM CET 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteConsentTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteConsentTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentTemplateKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}consentTemplateKeyDTO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteConsentTemplate", propOrder = {
    "consentTemplateKey"
})
public class DeleteConsentTemplate {

    @XmlElement(required = true)
    protected ConsentTemplateKeyDTO consentTemplateKey;

    /**
     * Gets the value of the consentTemplateKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentTemplateKeyDTO }
     *     
     */
    public ConsentTemplateKeyDTO getConsentTemplateKey() {
        return consentTemplateKey;
    }

    /**
     * Sets the value of the consentTemplateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentTemplateKeyDTO }
     *     
     */
    public void setConsentTemplateKey(ConsentTemplateKeyDTO value) {
        this.consentTemplateKey = value;
    }

}
