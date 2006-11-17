//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.27 at 03:11:12 PM CEST 
//


package org.eclipse.epf.uma._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A generalized Process Description that is used to store the textual description for a Delivery Process.
 * 
 * <p>Java class for DeliveryProcessDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryProcessDescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}ProcessDescription">
 *       &lt;sequence>
 *         &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectCharacteristics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatingTechnique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectMemberExpertise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryProcessDescription", propOrder = {
    "scale",
    "projectCharacteristics",
    "riskLevel",
    "estimatingTechnique",
    "projectMemberExpertise",
    "typeOfContract"
})
public class DeliveryProcessDescription
    extends ProcessDescription
{

    @XmlElement(name = "Scale")
    protected String scale;
    @XmlElement(name = "ProjectCharacteristics")
    protected String projectCharacteristics;
    @XmlElement(name = "RiskLevel")
    protected String riskLevel;
    @XmlElement(name = "EstimatingTechnique")
    protected String estimatingTechnique;
    @XmlElement(name = "ProjectMemberExpertise")
    protected String projectMemberExpertise;
    @XmlElement(name = "TypeOfContract")
    protected String typeOfContract;

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Gets the value of the projectCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCharacteristics() {
        return projectCharacteristics;
    }

    /**
     * Sets the value of the projectCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCharacteristics(String value) {
        this.projectCharacteristics = value;
    }

    /**
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevel(String value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the estimatingTechnique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatingTechnique() {
        return estimatingTechnique;
    }

    /**
     * Sets the value of the estimatingTechnique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatingTechnique(String value) {
        this.estimatingTechnique = value;
    }

    /**
     * Gets the value of the projectMemberExpertise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectMemberExpertise() {
        return projectMemberExpertise;
    }

    /**
     * Sets the value of the projectMemberExpertise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectMemberExpertise(String value) {
        this.projectMemberExpertise = value;
    }

    /**
     * Gets the value of the typeOfContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfContract() {
        return typeOfContract;
    }

    /**
     * Sets the value of the typeOfContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfContract(String value) {
        this.typeOfContract = value;
    }

}
