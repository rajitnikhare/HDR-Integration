
package com.hdr.ws.stubs.customeObject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fetchStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fetchSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filter" type="{http://xmlns.oracle.com/adf/svc/types/}ViewCriteria" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{http://xmlns.oracle.com/adf/svc/types/}SortOrder" minOccurs="0"/>
 *         &lt;element name="findAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludeAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childFindCriteria" type="{http://xmlns.oracle.com/adf/svc/types/}ChildFindCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCriteria", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "fetchStart",
    "fetchSize",
    "filter",
    "sortOrder",
    "findAttributes",
    "excludeAttribute",
    "childFindCriterias"
})
@XmlSeeAlso({
    ChildFindCriteria.class
})
public class FindCriteria {

    @XmlElement(defaultValue = "0")
    protected int fetchStart;
    @XmlElement(defaultValue = "-1")
    protected int fetchSize;
    protected ViewCriteria filter;
    protected SortOrder sortOrder;
    @XmlElement(name = "findAttribute")
    protected List<String> findAttributes;
    @XmlElement(defaultValue = "false")
    protected boolean excludeAttribute;
    @XmlElement(name = "childFindCriteria")
    protected List<ChildFindCriteria> childFindCriterias;

    /**
     * Gets the value of the fetchStart property.
     * 
     */
    public int getFetchStart() {
        return fetchStart;
    }

    /**
     * Sets the value of the fetchStart property.
     * 
     */
    public void setFetchStart(int value) {
        this.fetchStart = value;
    }

    /**
     * Gets the value of the fetchSize property.
     * 
     */
    public int getFetchSize() {
        return fetchSize;
    }

    /**
     * Sets the value of the fetchSize property.
     * 
     */
    public void setFetchSize(int value) {
        this.fetchSize = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ViewCriteria }
     *     
     */
    public ViewCriteria getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewCriteria }
     *     
     */
    public void setFilter(ViewCriteria value) {
        this.filter = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the findAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the findAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFindAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFindAttributes() {
        if (findAttributes == null) {
            findAttributes = new ArrayList<String>();
        }
        return this.findAttributes;
    }

    /**
     * Gets the value of the excludeAttribute property.
     * 
     */
    public boolean isExcludeAttribute() {
        return excludeAttribute;
    }

    /**
     * Sets the value of the excludeAttribute property.
     * 
     */
    public void setExcludeAttribute(boolean value) {
        this.excludeAttribute = value;
    }

    /**
     * Gets the value of the childFindCriterias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childFindCriterias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildFindCriterias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildFindCriteria }
     * 
     * 
     */
    public List<ChildFindCriteria> getChildFindCriterias() {
        if (childFindCriterias == null) {
            childFindCriterias = new ArrayList<ChildFindCriteria>();
        }
        return this.childFindCriterias;
    }

}
