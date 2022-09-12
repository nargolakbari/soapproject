//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.12 at 08:19:09 AM CEST 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedPolicyDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignedPolicyDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cm2.ttp.ganimed.icmvc.emau.org/}fhirIdDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationProperties" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}expirationPropertiesDTO" minOccurs="0"/&gt;
 *         &lt;element name="externProperties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policy" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}policyDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignedPolicyDTO", propOrder = {
    "comment",
    "expirationProperties",
    "externProperties",
    "policy"
})
public class AssignedPolicyDTO
    extends FhirIdDTO
{

    protected String comment;
    protected ExpirationPropertiesDTO expirationProperties;
    protected String externProperties;
    protected PolicyDTO policy;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the expirationProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationPropertiesDTO }
     *     
     */
    public ExpirationPropertiesDTO getExpirationProperties() {
        return expirationProperties;
    }

    /**
     * Sets the value of the expirationProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationPropertiesDTO }
     *     
     */
    public void setExpirationProperties(ExpirationPropertiesDTO value) {
        this.expirationProperties = value;
    }

    /**
     * Gets the value of the externProperties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternProperties() {
        return externProperties;
    }

    /**
     * Sets the value of the externProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternProperties(String value) {
        this.externProperties = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDTO }
     *     
     */
    public PolicyDTO getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDTO }
     *     
     */
    public void setPolicy(PolicyDTO value) {
        this.policy = value;
    }

}
