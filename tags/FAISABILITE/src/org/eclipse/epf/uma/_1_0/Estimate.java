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
 * A specific type of Guidance that provides sizing measures, or standards for sizing the work effort associated with performing a particular piece of work and instructions for their successful use. It may be comprised of estimation considerations and estimation metrics.
 * 
 * <p>Java class for Estimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Estimate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}Guidance">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="EstimationMetric" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstimationConsiderations" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estimate", propOrder = {
    "estimationMetricOrEstimationConsiderations"
})
public class Estimate
    extends Guidance
{

    @XmlElementRefs({
        @XmlElementRef(name = "EstimationConsiderations", type = JAXBElement.class),
        @XmlElementRef(name = "EstimationMetric", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> estimationMetricOrEstimationConsiderations;

    /**
     * Gets the value of the estimationMetricOrEstimationConsiderations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimationMetricOrEstimationConsiderations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimationMetricOrEstimationConsiderations().add(newItem);
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
    public List<JAXBElement<String>> getEstimationMetricOrEstimationConsiderations() {
        if (estimationMetricOrEstimationConsiderations == null) {
            estimationMetricOrEstimationConsiderations = new ArrayList<JAXBElement<String>>();
        }
        return this.estimationMetricOrEstimationConsiderations;
    }

}
