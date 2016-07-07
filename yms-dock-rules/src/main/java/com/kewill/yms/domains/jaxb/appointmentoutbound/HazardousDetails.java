/*******************************************************************************
 *
 * Kewill ("COMPANY") CONFIDENTIAL
 *
 * Unpublished Copyright (c) 2009-2015 Kewill, All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of
 * COMPANY. The intellectual and technical concepts contained herein are
 * proprietary to COMPANY and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 *
 * Dissemination of this information or reproduction of this material is
 * strictly forbidden unless prior written permission is obtained from COMPANY.
 * Access to the source code contained herein is hereby forbidden to anyone
 * except current, authorized COMPANY employees, managers or contractors who
 * have executed Confidentiality and Non-disclosure agreements explicitly
 * covering such access.
 *
 * The copyright notice above does not evidence any actual or intended
 * publication or disclosure of this source code, which includes information
 * that is confidential and/or proprietary, and is a trade secret, of COMPANY.
 *
 * ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, OR PUBLIC
 * DISPLAY OF OR THROUGH USE OF THIS SOURCE CODE WITHOUT THE EXPRESS WRITTEN
 * CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE
 * LAWS AND INTERNATIONAL TREATIES. THE RECEIPT OR POSSESSION OF THIS SOURCE
 * CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS TO
 * REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR
 * SELL ANYTHING THAT IT MAY DESCRIBE, IN WHOLE OR IN PART.
 *******************************************************************************/


package com.kewill.yms.domains.jaxb.appointmentoutbound;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QuantityUOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetWeight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NetWeightUOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GrossWeight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GrossWeightUOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UNDGNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UNDGSeq" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UNDGClass" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UNDGPackingGroup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ScheduleClass7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PackingInstruction" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubsidaryRisk1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubsidaryRisk2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubsidaryRisk3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FlashPoint" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FlashPointUOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *               &lt;enumeration value="CEL"/>
 *               &lt;enumeration value="FAH"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMDGPageSub" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MFAGNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EMSNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MarinePollutant" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADRClass" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ADRNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Letter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMDGPageSub2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ContactNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProperShippingName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TechnicalName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HandlingInstructions" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdditionalNotes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Labeling1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Labeling2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Labeling3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dangGoodCard1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dangGoodCard2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dangGoodCard3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Flex1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Flex2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Flex3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Flex4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Flex5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FlexDate1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FlexDate2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FlexNo1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FlexNo2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FlexFlag1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "quantity",
    "quantityUOM",
    "netWeight",
    "netWeightUOW",
    "grossWeight",
    "grossWeightUOW",
    "undgNumber",
    "undgSeq",
    "undgClass",
    "undgPackingGroup",
    "scheduleClass7",
    "packingInstruction",
    "subsidaryRisk1",
    "subsidaryRisk2",
    "subsidaryRisk3",
    "flashPoint",
    "flashPointUOM",
    "imdgPageSub",
    "mfagNumber",
    "emsNumber",
    "marinePollutant",
    "adrClass",
    "adrNumber",
    "letter",
    "imdgPageSub2",
    "contactName",
    "contactNumber",
    "properShippingName",
    "technicalName",
    "handlingInstructions",
    "additionalNotes",
    "labeling1",
    "labeling2",
    "labeling3",
    "dangGoodCard1",
    "dangGoodCard2",
    "dangGoodCard3",
    "remarks",
    "flex1",
    "flex2",
    "flex3",
    "flex4",
    "flex5",
    "flexDate1",
    "flexDate2",
    "flexNo1",
    "flexNo2",
    "flexFlag1"
})
@XmlRootElement(name = "HazardousDetails")
public class HazardousDetails implements Serializable {
	  
	private static final long serialVersionUID=1L;

    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "QuantityUOM")
    protected String quantityUOM;
    @XmlElement(name = "NetWeight")
    protected BigDecimal netWeight;
    @XmlElement(name = "NetWeightUOW")
    protected String netWeightUOW;
    @XmlElement(name = "GrossWeight")
    protected BigDecimal grossWeight;
    @XmlElement(name = "GrossWeightUOW")
    protected String grossWeightUOW;
    @XmlElement(name = "UNDGNumber")
    protected String undgNumber;
    @XmlElement(name = "UNDGSeq")
    protected String undgSeq;
    @XmlElement(name = "UNDGClass")
    protected String undgClass;
    @XmlElement(name = "UNDGPackingGroup")
    protected String undgPackingGroup;
    @XmlElement(name = "ScheduleClass7")
    protected String scheduleClass7;
    @XmlElement(name = "PackingInstruction")
    protected String packingInstruction;
    @XmlElement(name = "SubsidaryRisk1")
    protected String subsidaryRisk1;
    @XmlElement(name = "SubsidaryRisk2")
    protected String subsidaryRisk2;
    @XmlElement(name = "SubsidaryRisk3")
    protected String subsidaryRisk3;
    @XmlElement(name = "FlashPoint")
    protected Integer flashPoint;
    @XmlElement(name = "FlashPointUOM")
    protected String flashPointUOM;
    @XmlElement(name = "IMDGPageSub")
    protected String imdgPageSub;
    @XmlElement(name = "MFAGNumber")
    protected String mfagNumber;
    @XmlElement(name = "EMSNumber")
    protected String emsNumber;
    @XmlElement(name = "MarinePollutant")
    protected String marinePollutant;
    @XmlElement(name = "ADRClass")
    protected String adrClass;
    @XmlElement(name = "ADRNumber")
    protected Integer adrNumber;
    @XmlElement(name = "Letter")
    protected String letter;
    @XmlElement(name = "IMDGPageSub2", required = true)
    protected String imdgPageSub2;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "ContactNumber")
    protected String contactNumber;
    @XmlElement(name = "ProperShippingName")
    protected String properShippingName;
    @XmlElement(name = "TechnicalName")
    protected String technicalName;
    @XmlElement(name = "HandlingInstructions")
    protected String handlingInstructions;
    @XmlElement(name = "AdditionalNotes")
    protected String additionalNotes;
    @XmlElement(name = "Labeling1")
    protected String labeling1;
    @XmlElement(name = "Labeling2")
    protected String labeling2;
    @XmlElement(name = "Labeling3")
    protected String labeling3;
    protected String dangGoodCard1;
    protected String dangGoodCard2;
    protected String dangGoodCard3;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "Flex1")
    protected String flex1;
    @XmlElement(name = "Flex2")
    protected String flex2;
    @XmlElement(name = "Flex3")
    protected String flex3;
    @XmlElement(name = "Flex4")
    protected String flex4;
    @XmlElement(name = "Flex5")
    protected String flex5;
    @XmlElement(name = "FlexDate1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flexDate1;
    @XmlElement(name = "FlexDate2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flexDate2;
    @XmlElement(name = "FlexNo1")
    protected BigDecimal flexNo1;
    @XmlElement(name = "FlexNo2")
    protected BigDecimal flexNo2;
    @XmlElement(name = "FlexFlag1")
    protected Boolean flexFlag1;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the quantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUOM() {
        return quantityUOM;
    }

    /**
     * Sets the value of the quantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUOM(String value) {
        this.quantityUOM = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeight(BigDecimal value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the netWeightUOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetWeightUOW() {
        return netWeightUOW;
    }

    /**
     * Sets the value of the netWeightUOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetWeightUOW(String value) {
        this.netWeightUOW = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeight(BigDecimal value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the grossWeightUOW property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossWeightUOW() {
        return grossWeightUOW;
    }

    /**
     * Sets the value of the grossWeightUOW property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossWeightUOW(String value) {
        this.grossWeightUOW = value;
    }

    /**
     * Gets the value of the undgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDGNumber() {
        return undgNumber;
    }

    /**
     * Sets the value of the undgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDGNumber(String value) {
        this.undgNumber = value;
    }

    /**
     * Gets the value of the undgSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDGSeq() {
        return undgSeq;
    }

    /**
     * Sets the value of the undgSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDGSeq(String value) {
        this.undgSeq = value;
    }

    /**
     * Gets the value of the undgClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDGClass() {
        return undgClass;
    }

    /**
     * Sets the value of the undgClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDGClass(String value) {
        this.undgClass = value;
    }

    /**
     * Gets the value of the undgPackingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDGPackingGroup() {
        return undgPackingGroup;
    }

    /**
     * Sets the value of the undgPackingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDGPackingGroup(String value) {
        this.undgPackingGroup = value;
    }

    /**
     * Gets the value of the scheduleClass7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleClass7() {
        return scheduleClass7;
    }

    /**
     * Sets the value of the scheduleClass7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleClass7(String value) {
        this.scheduleClass7 = value;
    }

    /**
     * Gets the value of the packingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingInstruction() {
        return packingInstruction;
    }

    /**
     * Sets the value of the packingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingInstruction(String value) {
        this.packingInstruction = value;
    }

    /**
     * Gets the value of the subsidaryRisk1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidaryRisk1() {
        return subsidaryRisk1;
    }

    /**
     * Sets the value of the subsidaryRisk1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidaryRisk1(String value) {
        this.subsidaryRisk1 = value;
    }

    /**
     * Gets the value of the subsidaryRisk2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidaryRisk2() {
        return subsidaryRisk2;
    }

    /**
     * Sets the value of the subsidaryRisk2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidaryRisk2(String value) {
        this.subsidaryRisk2 = value;
    }

    /**
     * Gets the value of the subsidaryRisk3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidaryRisk3() {
        return subsidaryRisk3;
    }

    /**
     * Sets the value of the subsidaryRisk3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidaryRisk3(String value) {
        this.subsidaryRisk3 = value;
    }

    /**
     * Gets the value of the flashPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlashPoint() {
        return flashPoint;
    }

    /**
     * Sets the value of the flashPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlashPoint(Integer value) {
        this.flashPoint = value;
    }

    /**
     * Gets the value of the flashPointUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashPointUOM() {
        return flashPointUOM;
    }

    /**
     * Sets the value of the flashPointUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashPointUOM(String value) {
        this.flashPointUOM = value;
    }

    /**
     * Gets the value of the imdgPageSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDGPageSub() {
        return imdgPageSub;
    }

    /**
     * Sets the value of the imdgPageSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDGPageSub(String value) {
        this.imdgPageSub = value;
    }

    /**
     * Gets the value of the mfagNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMFAGNumber() {
        return mfagNumber;
    }

    /**
     * Sets the value of the mfagNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMFAGNumber(String value) {
        this.mfagNumber = value;
    }

    /**
     * Gets the value of the emsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMSNumber() {
        return emsNumber;
    }

    /**
     * Sets the value of the emsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMSNumber(String value) {
        this.emsNumber = value;
    }

    /**
     * Gets the value of the marinePollutant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarinePollutant() {
        return marinePollutant;
    }

    /**
     * Sets the value of the marinePollutant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarinePollutant(String value) {
        this.marinePollutant = value;
    }

    /**
     * Gets the value of the adrClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRClass() {
        return adrClass;
    }

    /**
     * Sets the value of the adrClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRClass(String value) {
        this.adrClass = value;
    }

    /**
     * Gets the value of the adrNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getADRNumber() {
        return adrNumber;
    }

    /**
     * Sets the value of the adrNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setADRNumber(Integer value) {
        this.adrNumber = value;
    }

    /**
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetter(String value) {
        this.letter = value;
    }

    /**
     * Gets the value of the imdgPageSub2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDGPageSub2() {
        return imdgPageSub2;
    }

    /**
     * Sets the value of the imdgPageSub2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDGPageSub2(String value) {
        this.imdgPageSub2 = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    /**
     * Gets the value of the properShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperShippingName() {
        return properShippingName;
    }

    /**
     * Sets the value of the properShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperShippingName(String value) {
        this.properShippingName = value;
    }

    /**
     * Gets the value of the technicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * Sets the value of the technicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalName(String value) {
        this.technicalName = value;
    }

    /**
     * Gets the value of the handlingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingInstructions() {
        return handlingInstructions;
    }

    /**
     * Sets the value of the handlingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingInstructions(String value) {
        this.handlingInstructions = value;
    }

    /**
     * Gets the value of the additionalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNotes() {
        return additionalNotes;
    }

    /**
     * Sets the value of the additionalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNotes(String value) {
        this.additionalNotes = value;
    }

    /**
     * Gets the value of the labeling1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeling1() {
        return labeling1;
    }

    /**
     * Sets the value of the labeling1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeling1(String value) {
        this.labeling1 = value;
    }

    /**
     * Gets the value of the labeling2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeling2() {
        return labeling2;
    }

    /**
     * Sets the value of the labeling2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeling2(String value) {
        this.labeling2 = value;
    }

    /**
     * Gets the value of the labeling3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeling3() {
        return labeling3;
    }

    /**
     * Sets the value of the labeling3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeling3(String value) {
        this.labeling3 = value;
    }

    /**
     * Gets the value of the dangGoodCard1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangGoodCard1() {
        return dangGoodCard1;
    }

    /**
     * Sets the value of the dangGoodCard1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangGoodCard1(String value) {
        this.dangGoodCard1 = value;
    }

    /**
     * Gets the value of the dangGoodCard2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangGoodCard2() {
        return dangGoodCard2;
    }

    /**
     * Sets the value of the dangGoodCard2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangGoodCard2(String value) {
        this.dangGoodCard2 = value;
    }

    /**
     * Gets the value of the dangGoodCard3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangGoodCard3() {
        return dangGoodCard3;
    }

    /**
     * Sets the value of the dangGoodCard3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangGoodCard3(String value) {
        this.dangGoodCard3 = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the flex1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlex1() {
        return flex1;
    }

    /**
     * Sets the value of the flex1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlex1(String value) {
        this.flex1 = value;
    }

    /**
     * Gets the value of the flex2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlex2() {
        return flex2;
    }

    /**
     * Sets the value of the flex2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlex2(String value) {
        this.flex2 = value;
    }

    /**
     * Gets the value of the flex3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlex3() {
        return flex3;
    }

    /**
     * Sets the value of the flex3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlex3(String value) {
        this.flex3 = value;
    }

    /**
     * Gets the value of the flex4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlex4() {
        return flex4;
    }

    /**
     * Sets the value of the flex4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlex4(String value) {
        this.flex4 = value;
    }

    /**
     * Gets the value of the flex5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlex5() {
        return flex5;
    }

    /**
     * Sets the value of the flex5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlex5(String value) {
        this.flex5 = value;
    }

    /**
     * Gets the value of the flexDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlexDate1() {
        return flexDate1;
    }

    /**
     * Sets the value of the flexDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlexDate1(XMLGregorianCalendar value) {
        this.flexDate1 = value;
    }

    /**
     * Gets the value of the flexDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlexDate2() {
        return flexDate2;
    }

    /**
     * Sets the value of the flexDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlexDate2(XMLGregorianCalendar value) {
        this.flexDate2 = value;
    }

    /**
     * Gets the value of the flexNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlexNo1() {
        return flexNo1;
    }

    /**
     * Sets the value of the flexNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlexNo1(BigDecimal value) {
        this.flexNo1 = value;
    }

    /**
     * Gets the value of the flexNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlexNo2() {
        return flexNo2;
    }

    /**
     * Sets the value of the flexNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlexNo2(BigDecimal value) {
        this.flexNo2 = value;
    }

    /**
     * Gets the value of the flexFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlexFlag1() {
        return flexFlag1;
    }

    /**
     * Sets the value of the flexFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlexFlag1(Boolean value) {
        this.flexFlag1 = value;
    }

}
