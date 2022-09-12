//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.12 at 08:19:09 AM CEST 
//


package consumesoap.soapclient.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refuseConsent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refuseConsent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentTemplateKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}consentTemplateKeyDTO"/&gt;
 *         &lt;element name="signerIds" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signerIdDTO" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refuseConsent", propOrder = {
    "consentTemplateKey",
    "signerIds"
})
public class RefuseConsent {

    @XmlElement(required = true)
    protected ConsentTemplateKeyDTO consentTemplateKey;
    @XmlElement(required = true)
    protected List<SignerIdDTO> signerIds;

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

    /**
     * Gets the value of the signerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignerIdDTO }
     * 
     * 
     */
    public List<SignerIdDTO> getSignerIds() {
        if (signerIds == null) {
            signerIds = new ArrayList<SignerIdDTO>();
        }
        return this.signerIds;
    }

}
