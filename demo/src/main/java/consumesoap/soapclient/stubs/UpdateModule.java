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
 * <p>Java class for updateModule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateModule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="module" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}moduleDTO"/&gt;
 *         &lt;element name="finaliseRelatedEntities" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModule", propOrder = {
    "module",
    "finaliseRelatedEntities"
})
public class UpdateModule {

    @XmlElement(required = true)
    protected ModuleDTO module;
    protected boolean finaliseRelatedEntities;

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleDTO }
     *     
     */
    public ModuleDTO getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleDTO }
     *     
     */
    public void setModule(ModuleDTO value) {
        this.module = value;
    }

    /**
     * Gets the value of the finaliseRelatedEntities property.
     * 
     */
    public boolean isFinaliseRelatedEntities() {
        return finaliseRelatedEntities;
    }

    /**
     * Sets the value of the finaliseRelatedEntities property.
     * 
     */
    public void setFinaliseRelatedEntities(boolean value) {
        this.finaliseRelatedEntities = value;
    }

}
