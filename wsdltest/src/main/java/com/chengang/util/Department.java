package com.chengang.util;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Office")
@XmlType(propOrder = { "OfficeId", "OfficeCode", "OfficeName", "OrganizCode", "OutpatientClinic", "MedicalLab", "HospitalDept", "HospitalArea" })
public class Department {
    @XmlElement(name="OfficeId")
    private String OfficeId;

    @XmlElement(name="OfficeCode")
    private String OfficeCode;

    @XmlElement(name="OfficeName")
    private String OfficeName;

    @XmlElement(name="OrganizCode")
    private OrganizCode OrganizCode;

    @XmlElement(name="OutpatientClinic")
    private OutpatientClinic OutpatientClinic;

    @XmlElement(name="MedicalLab")
    private String MedicalLab;

    @XmlElement(name="HospitalDept")
    private String HospitalDept;

    @XmlElement(name="HospitalArea")
    private String HospitalArea;

    public String getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(String officeId) {
        OfficeId = officeId;
    }

    public String getOfficeCode() {
        return OfficeCode;
    }

    public void setOfficeCode(String officeCode) {
        OfficeCode = officeCode;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String officeName) {
        OfficeName = officeName;
    }

    public OrganizCode getOrganizCode() {
        return OrganizCode;
    }

    public void setOrganizCode(OrganizCode organizCode) {
        OrganizCode = organizCode;
    }

    public OutpatientClinic getOutpatientClinic() {
        return OutpatientClinic;
    }

    public void setOutpatientClinic(OutpatientClinic outpatientClinic) {
        OutpatientClinic = outpatientClinic;
    }

    public String getMedicalLab() {
        return MedicalLab;
    }

    public void setMedicalLab(String medicalLab) {
        MedicalLab = medicalLab;
    }

    public String getHospitalDept() {
        return HospitalDept;
    }

    public void setHospitalDept(String hospitalDept) {
        HospitalDept = hospitalDept;
    }

    public String getHospitalArea() {
        return HospitalArea;
    }

    public void setHospitalArea(String hospitalArea) {
        HospitalArea = hospitalArea;
    }

}