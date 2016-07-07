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
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="TempGateOutDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TempGateInDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{}CheckParams" maxOccurs="unbounded" minOccurs="0"/>
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
    "tempGateOutDateTime",
    "tempGateInDateTime",
    "checkParams"
})
@XmlRootElement(name = "TempGate")
public class TempGate implements Serializable {
	  
	private static final long serialVersionUID=1L;

    @XmlElement(name = "TempGateOutDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempGateOutDateTime;
    @XmlElement(name = "TempGateInDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempGateInDateTime;
    @XmlElement(name = "CheckParams")
    protected List<CheckParams> checkParams;

    /**
     * Gets the value of the tempGateOutDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempGateOutDateTime() {
        return tempGateOutDateTime;
    }

    /**
     * Sets the value of the tempGateOutDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempGateOutDateTime(XMLGregorianCalendar value) {
        this.tempGateOutDateTime = value;
    }

    /**
     * Gets the value of the tempGateInDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempGateInDateTime() {
        return tempGateInDateTime;
    }

    /**
     * Sets the value of the tempGateInDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempGateInDateTime(XMLGregorianCalendar value) {
        this.tempGateInDateTime = value;
    }

    /**
     * Gets the value of the checkParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckParams }
     * 
     * 
     */
    public List<CheckParams> getCheckParams() {
        if (checkParams == null) {
            checkParams = new ArrayList<CheckParams>();
        }
        return this.checkParams;
    }

}
