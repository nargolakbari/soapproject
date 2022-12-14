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
 * <p>Java class for getConsentStatusTypeFromIncludingToIncluding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConsentStatusTypeFromIncludingToIncluding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="signerIds" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signerIdDTO" maxOccurs="unbounded"/&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="versionFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="versionTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "getConsentStatusTypeFromIncludingToIncluding", propOrder = {
    "signerIds",
    "domainName",
    "policyName",
    "versionFrom",
    "versionTo",
    "config"
})
public class GetConsentStatusTypeFromIncludingToIncluding {

    @XmlElement(required = true)
    protected List<SignerIdDTO> signerIds;
    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected String policyName;
    @XmlElement(required = true)
    protected String versionFrom;
    @XmlElement(required = true)
    protected String versionTo;
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
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the versionFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionFrom() {
        return versionFrom;
    }

    /**
     * Sets the value of the versionFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionFrom(String value) {
        this.versionFrom = value;
    }

    /**
     * Gets the value of the versionTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionTo() {
        return versionTo;
    }

    /**
     * Sets the value of the versionTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionTo(String value) {
        this.versionTo = value;
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
