//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.6 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.03 at 03:49:31 PM CEST 
//


package consumesoap.soapclient.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeTextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="freeTextType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="INTEGER"/&gt;
 *     &lt;enumeration value="DOUBLE"/&gt;
 *     &lt;enumeration value="BOOLEAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "freeTextType")
@XmlEnum
public enum FreeTextType {

    STRING,
    DATE,
    INTEGER,
    DOUBLE,
    BOOLEAN;

    public String value() {
        return name();
    }

    public static FreeTextType fromValue(String v) {
        return valueOf(v);
    }

}