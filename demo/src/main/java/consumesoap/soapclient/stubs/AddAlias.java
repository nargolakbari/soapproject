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
 * <p>Java class for addAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAlias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="originalSignerId" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signerIdDTO"/&gt;
 *         &lt;element name="aliasSignerId" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signerIdDTO"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAlias", propOrder = {
    "domainName",
    "originalSignerId",
    "aliasSignerId"
})
public class AddAlias {

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected SignerIdDTO originalSignerId;
    @XmlElement(required = true)
    protected SignerIdDTO aliasSignerId;

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
     * Gets the value of the originalSignerId property.
     * 
     * @return
     *     possible object is
     *     {@link SignerIdDTO }
     *     
     */
    public SignerIdDTO getOriginalSignerId() {
        return originalSignerId;
    }

    /**
     * Sets the value of the originalSignerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerIdDTO }
     *     
     */
    public void setOriginalSignerId(SignerIdDTO value) {
        this.originalSignerId = value;
    }

    /**
     * Gets the value of the aliasSignerId property.
     * 
     * @return
     *     possible object is
     *     {@link SignerIdDTO }
     *     
     */
    public SignerIdDTO getAliasSignerId() {
        return aliasSignerId;
    }

    /**
     * Sets the value of the aliasSignerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerIdDTO }
     *     
     */
    public void setAliasSignerId(SignerIdDTO value) {
        this.aliasSignerId = value;
    }

}
