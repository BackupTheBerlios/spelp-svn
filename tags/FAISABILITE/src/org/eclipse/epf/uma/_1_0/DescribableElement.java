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


/**
 * An abstract generalization of Method Elements for which external presentation names as well as content descriptions have been defined, such as Roles or Work Products.  Presentation Name and Content Descriptions are typically localized using a resource allocation mechanism for its String type attributes.
 * This abstraction represents all elements in the Method Content as well as Process space for which concrete textual descriptions are defined in the form of documenting attributes grouped in a matching Content Description instance.  Describable Elements are intended to be published in method or process publications (similar to the IBM Rational Unified Process web).  Describable Element defines that the element it represents will have content 'attached' to it.  Content Description is the abstraction for the actual places in which the content is being represented.  This separation allows a distinction between core method model elements describing the structure of the model from the actual description container providing, for example, the documentation of the content element in different alternatives languages, audiences, licensing levels, etc.
 * 
 * <p>Java class for DescribableElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribableElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}MethodElement">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Presentation" type="{http://www.eclipse.org/epf/uma/1.0.3}ContentDescription"/>
 *       &lt;/choice>
 *       &lt;attribute name="nodeicon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="presentationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shapeicon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribableElement", propOrder = {
    "presentation"
})
public class DescribableElement
    extends MethodElement
{

    @XmlElement(name = "Presentation")
    protected ContentDescription presentation;
    @XmlAttribute
    protected String nodeicon;
    @XmlAttribute
    protected String presentationName;
    @XmlAttribute
    protected String shapeicon;

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link ContentDescription }
     *     
     */
    public ContentDescription getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentDescription }
     *     
     */
    public void setPresentation(ContentDescription value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the nodeicon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeicon() {
        return nodeicon;
    }

    /**
     * Sets the value of the nodeicon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeicon(String value) {
        this.nodeicon = value;
    }

    /**
     * Gets the value of the presentationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationName() {
        return presentationName;
    }

    /**
     * Sets the value of the presentationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationName(String value) {
        this.presentationName = value;
    }

    /**
     * Gets the value of the shapeicon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapeicon() {
        return shapeicon;
    }

    /**
     * Sets the value of the shapeicon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapeicon(String value) {
        this.shapeicon = value;
    }

}
