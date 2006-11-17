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
 * A Breakdown Element that groups Role Descriptors or Resource Definitions defining a nested hierarchy of teams and team members.
 * Work assignments and Work Product responsibilities can be different from Activity to Activity in a development project. Different phases require different staffing profiles, i.e. different skills and resources doing different types of work.  Therefore, a process needs to define such different profiles in a flexible manner.  Whereas Core Method Content defines standard responsibilities and assignments, a process express by a breakdown structures needs to be able refine and redefine these throughout its definition.  Role Descriptors, Resource Definitions, as well as Team Profiles provide the data structure necessary to achieve this flexibility and to provide a process user with the capability to define different teams and role relationships for every Activity (including Activities on any nesting-level as well as Iterations or Phases).
 * Hence, in addition to the work breakdown and work product breakdown structures defined so far, Team Profiles are used to define a third type of breakdown structure: team breakdown structures.  These are created as an Activity specific hierarchy of Team Profiles comprising of Role Descriptors and Resource Definitions.  These structures can be presented as well-known Org-Charts.  Just as with any other Breakdown Element and Descriptors, Team Profiles can be defined within the scope of any Activity in a breakdown structure.  In other words every Activity can define its own Team Profiles consisting of Activity specific Role Descriptors and Resource Definitions.  Typically, Team Profiles are defined on the level of Iterations or Phases or other higher-level Activity.
 * 
 * <p>Java class for TeamProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeamProfile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}BreakdownElement">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SuperTeam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubTeam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamProfile", propOrder = {
    "roleOrSuperTeamOrSubTeam"
})
public class TeamProfile
    extends BreakdownElement
{

    @XmlElementRefs({
        @XmlElementRef(name = "SubTeam", type = JAXBElement.class),
        @XmlElementRef(name = "SuperTeam", type = JAXBElement.class),
        @XmlElementRef(name = "Role", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> roleOrSuperTeamOrSubTeam;

    /**
     * Gets the value of the roleOrSuperTeamOrSubTeam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleOrSuperTeamOrSubTeam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleOrSuperTeamOrSubTeam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getRoleOrSuperTeamOrSubTeam() {
        if (roleOrSuperTeamOrSubTeam == null) {
            roleOrSuperTeamOrSubTeam = new ArrayList<JAXBElement<String>>();
        }
        return this.roleOrSuperTeamOrSubTeam;
    }

}
