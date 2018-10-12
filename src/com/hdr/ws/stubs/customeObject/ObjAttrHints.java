
package com.hdr.ws.stubs.customeObject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjAttrHints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjAttrHints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objHint" type="{http://xmlns.oracle.com/adf/svc/types/}CtrlHint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attrHints" type="{http://xmlns.oracle.com/adf/svc/types/}AttrCtrlHints" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjAttrHints", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "objHints",
    "attrHints"
})
public class ObjAttrHints {

    @XmlElement(name = "objHint")
    protected List<CtrlHint> objHints;
    @XmlElement(required = true)
    protected List<AttrCtrlHints> attrHints;

    /**
     * Gets the value of the objHints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objHints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjHints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtrlHint }
     * 
     * 
     */
    public List<CtrlHint> getObjHints() {
        if (objHints == null) {
            objHints = new ArrayList<CtrlHint>();
        }
        return this.objHints;
    }

    /**
     * Gets the value of the attrHints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrHints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrHints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrCtrlHints }
     * 
     * 
     */
    public List<AttrCtrlHints> getAttrHints() {
        if (attrHints == null) {
            attrHints = new ArrayList<AttrCtrlHints>();
        }
        return this.attrHints;
    }

}
