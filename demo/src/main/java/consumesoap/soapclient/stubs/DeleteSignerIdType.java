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
 * <p>Java class for deleteSignerIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSignerIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="signerIdTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSignerIdType", propOrder = {
    "domainName",
    "signerIdTypeName"
})
public class DeleteSignerIdType {

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected String signerIdTypeName;

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

}
