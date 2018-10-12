
package com.hdr.ws.stubs.customeObject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conjunction" type="{http://xmlns.oracle.com/adf/svc/types/}Conjunction" minOccurs="0"/>
 *         &lt;element name="group" type="{http://xmlns.oracle.com/adf/svc/types/}ViewCriteriaRow" maxOccurs="unbounded"/>
 *         &lt;element name="nested" type="{http://xmlns.oracle.com/adf/svc/types/}ViewCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewCriteria", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "conjunction",
    "groups",
    "nesteds"
})
public class ViewCriteria {

    protected Conjunction conjunction;
    @XmlElement(name = "group", required = true)
    protected List<ViewCriteriaRow> groups;
    @XmlElement(name = "nested")
    protected List<ViewCriteria> nesteds;

    /**
     * Gets the value of the conjunction property.
     * 
     * @return
     *     possible object is
     *     {@link Conjunction }
     *     
     */
    public Conjunction getConjunction() {
        return conjunction;
    }

    /**
     * Sets the value of the conjunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conjunction }
     *     
     */
    public void setConjunction(Conjunction value) {
        this.conjunction = value;
    }

    /**
     * Gets the value of the groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewCriteriaRow }
     * 
     * 
     */
    public List<ViewCriteriaRow> getGroups() {
        if (groups == null) {
            groups = new ArrayList<ViewCriteriaRow>();
        }
        return this.groups;
    }

    /**
     * Gets the value of the nesteds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nesteds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNesteds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewCriteria }
     * 
     * 
     */
    public List<ViewCriteria> getNesteds() {
        if (nesteds == null) {
            nesteds = new ArrayList<ViewCriteria>();
        }
        return this.nesteds;
    }

}
