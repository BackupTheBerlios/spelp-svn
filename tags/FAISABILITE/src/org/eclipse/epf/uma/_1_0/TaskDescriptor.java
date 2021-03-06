//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.27 at 03:11:12 PM CEST 
//


package org.eclipse.epf.uma._1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A special Descriptor that represents a proxy for a Task in the context of one specific Activity.  Every breakdown structure can define different relationships of Task Descriptors to Work Product Descriptors and Role Descriptors. Therefore one Task can be represented by many Task Descriptors each within the context of an Activity with its own set of relationships.
 * A key difference between Method Content and Process is that a Content Element such as Task describes all aspects of doing work defined around this Task.  This description is managed in steps, which are modeled as Sections of the Tasks' Content Descriptions.  When applying a Task in a Process' Activity with a Task Descriptor a Process Engineer needs to indicate that at that particular point in time in the Process definition for which the Task Descriptor has been created, only a subset of steps shall be performed.  He defines this selection using the selectedSteps association.  If he wants to add steps to a Task Descriptor, he can describe these either pragmatically in the refinedDescription attribute or 'properly' create a contributing Task to the Task the Task Descriptor refers to.
 * 
 * 
 * <p>Java class for TaskDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}WorkBreakdownElement">
 *       &lt;sequence>
 *         &lt;element name="Task" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerformedPrimarilyBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="AdditionallyPerformedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="AssistedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="ExternalInput" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="MandatoryInput" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="OptionalInput" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Output" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="Step" type="{http://www.eclipse.org/epf/uma/1.0.3}Section" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isSynchronizedWithSource" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDescriptor", propOrder = {
    "task",
    "performedPrimarilyBy",
    "additionallyPerformedByOrAssistedByOrExternalInput",
    "step"
})
public class TaskDescriptor
    extends WorkBreakdownElement
{

    @XmlElement(name = "Task")
    protected String task;
    @XmlElement(name = "PerformedPrimarilyBy")
    protected String performedPrimarilyBy;
    @XmlElementRefs({
        @XmlElementRef(name = "Output", type = JAXBElement.class),
        @XmlElementRef(name = "AdditionallyPerformedBy", type = JAXBElement.class),
        @XmlElementRef(name = "ExternalInput", type = JAXBElement.class),
        @XmlElementRef(name = "OptionalInput", type = JAXBElement.class),
        @XmlElementRef(name = "AssistedBy", type = JAXBElement.class),
        @XmlElementRef(name = "MandatoryInput", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> additionallyPerformedByOrAssistedByOrExternalInput;
    @XmlElement(name = "Step", required = true)
    protected List<Section> step;
    @XmlAttribute
    protected Boolean isSynchronizedWithSource;

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTask(String value) {
        this.task = value;
    }

    /**
     * Gets the value of the performedPrimarilyBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformedPrimarilyBy() {
        return performedPrimarilyBy;
    }

    /**
     * Sets the value of the performedPrimarilyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformedPrimarilyBy(String value) {
        this.performedPrimarilyBy = value;
    }

    /**
     * Gets the value of the additionallyPerformedByOrAssistedByOrExternalInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionallyPerformedByOrAssistedByOrExternalInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionallyPerformedByOrAssistedByOrExternalInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getAdditionallyPerformedByOrAssistedByOrExternalInput() {
        if (additionallyPerformedByOrAssistedByOrExternalInput == null) {
            additionallyPerformedByOrAssistedByOrExternalInput = new ArrayList<JAXBElement<String>>();
        }
        return this.additionallyPerformedByOrAssistedByOrExternalInput;
    }

    /**
     * Gets the value of the step property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the step property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section }
     * 
     * 
     */
    public List<Section> getStep() {
        if (step == null) {
            step = new ArrayList<Section>();
        }
        return this.step;
    }

    /**
     * Gets the value of the isSynchronizedWithSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSynchronizedWithSource() {
        return isSynchronizedWithSource;
    }

    /**
     * Sets the value of the isSynchronizedWithSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSynchronizedWithSource(Boolean value) {
        this.isSynchronizedWithSource = value;
    }

}
