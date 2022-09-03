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
 * <p>Java class for getAllConsentedIdsFor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllConsentedIdsFor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signerIdTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "getAllConsentedIdsFor", propOrder = {
    "signerIdTypeName",
    "policyKey",
    "config"
})
public class GetAllConsentedIdsFor {

    @XmlElement(required = true)
    protected String signerIdTypeName;
    @XmlElement(required = true)
    protected PolicyKeyDTO policyKey;
    @XmlElement(required = true)
    protected CheckConsentConfig config;

    /**
     * Gets the value of the signerIdTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerIdTypeName() {
        return signerIdTypeName;
    }

    /**
     * Sets the value of the signerIdTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerIdTypeName(String value) {
        this.signerIdTypeName = value;
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
