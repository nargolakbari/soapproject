//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.03 at 03:49:31 PM CEST 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for consentScanDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consentScanDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cm2.ttp.ganimed.icmvc.emau.org/}fhirIdDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consentKey" type="{http://cm2.ttp.ganimed.icmvc.emau.org/}consentKeyDTO" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uploadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consentScanDTO", propOrder = {
    "base64",
    "consentKey",
    "fileName",
    "fileType",
    "uploadDate"
})
public class ConsentScanDTO
    extends FhirIdDTO
{

    protected String base64;
    protected ConsentKeyDTO consentKey;
    protected String fileName;
    protected String fileType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar uploadDate;

    /**
     * Gets the value of the base64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64() {
        return base64;
    }

    /**
     * Sets the value of the base64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64(String value) {
        this.base64 = value;
    }

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
     * Gets the value of the uploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUploadDate() {
        return uploadDate;
    }

    /**
     * Sets the value of the uploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUploadDate(XMLGregorianCalendar value) {
        this.uploadDate = value;
    }

}
