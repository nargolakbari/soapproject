//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.03 at 03:49:31 PM CEST 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getConsentDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConsentDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}consentKeyDTO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsentDates", propOrder = {
    "consentKey"
})
public class GetConsentDates {

    @XmlElement(required = true)
    protected ConsentKeyDTO consentKey;

    /**
     * Gets the value of the consentKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentKeyDTO }
     *     
     */
    public ConsentKeyDTO getConsentKey() {
        return consentKey;
    }

    /**
     * Sets the value of the consentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentKeyDTO }
     *     
     */
    public void setConsentKey(ConsentKeyDTO value) {
        this.consentKey = value;
    }

}