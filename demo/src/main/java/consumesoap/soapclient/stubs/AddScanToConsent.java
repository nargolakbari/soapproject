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
 * <p>Java class for addScanToConsent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addScanToConsent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consentKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}consentKeyDTO"/&gt;
 *         &lt;element name="scanBase64" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addScanToConsent", propOrder = {
    "consentKey",
    "scanBase64",
    "fileType",
    "fileName"
})
public class AddScanToConsent {

    @XmlElement(required = true)
    protected ConsentKeyDTO consentKey;
    @XmlElement(required = true)
    protected String scanBase64;
    @XmlElement(required = true)
    protected String fileType;
    @XmlElement(required = true)
    protected String fileName;

    /**
     * Gets the value of the consentKey property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentKeyDTO }
     *     
     */
    public ConsentKeyDTO getConsentKey() {
        return consentKey;
    }

    /**
     * Sets the value of the consentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentKeyDTO }
     *     
     */
    public void setConsentKey(ConsentKeyDTO value) {
        this.consentKey = value;
    }

    /**
     * Gets the value of the scanBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanBase64() {
        return scanBase64;
    }

    /**
     * Sets the value of the scanBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanBase64(String value) {
        this.scanBase64 = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
