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
 * A special Activity that describes a structure for particular types of development projects.  To perform such a development project a Processes would be 'instantiated' and adapted for the specific situation.  Process is an abstract class and this meta-model defines different special types of Processes for different process management applications and different situations of process reuse.  Every Process comprises of and is the top-level element of an n-level breakdown structure using the Nesting association defined on Activity.
 * Core Method Content provides step-by-step explanations, describing how very specific development goals are achieved independent of the placement of these steps within a development lifecycle.  Processes take these method elements and relate them into semi-ordered sequences that are customized to specific types of projects.  Thus, a process is a set of partially ordered work descriptions intended to reach a higher development goal, such as the release of a specific software system.  A process and the process meta-model structure defined in this specification focuses on the lifecycle and the sequencing of work in breakdown structures.  To achieve this it uses the Descriptor concept referencing method content and allowing defining time-specific customizations of the referenced content (e.g. defining a focus on different steps of the same Task and providing input Work Products in different states within the different Phases of a process lifecycle in which the same Task is performed).
 * 
 * <p>Java class for Process complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Process">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}Activity">
 *       &lt;sequence>
 *         &lt;element name="IncludesPattern" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidContext" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Process", propOrder = {
    "includesPattern",
    "defaultContext",
    "validContext"
})
public class Process
    extends Activity
{

    @XmlElement(name = "IncludesPattern", required = true)
    protected List<String> includesPattern;
    @XmlElement(name = "DefaultContext")
    protected String defaultContext;
    @XmlElement(name = "ValidContext", required = true)
    protected List<String> validContext;

    /**
     * Gets the value of the includesPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludesPattern() {
        if (includesPattern == null) {
            includesPattern = new ArrayList<String>();
        }
        return this.includesPattern;
    }

    /**
     * Gets the value of the defaultContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContext() {
        return defaultContext;
    }

    /**
     * Sets the value of the defaultContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContext(String value) {
        this.defaultContext = value;
    }

    /**
     * Gets the value of the validContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValidContext() {
        if (validContext == null) {
            validContext = new ArrayList<String>();
        }
        return this.validContext;
    }

}