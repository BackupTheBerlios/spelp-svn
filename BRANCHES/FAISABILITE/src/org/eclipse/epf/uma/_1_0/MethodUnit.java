//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.27 at 03:11:12 PM CEST 
//


package org.eclipse.epf.uma._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A special Method Element that shall be maintained in a Method Library as a separate unit of control.
 * 
 * <p>Java class for MethodUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodUnit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}MethodElement">
 *       &lt;sequence>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="authors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="changeDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodUnit", propOrder = {
    "copyright"
})
public class MethodUnit
    extends MethodElement
{

    @XmlElement(name = "Copyright")
    protected String copyright;
    @XmlAttribute
    protected String authors;
    @XmlAttribute
    protected XMLGregorianCalendar changeDate;
    @XmlAttribute
    protected String changeDescription;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthors(String value) {
        this.authors = value;
    }

    /**
     * Gets the value of the changeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Gets the value of the changeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeDescription() {
        return changeDescription;
    }

    /**
     * Sets the value of the changeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeDescription(String value) {
        this.changeDescription = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
