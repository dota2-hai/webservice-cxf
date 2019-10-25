package com.chengang.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Personnel")
@XmlType(propOrder = { "personId", "personCode", "personName", "majorName","officeCode" })
public class Personnel {

    @XmlElement(name="PersonId")
    private String personId;

    @XmlElement(name="PersonCode")
    private String personCode;

    @XmlElement(name="PersonName")
    private String personName;

    @XmlElement(name="MajorName")
    private Major majorName;

    @XmlElement(name="OfficeCode")
    private Office officeCode;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Major getMajorName() {
        return majorName;
    }

    public void setMajorName(Major majorName) {
        this.majorName = majorName;
    }

    public Office getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Office officeCode) {
        this.officeCode = officeCode;
    }

}
