//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.27 at 03:11:12 PM CEST 
//


package org.eclipse.epf.uma._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A specific type of Guidance which is only related to Activates and therefore has been added by this package to the list of Guidance Types rather than listed in the Guidance Types package.  A Roadmap represents a linear walkthrough of an Activity, typically a Process.
 * An instance of a Roadmap represents important documentation for the Activity or Process it is related to.  Often a complex Activity such as a Process can be much easier understood by providing a walkthrough with a linear thread of a typical instantiation of this Activity.  In addition to making the process practitioner understand how work in the process is being performed, a Roadmap provides additional information about how Activities and Tasks relate to each other over time.  Roadmaps are also used to show how specific aspects are distributed over a whole process providing a kind of filter on the process for this information.
 * 
 * <p>Java class for Roadmap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roadmap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.eclipse.org/epf/uma/1.0.3}Guidance">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roadmap")
public class Roadmap
    extends Guidance
{


}
