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
 * <p>Java class for updateModuleInUse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateModuleInUse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moduleKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}moduleKeyDTO"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shortText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="externProperties" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="assignedPolicies" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}assignedPolicyDTO" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModuleInUse", propOrder = {
    "moduleKey",
    "label",
    "shortText",
    "externProperties",
    "comment",
    "assignedPolicies"
})
public class UpdateModuleInUse {

    @XmlElement(required = true)
    protected ModuleKeyDTO moduleKey;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String shortText;
    @XmlElement(required = true)
    protected String externProperties;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected List<AssignedPolicyDTO> assignedPolicies;

    /**
     * Gets the value of the moduleKey property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleKeyDTO }
     *     
     */
    public ModuleKeyDTO getModuleKey() {
        return moduleKey;
    }

    /**
     * Sets the value of the moduleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleKeyDTO }
     *     
     */
    public void setModuleKey(ModuleKeyDTO value) {
        this.moduleKey = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the shortText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * Sets the value of the shortText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortText(String value) {
        this.shortText = value;
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
     * Gets the value of the assignedPolicies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedPolicies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedPolicyDTO }
     * 
     * 
     */
    public List<AssignedPolicyDTO> getAssignedPolicies() {
        if (assignedPolicies == null) {
            assignedPolicies = new ArrayList<AssignedPolicyDTO>();
        }
        return this.assignedPolicies;
    }

}
