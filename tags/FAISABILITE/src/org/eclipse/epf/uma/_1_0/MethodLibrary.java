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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Method Library is a physical container for Method Plugins and Method Configuration definitions.  All Method Elements are stored in a Method Library.
 * 
 * <p>Java class for MethodLibrary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodLibrary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}MethodUnit">
 *       &lt;sequence>
 *         &lt;element name="MethodPlugin" type="{http://www.eclipse.org/epf/uma/1.0.3}MethodPlugin" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MethodConfiguration" type="{http://www.eclipse.org/epf/uma/1.0.3}MethodConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tool" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodLibrary", propOrder = {
    "methodPlugin",
    "methodConfiguration"
})
public class MethodLibrary
    extends MethodUnit
{

    @XmlElement(name = "MethodPlugin", required = true)
    protected List<MethodPlugin> methodPlugin;
    @XmlElement(name = "MethodConfiguration", required = true)
    protected List<MethodConfiguration> methodConfiguration;
    @XmlAttribute
    protected String tool;

    /**
     * Gets the value of the methodPlugin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodPlugin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodPlugin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodPlugin }
     * 
     * 
     */
    public List<MethodPlugin> getMethodPlugin() {
        if (methodPlugin == null) {
            methodPlugin = new ArrayList<MethodPlugin>();
        }
        return this.methodPlugin;
    }

    /**
     * Gets the value of the methodConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodConfiguration }
     * 
     * 
     */
    public List<MethodConfiguration> getMethodConfiguration() {
        if (methodConfiguration == null) {
            methodConfiguration = new ArrayList<MethodConfiguration>();
        }
        return this.methodConfiguration;
    }

    /**
     * Gets the value of the tool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTool() {
        return tool;
    }

    /**
     * Sets the value of the tool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTool(String value) {
        this.tool = value;
    }

}
