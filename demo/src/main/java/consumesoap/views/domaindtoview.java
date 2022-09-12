package consumesoap.views;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
public class domaindtoview {
    public domaindtoview() {
 
    }

    public domaindtoview(String comment, String ctVersionConverter,  boolean finalised, 
    String label, String logo, String moduleVersionConverter, String name,String policyVersionConverter,String properties, List<String> signerIdTypes) {
        super();
        this.comment = comment;
        this.ctVersionConverter = ctVersionConverter;
        this.finalised = finalised;
        this.label = label;
        this.logo = logo;
        this.moduleVersionConverter = moduleVersionConverter;
        this.name = name;
        this.policyVersionConverter = policyVersionConverter;
        this.properties = properties;
        this.signerIdTypes = signerIdTypes;

    }
  
    protected String comment;
    protected String ctVersionConverter;
    protected boolean finalised;
    protected String label;
    protected String logo;
    protected String moduleVersionConverter;
    protected String name;
    protected String policyVersionConverter;
    protected String properties;
    protected List<String> signerIdTypes;
    
}
/*
 * 
 *  protected String comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String ctVersionConverter;
    protected ExpirationPropertiesDTO expirationProperties;
    protected String externProperties;
    protected boolean finalised;
    protected String label;
    protected String logo;
    protected String moduleVersionConverter;
    protected String name;
    protected String policyVersionConverter;
    protected String properties;
    @XmlElement(nillable = true)
    protected List<String> signerIdTypes;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
 */