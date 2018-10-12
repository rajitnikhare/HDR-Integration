
package com.hdr.ws.stubs.customeObject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://xmlns.oracle.com/adf/svc/errors/}ServiceMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodResult", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "messages"
})
@XmlSeeAlso({
    BigDecimalResult.class,
    DataObjectResult.class,
    BooleanResult.class,
    TimeResult.class,
    DateResult.class,
    BytesResult.class,
    DoubleResult.class,
    ShortResult.class,
    BigIntegerResult.class,
    DataHandlerResult.class,
    IntegerResult.class,
    FloatResult.class,
    StringResult.class,
    ByteResult.class,
    LongResult.class,
    TimestampResult.class
})
public class MethodResult {

    @XmlElement(name = "Message")
    protected List<ServiceMessage> messages;

    /**
     * Gets the value of the messages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMessage }
     * 
     * 
     */
    public List<ServiceMessage> getMessages() {
        if (messages == null) {
            messages = new ArrayList<ServiceMessage>();
        }
        return this.messages;
    }

}
