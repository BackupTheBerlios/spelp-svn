//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.27 at 03:11:12 PM CEST 
//


package org.eclipse.epf.uma._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A special Method Package that contains Content Elements and Content Elements, only.  Examples for Content Element are Artifacts, Tasks, Roles, etc.  A key separation of concerns in UMA is the distinction between Method Content and Process.  This separation is enforced by special package types, which do not allow the mixing of method content with processes.
 * 
 * <p>Java class for ContentPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentPackage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}MethodPackage">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ContentElement" type="{http://www.eclipse.org/epf/uma/1.0.3}ContentElement"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentPackage", propOrder = {
    "contentElement"
})
public class ContentPackage
    extends MethodPackage
{

    @XmlElement(name = "ContentElement", required = true)
    protected List<ContentElement> contentElement;

    /**
     * Gets the value of the contentElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentElement }
     * 
     * 
     */
    public List<ContentElement> getContentElement() {
        if (contentElement == null) {
            contentElement = new ArrayList<ContentElement>();
        }
        return this.contentElement;
    }

}
