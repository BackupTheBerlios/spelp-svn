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
 * A categorization of work (i.e. Tasks for Method Content), based upon similarity of concerns and cooperation of work effort.
 * A discipline is a collection of Tasks that are related to a major 'area of concern' within the overall project. The grouping of Tasks into disciplines is mainly an aid to understanding the project from a 'traditional' waterfall perspective. However, typically, for example, it is more common to perform certain requirements activities in close coordination with analysis and design activities. Separating these activities into separate disciplines makes the activities easier to comprehend.
 * 
 * <p>Java class for Discipline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discipline">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}ContentCategory">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Task" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubDiscipline" type="{http://www.eclipse.org/epf/uma/1.0.3}Discipline"/>
 *         &lt;element name="ReferenceWorkflow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discipline", propOrder = {
    "taskOrSubDisciplineOrReferenceWorkflow"
})
public class Discipline
    extends ContentCategory
{

    @XmlElementRefs({
        @XmlElementRef(name = "ReferenceWorkflow", type = JAXBElement.class),
        @XmlElementRef(name = "Task", type = JAXBElement.class),
        @XmlElementRef(name = "SubDiscipline", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> taskOrSubDisciplineOrReferenceWorkflow;

    /**
     * Gets the value of the taskOrSubDisciplineOrReferenceWorkflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskOrSubDisciplineOrReferenceWorkflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskOrSubDisciplineOrReferenceWorkflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Discipline }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTaskOrSubDisciplineOrReferenceWorkflow() {
        if (taskOrSubDisciplineOrReferenceWorkflow == null) {
            taskOrSubDisciplineOrReferenceWorkflow = new ArrayList<JAXBElement<?>>();
        }
        return this.taskOrSubDisciplineOrReferenceWorkflow;
    }

}
