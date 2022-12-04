//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.04 at 05:15:20 PM CET 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fhirIdDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fhirIdDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fhirID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fhirIdDTO", propOrder = {
    "fhirID"
})
@XmlSeeAlso({
    SignerIdDTO.class,
    ConsentTemplateDTO.class,
    AssignedModuleDTO.class,
    ModuleDTO.class,
    AssignedPolicyDTO.class,
    PolicyDTO.class,
    FreeTextDefDTO.class,
    FileTypeDTO.class,
    SignerIdTypeDTO.class,
    SignedPolicyDTO.class,
    ConsentLightDTO.class,
    FreeTextValDTO.class,
    ConsentScanDTO.class,
    DomainDTO.class,
    Qcdto.class
})
public abstract class FhirIdDTO {

    protected String fhirID;

    /**
     * Gets the value of the fhirID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFhirID() {
        return fhirID;
    }

    /**
     * Sets the value of the fhirID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFhirID(String value) {
        this.fhirID = value;
    }

}
