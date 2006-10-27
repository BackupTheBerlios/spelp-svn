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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A special Process describing a complete and integrated approach for performing a specific project type.  It describes a complete project lifecycle end-to-end and shall be used as a reference for running projects with similar characteristics as defined for the process.  A Delivery Process is related to specific supporting information such as Roadmaps (inherited via Activity) as well as Communications and Education Material.
 * A Delivery Process is a Process that covers a whole development lifecycle from beginning to end.  A Delivery Process shall be used as a template for planning and running a project.  It provides a complete lifecycle model with predefined phases, iterations, and activities that have been detailed by sequencing referencing method content in breakdown structures.  It is defined on the basis of experience with past projects or engagements, and/or the best practice use of a development or delivery approach.  It defines what gets produced, how those items are produced, and the required staffing in the form of integrated Work, Work Product, and Team Breakdown Structures.  For example, a process engineer can define alternative Delivery Processes for software development projects that differ in the scale of the engagement and staffing necessary, the type of the software application to be developed, the development methods and technologies to be used, etc.  Although, the Delivery Process aims to cover a whole project it keeps certain decision that are too project specific open.  For example, the breakdown structure defines which Breakdown Elements have multiple occurrences or is repeatable via it respective attributes, but does not say how many occurrences and how many repeats/iterations it will have.  These decisions have to be done by a project manager when planning a concrete project, project phase, or project iterations.  A Delivery Process is always a complete description of a process in terms of completeness of the lifecycle, as well as in terms of all three views on the process which are the Work Breakdown Structure, Work Product Breakdown Structure, and Team Breakdown Structure have to be fully and consistently populated.  Consistency of a Delivery Process is actually ensured by the fact that all three breakdowns are represented by one single data structure and one particular breakdown such as Team Breakdown is just a view on that data structure.
 * 
 * <p>Java class for DeliveryProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}Process">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="CommunicationsMaterial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EducationMaterial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryProcess", propOrder = {
    "communicationsMaterialOrEducationMaterial"
})
public class DeliveryProcess
    extends Process
{

    @XmlElementRefs({
        @XmlElementRef(name = "EducationMaterial", type = JAXBElement.class),
        @XmlElementRef(name = "CommunicationsMaterial", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> communicationsMaterialOrEducationMaterial;

    /**
     * Gets the value of the communicationsMaterialOrEducationMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationsMaterialOrEducationMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationsMaterialOrEducationMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getCommunicationsMaterialOrEducationMaterial() {
        if (communicationsMaterialOrEducationMaterial == null) {
            communicationsMaterialOrEducationMaterial = new ArrayList<JAXBElement<String>>();
        }
        return this.communicationsMaterialOrEducationMaterial;
    }

}