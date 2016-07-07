/*******************************************************************************
 *
 * Kewill ("COMPANY") CONFIDENTIAL
 *
 * Unpublished Copyright (c) 2009-2015 Kewill, All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property of COMPANY. The
 * intellectual and technical concepts contained herein are proprietary to COMPANY and may be
 * covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law.
 *
 * Dissemination of this information or reproduction of this material is strictly forbidden unless
 * prior written permission is obtained from COMPANY. Access to the source code contained herein is
 * hereby forbidden to anyone except current, authorized COMPANY employees, managers or contractors
 * who have executed Confidentiality and Non-disclosure agreements explicitly covering such access.
 *
 * The copyright notice above does not evidence any actual or intended publication or disclosure of
 * this source code, which includes information that is confidential and/or proprietary, and is a
 * trade secret, of COMPANY.
 *
 * ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH
 * USE OF THIS SOURCE CODE WITHOUT THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED,
 * AND IN VIOLATION OF APPLICABLE LAWS AND INTERNATIONAL TREATIES. THE RECEIPT OR POSSESSION OF THIS
 * SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS TO REPRODUCE, DISCLOSE
 * OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT MAY DESCRIBE, IN
 * WHOLE OR IN PART.
 *******************************************************************************/

package com.kewill.yms.domains.jaxb.appointmentoutbound;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AppointmentType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *               &lt;enumeration value="Pickup"/>
 *               &lt;enumeration value="Delivery"/>
 *               &lt;enumeration value="Parking"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrailerNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrailerType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SlotFromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SlotToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsHaz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsGateInArrived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DockCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DockInTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDamaged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DamageRemarks" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DockRemarks" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LoadUnloadDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LoadUnloadCompDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DockOutTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsGateOutArrived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalWeight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalWeightUOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalVolume" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalVolumeUOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalPieces" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PiecesUOM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}CheckParams" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Order" maxOccurs="500" minOccurs="0"/>
 *         &lt;element name="DockCodes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ParkingCodes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AreaCodes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sequenceNo", "appointmentType", "trailerNumber", "trailerType",
        "slotFromDateTime", "slotToDateTime", "isHaz", "isGateInArrived", "dockCode", "dockInTime",
        "isDamaged", "damageRemarks", "dockRemarks", "loadUnloadDateTime",
        "loadUnloadCompDateTime", "dockOutTime", "isGateOutArrived", "remarks", "flex1", "flex2",
        "flex3", "flex4", "flex5", "flexDate1", "flexDate2", "flexNo1", "flexNo2", "flexFlag1",
        "statusCode", "statusDesc", "totalWeight", "totalWeightUOW", "totalVolume",
        "totalVolumeUOM", "totalPieces", "piecesUOM", "reserved", "checkParams", "order",
        "dockCodes", "parkingCodes", "areaCodes" })
@XmlRootElement(name = "Trailer")
public class Trailer implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SequenceNo")
    protected int sequenceNo;
    @XmlElement(name = "AppointmentType", required = true)
    protected String appointmentType;
    @XmlElement(name = "TrailerNumber")
    protected String trailerNumber;
    @XmlElement(name = "TrailerType")
    protected String trailerType;
    @XmlElement(name = "SlotFromDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar slotFromDateTime;
    @XmlElement(name = "SlotToDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar slotToDateTime;
    @XmlElement(name = "IsHaz")
    protected Boolean isHaz;
    @XmlElement(name = "IsGateInArrived")
    protected Boolean isGateInArrived;
    @XmlElement(name = "DockCode")
    protected String dockCode;
    @XmlElement(name = "DockInTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dockInTime;
    @XmlElement(name = "IsDamaged")
    protected Boolean isDamaged;
    @XmlElement(name = "DamageRemarks")
    protected String damageRemarks;
    @XmlElement(name = "DockRemarks")
    protected String dockRemarks;
    @XmlElement(name = "LoadUnloadDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loadUnloadDateTime;
    @XmlElement(name = "LoadUnloadCompDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loadUnloadCompDateTime;
    @XmlElement(name = "DockOutTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dockOutTime;
    @XmlElement(name = "IsGateOutArrived")
    protected Boolean isGateOutArrived;
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
    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "TotalWeight")
    protected BigDecimal totalWeight;
    @XmlElement(name = "TotalWeightUOW")
    protected String totalWeightUOW;
    @XmlElement(name = "TotalVolume")
    protected BigDecimal totalVolume;
    @XmlElement(name = "TotalVolumeUOM")
    protected String totalVolumeUOM;
    @XmlElement(name = "TotalPieces")
    protected Integer totalPieces;
    @XmlElement(name = "PiecesUOM")
    protected String piecesUOM;
    @XmlElement(name = "Reserved")
    protected Boolean reserved;
    @XmlElement(name = "CheckParams", required = true)
    protected List<CheckParams> checkParams;
    @XmlElement(name = "Order")
    protected List<Order> order;
    @XmlElement(name = "DockCodes")
    protected List<String> dockCodes;
    @XmlElement(name = "ParkingCodes")
    protected List<String> parkingCodes;
    @XmlElement(name = "AreaCodes")
    protected List<String> areaCodes;

    /**
     * Gets the value of the sequenceNo property.
     * 
     */
    public int getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     */
    public void setSequenceNo(int value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the appointmentType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAppointmentType() {
        return appointmentType;
    }

    /**
     * Sets the value of the appointmentType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAppointmentType(String value) {
        this.appointmentType = value;
    }

    /**
     * Gets the value of the trailerNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTrailerNumber() {
        return trailerNumber;
    }

    /**
     * Sets the value of the trailerNumber property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTrailerNumber(String value) {
        this.trailerNumber = value;
    }

    /**
     * Gets the value of the trailerType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTrailerType() {
        return trailerType;
    }

    /**
     * Sets the value of the trailerType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTrailerType(String value) {
        this.trailerType = value;
    }

    /**
     * Gets the value of the slotFromDateTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getSlotFromDateTime() {
        return slotFromDateTime;
    }

    /**
     * Sets the value of the slotFromDateTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setSlotFromDateTime(XMLGregorianCalendar value) {
        this.slotFromDateTime = value;
    }

    /**
     * Gets the value of the slotToDateTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getSlotToDateTime() {
        return slotToDateTime;
    }

    /**
     * Sets the value of the slotToDateTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setSlotToDateTime(XMLGregorianCalendar value) {
        this.slotToDateTime = value;
    }

    /**
     * Gets the value of the isHaz property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsHaz() {
        return isHaz;
    }

    /**
     * Sets the value of the isHaz property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsHaz(Boolean value) {
        this.isHaz = value;
    }

    /**
     * Gets the value of the isGateInArrived property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsGateInArrived() {
        return isGateInArrived;
    }

    /**
     * Sets the value of the isGateInArrived property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsGateInArrived(Boolean value) {
        this.isGateInArrived = value;
    }

    /**
     * Gets the value of the dockCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDockCode() {
        return dockCode;
    }

    /**
     * Sets the value of the dockCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDockCode(String value) {
        this.dockCode = value;
    }

    /**
     * Gets the value of the dockInTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDockInTime() {
        return dockInTime;
    }

    /**
     * Sets the value of the dockInTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDockInTime(XMLGregorianCalendar value) {
        this.dockInTime = value;
    }

    /**
     * Gets the value of the isDamaged property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsDamaged() {
        return isDamaged;
    }

    /**
     * Sets the value of the isDamaged property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsDamaged(Boolean value) {
        this.isDamaged = value;
    }

    /**
     * Gets the value of the damageRemarks property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDamageRemarks() {
        return damageRemarks;
    }

    /**
     * Sets the value of the damageRemarks property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDamageRemarks(String value) {
        this.damageRemarks = value;
    }

    /**
     * Gets the value of the dockRemarks property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDockRemarks() {
        return dockRemarks;
    }

    /**
     * Sets the value of the dockRemarks property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDockRemarks(String value) {
        this.dockRemarks = value;
    }

    /**
     * Gets the value of the loadUnloadDateTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getLoadUnloadDateTime() {
        return loadUnloadDateTime;
    }

    /**
     * Sets the value of the loadUnloadDateTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setLoadUnloadDateTime(XMLGregorianCalendar value) {
        this.loadUnloadDateTime = value;
    }

    /**
     * Gets the value of the loadUnloadCompDateTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getLoadUnloadCompDateTime() {
        return loadUnloadCompDateTime;
    }

    /**
     * Sets the value of the loadUnloadCompDateTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setLoadUnloadCompDateTime(XMLGregorianCalendar value) {
        this.loadUnloadCompDateTime = value;
    }

    /**
     * Gets the value of the dockOutTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDockOutTime() {
        return dockOutTime;
    }

    /**
     * Sets the value of the dockOutTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDockOutTime(XMLGregorianCalendar value) {
        this.dockOutTime = value;
    }

    /**
     * Gets the value of the isGateOutArrived property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsGateOutArrived() {
        return isGateOutArrived;
    }

    /**
     * Sets the value of the isGateOutArrived property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIsGateOutArrived(Boolean value) {
        this.isGateOutArrived = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the flex1 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFlex1() {
        return flex1;
    }

    /**
     * Sets the value of the flex1 property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFlex1(String value) {
        this.flex1 = value;
    }

    /**
     * Gets the value of the flex2 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFlex2() {
        return flex2;
    }

    /**
     * Sets the value of the flex2 property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFlex2(String value) {
        this.flex2 = value;
    }

    /**
     * Gets the value of the flex3 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFlex3() {
        return flex3;
    }

    /**
     * Sets the value of the flex3 property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFlex3(String value) {
        this.flex3 = value;
    }

    /**
     * Gets the value of the flex4 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFlex4() {
        return flex4;
    }

    /**
     * Sets the value of the flex4 property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFlex4(String value) {
        this.flex4 = value;
    }

    /**
     * Gets the value of the flex5 property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFlex5() {
        return flex5;
    }

    /**
     * Sets the value of the flex5 property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFlex5(String value) {
        this.flex5 = value;
    }

    /**
     * Gets the value of the flexDate1 property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getFlexDate1() {
        return flexDate1;
    }

    /**
     * Sets the value of the flexDate1 property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setFlexDate1(XMLGregorianCalendar value) {
        this.flexDate1 = value;
    }

    /**
     * Gets the value of the flexDate2 property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getFlexDate2() {
        return flexDate2;
    }

    /**
     * Sets the value of the flexDate2 property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setFlexDate2(XMLGregorianCalendar value) {
        this.flexDate2 = value;
    }

    /**
     * Gets the value of the flexNo1 property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getFlexNo1() {
        return flexNo1;
    }

    /**
     * Sets the value of the flexNo1 property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setFlexNo1(BigDecimal value) {
        this.flexNo1 = value;
    }

    /**
     * Gets the value of the flexNo2 property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getFlexNo2() {
        return flexNo2;
    }

    /**
     * Sets the value of the flexNo2 property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setFlexNo2(BigDecimal value) {
        this.flexNo2 = value;
    }

    /**
     * Gets the value of the flexFlag1 property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isFlexFlag1() {
        return flexFlag1;
    }

    /**
     * Sets the value of the flexFlag1 property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setFlexFlag1(Boolean value) {
        this.flexFlag1 = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the totalWeightUOW property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalWeightUOW() {
        return totalWeightUOW;
    }

    /**
     * Sets the value of the totalWeightUOW property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalWeightUOW(String value) {
        this.totalWeightUOW = value;
    }

    /**
     * Gets the value of the totalVolume property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    /**
     * Sets the value of the totalVolume property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setTotalVolume(BigDecimal value) {
        this.totalVolume = value;
    }

    /**
     * Gets the value of the totalVolumeUOM property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTotalVolumeUOM() {
        return totalVolumeUOM;
    }

    /**
     * Sets the value of the totalVolumeUOM property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTotalVolumeUOM(String value) {
        this.totalVolumeUOM = value;
    }

    /**
     * Gets the value of the totalPieces property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getTotalPieces() {
        return totalPieces;
    }

    /**
     * Sets the value of the totalPieces property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     * 
     */
    public void setTotalPieces(Integer value) {
        this.totalPieces = value;
    }

    /**
     * Gets the value of the piecesUOM property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPiecesUOM() {
        return piecesUOM;
    }

    /**
     * Sets the value of the piecesUOM property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPiecesUOM(String value) {
        this.piecesUOM = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setReserved(Boolean value) {
        this.reserved = value;
    }

    /**
     * Gets the value of the checkParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the checkParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCheckParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CheckParams }
     * 
     * 
     */
    public List<CheckParams> getCheckParams() {
        if (checkParams == null) {
            checkParams = new ArrayList<CheckParams>();
        }
        return this.checkParams;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Order }
     * 
     * 
     */
    public List<Order> getOrder() {
        if (order == null) {
            order = new ArrayList<Order>();
        }
        return this.order;
    }

    /**
     * Gets the value of the dockCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the dockCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDockCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getDockCodes() {
        if (dockCodes == null) {
            dockCodes = new ArrayList<String>();
        }
        return this.dockCodes;
    }

    /**
     * Gets the value of the parkingCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the parkingCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getParkingCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getParkingCodes() {
        if (parkingCodes == null) {
            parkingCodes = new ArrayList<String>();
        }
        return this.parkingCodes;
    }

    /**
     * Gets the value of the areaCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the areaCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAreaCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getAreaCodes() {
        if (areaCodes == null) {
            areaCodes = new ArrayList<String>();
        }
        return this.areaCodes;
    }

    public void addDockCode(String dockCode, String areaCode, String isPeakTime) {
        if (("YesPeakTime").equalsIgnoreCase(isPeakTime)) {
            this.getAreaCodes().add(areaCode);
        } else {
            if (dockCodes == null) {
                dockCodes = new ArrayList<String>();
            }
            System.out.println("DockId : " + dockCode);
            dockCodes.add(dockCode);
        }
    }

    public void addParkingCode(String parkingCode) {
        if (parkingCodes == null) {
            parkingCodes = new ArrayList<String>();
        }
        parkingCodes.add(parkingCode);
    }
}
