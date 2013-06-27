//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.27 at 08:32:16 �� EEST 
//


package org.openiot.commons.osdspec.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openiot.commons.sparql.protocoltypes.model.QueryRequest;


/**
 * OpenIoT Sensor Model Object
 * 
 * <p>Java class for OSMO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSMO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:openiot:osdspec:xsd:1}description" minOccurs="0"/>
 *         &lt;element ref="{urn:openiot:osdspec:xsd:1}queryControls"/>
 *         &lt;element ref="{urn:openiot:osdspec:xsd:1}requestPresentation"/>
 *         &lt;element ref="{http://www.w3.org/2007/SPARQL/protocol-types#}query-request"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSMO", propOrder = {
    "description",
    "queryControls",
    "requestPresentation",
    "queryRequest"
})
public class OSMO {

    protected String description;
    @XmlElement(required = true)
    protected QueryControls queryControls;
    @XmlElement(required = true)
    protected RequestPresentation requestPresentation;
    @XmlElement(name = "query-request", namespace = "http://www.w3.org/2007/SPARQL/protocol-types#", required = true)
    protected QueryRequest queryRequest;
    @XmlAttribute(name = "id", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the queryControls property.
     * 
     * @return
     *     possible object is
     *     {@link QueryControls }
     *     
     */
    public QueryControls getQueryControls() {
        return queryControls;
    }

    /**
     * Sets the value of the queryControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryControls }
     *     
     */
    public void setQueryControls(QueryControls value) {
        this.queryControls = value;
    }

    /**
     * Gets the value of the requestPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPresentation }
     *     
     */
    public RequestPresentation getRequestPresentation() {
        return requestPresentation;
    }

    /**
     * Sets the value of the requestPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPresentation }
     *     
     */
    public void setRequestPresentation(RequestPresentation value) {
        this.requestPresentation = value;
    }

    /**
     * Gets the value of the queryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRequest }
     *     
     */
    public QueryRequest getQueryRequest() {
        return queryRequest;
    }

    /**
     * Sets the value of the queryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRequest }
     *     
     */
    public void setQueryRequest(QueryRequest value) {
        this.queryRequest = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
