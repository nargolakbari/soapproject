//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.04 at 05:15:20 PM CET 
//


package consumesoap.soapclient.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getConsentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConsentStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signerIds" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signerIdDTO" maxOccurs="unbounded"/&gt;
 *         &lt;element name="policyKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}policyKeyDTO"/&gt;
 *         &lt;element name="config" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}checkConsentConfig"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsentStatusType", propOrder = {
    "signerIds",
    "policyKey",
    "config"
})
public class GetConsentStatusType {

    @XmlElement(required = true)
    protected List<SignerIdDTO> signerIds;
    @XmlElement(required = true)
    protected PolicyKeyDTO policyKey;
    @XmlElement(required = true)
    protected CheckConsentConfig config;

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

    /**
     * Gets the value of the policyKey property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyKeyDTO }
     *     
     */
    public PolicyKeyDTO getPolicyKey() {
        return policyKey;
    }

    /**
     * Sets the value of the policyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyKeyDTO }
     *     
     */
    public void setPolicyKey(PolicyKeyDTO value) {
        this.policyKey = value;
    }

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link CheckConsentConfig }
     *     
     */
    public CheckConsentConfig getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConsentConfig }
     *     
     */
    public void setConfig(CheckConsentConfig value) {
        this.config = value;
    }

}
