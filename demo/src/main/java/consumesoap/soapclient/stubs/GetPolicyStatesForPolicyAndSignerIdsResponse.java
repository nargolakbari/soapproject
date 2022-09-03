//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.03 at 03:49:31 PM CEST 
//


package consumesoap.soapclient.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPolicyStatesForPolicyAndSignerIdsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPolicyStatesForPolicyAndSignerIdsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="signedPolicies" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signedPolicyDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPolicyStatesForPolicyAndSignerIdsResponse", propOrder = {
    "_return"
})
public class GetPolicyStatesForPolicyAndSignerIdsResponse {

    @XmlElementRef(name = "return", type = JAXBElement.class, required = false)
    protected JAXBElement<GetPolicyStatesForPolicyAndSignerIdsResponse.Return> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetPolicyStatesForPolicyAndSignerIdsResponse.Return }{@code >}
     *     
     */
    public JAXBElement<GetPolicyStatesForPolicyAndSignerIdsResponse.Return> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetPolicyStatesForPolicyAndSignerIdsResponse.Return }{@code >}
     *     
     */
    public void setReturn(JAXBElement<GetPolicyStatesForPolicyAndSignerIdsResponse.Return> value) {
        this._return = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="signedPolicies" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}signedPolicyDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "signedPolicies"
    })
    public static class Return {

        protected List<SignedPolicyDTO> signedPolicies;

        /**
         * Gets the value of the signedPolicies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedPolicies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSignedPolicies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SignedPolicyDTO }
         * 
         * 
         */
        public List<SignedPolicyDTO> getSignedPolicies() {
            if (signedPolicies == null) {
                signedPolicies = new ArrayList<SignedPolicyDTO>();
            }
            return this.signedPolicies;
        }

    }

}