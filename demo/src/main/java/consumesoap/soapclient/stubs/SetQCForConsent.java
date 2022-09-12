//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.12 at 08:19:09 AM CEST 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setQCForConsent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setQCForConsent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}consentKeyDTO"/&gt;
 *         &lt;element name="qc" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}qcdto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setQCForConsent", propOrder = {
    "consentKey",
    "qc"
})
public class SetQCForConsent {

    @XmlElement(required = true)
    protected ConsentKeyDTO consentKey;
    @XmlElement(required = true)
    protected Qcdto qc;

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

    /**
     * Gets the value of the qc property.
     * 
     * @return
     *     possible object is
     *     {@link Qcdto }
     *     
     */
    public Qcdto getQc() {
        return qc;
    }

    /**
     * Sets the value of the qc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Qcdto }
     *     
     */
    public void setQc(Qcdto value) {
        this.qc = value;
    }

}
