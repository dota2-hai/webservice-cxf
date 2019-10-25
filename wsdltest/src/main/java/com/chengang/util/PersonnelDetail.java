package com.chengang.util;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Personnel")
@XmlType(propOrder = { "personId", "personCode", "personName", "spellCode","gender","birthday","birthplace","address","cardType",
        "cardNum","hometown","ethnic","mobile","email","majorName","education","educationBackground","joininwork",
        "organizCode","officeCode","qualificationNum","certificateNum","operationScope","jobpost","majorType","professionalCategoryCode",
        "isExpert","prescribeRight","narcoticRight","psychotropicRight","antibioticRight","effectiveTimeBegin","effectiveTimeEnd",
        "logoff","remark","assignedPersonId","assignedPersonName","assignedOfficeCode","assignedOfficeName","assignedContactPerson"})
public class PersonnelDetail {
    @XmlElement(name="PersonId")
    private String personId;

    @XmlElement(name="PersonCode")
    private String personCode;

    @XmlElement(name="PersonName")
    private String personName;

    @XmlElement(name="SpellCode")
    private String spellCode;

    @XmlElement(name="Gender")
    private Gender gender;

    @XmlElement(name="Birthday")
    private String birthday;

    @XmlElement(name="Birthplace")
    private String birthplace;

    @XmlElement(name="Address")
    private String address;

    @XmlElement(name="CardType")
    private CardType cardType;

    @XmlElement(name="CardNum")
    private String cardNum;

    @XmlElement(name="Hometown")
    private String hometown;

    @XmlElement(name="Ethnic")
    private Ethnic ethnic;

    @XmlElement(name="Mobile")
    private String mobile;

    @XmlElement(name="Email")
    private String email;

    @XmlElement(name="MajorName")
    private MajorName majorName ;

    @XmlElement(name="Education")
    private Education education;

    @XmlElement(name="EducationBackground")
    private EducationBackground educationBackground;

    @XmlElement(name="Joininwork")
    private String joininwork;

    @XmlElement(name="OrganizCode")
    private OrganizCode organizCode;

    @XmlElement(name="OfficeCode")
    private OfficeCode officeCode;

    @XmlElement(name="QualificationNum")
    private String qualificationNum;

    @XmlElement(name="CertificateNum")
    private String certificateNum;

    @XmlElement(name="OperationScope")
    private OperationScope operationScope;

    @XmlElement(name="Jobpost")
    private Jobpost jobpost;

    @XmlElement(name="MajorType")
    private MajorType majorType;

    @XmlElement(name="ProfessionalCategoryCode")
    private ProfessionalCategoryCode professionalCategoryCode;

    @XmlElement(name="IsExpert")
    private String isExpert;

    @XmlElement(name="PrescribeRight")
    private String prescribeRight;

    @XmlElement(name="NarcoticRight")
    private String narcoticRight;

    @XmlElement(name="PsychotropicRight")
    private String psychotropicRight;

    @XmlElement(name="AntibioticRight")
    private String antibioticRight;

    @XmlElement(name="EffectiveTimeBegin")
    private String effectiveTimeBegin;

    @XmlElement(name="EffectiveTimeEnd")
    private String effectiveTimeEnd;

    @XmlElement(name="Logoff")
    private String logoff;

    @XmlElement(name="Remark")
    private String remark;

    @XmlElement(name="AssignedPersonId")
    private String assignedPersonId;

    @XmlElement(name="AssignedPersonName")
    private String assignedPersonName;

    @XmlElement(name="AssignedOfficeCode")
    private String assignedOfficeCode;

    @XmlElement(name="AssignedOfficeName")
    private String assignedOfficeName;

    @XmlElement(name="AssignedContactPerson")
    private String assignedContactPerson;

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

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Ethnic getEthnic() {
        return ethnic;
    }

    public void setEthnic(Ethnic ethnic) {
        this.ethnic = ethnic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MajorName getMajorName() {
        return majorName;
    }

    public void setMajorName(MajorName majorName) {
        this.majorName = majorName;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public EducationBackground getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(EducationBackground educationBackground) {
        this.educationBackground = educationBackground;
    }

    public String getJoininwork() {
        return joininwork;
    }

    public void setJoininwork(String joininwork) {
        this.joininwork = joininwork;
    }

    public OrganizCode getOrganizCode() {
        return organizCode;
    }

    public void setOrganizCode(OrganizCode organizCode) {
        this.organizCode = organizCode;
    }

    public OfficeCode getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(OfficeCode officeCode) {
        this.officeCode = officeCode;
    }

    public String getQualificationNum() {
        return qualificationNum;
    }

    public void setQualificationNum(String qualificationNum) {
        this.qualificationNum = qualificationNum;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public OperationScope getOperationScope() {
        return operationScope;
    }

    public void setOperationScope(OperationScope operationScope) {
        this.operationScope = operationScope;
    }

    public Jobpost getJobpost() {
        return jobpost;
    }

    public void setJobpost(Jobpost jobpost) {
        this.jobpost = jobpost;
    }

    public MajorType getMajorType() {
        return majorType;
    }

    public void setMajorType(MajorType majorType) {
        this.majorType = majorType;
    }

    public ProfessionalCategoryCode getProfessionalCategoryCode() {
        return professionalCategoryCode;
    }

    public void setProfessionalCategoryCode(ProfessionalCategoryCode professionalCategoryCode) {
        this.professionalCategoryCode = professionalCategoryCode;
    }

    public String getIsExpert() {
        return isExpert;
    }

    public void setIsExpert(String isExpert) {
        this.isExpert = isExpert;
    }

    public String getPrescribeRight() {
        return prescribeRight;
    }

    public void setPrescribeRight(String prescribeRight) {
        this.prescribeRight = prescribeRight;
    }

    public String getNarcoticRight() {
        return narcoticRight;
    }

    public void setNarcoticRight(String narcoticRight) {
        this.narcoticRight = narcoticRight;
    }

    public String getPsychotropicRight() {
        return psychotropicRight;
    }

    public void setPsychotropicRight(String psychotropicRight) {
        this.psychotropicRight = psychotropicRight;
    }

    public String getAntibioticRight() {
        return antibioticRight;
    }

    public void setAntibioticRight(String antibioticRight) {
        this.antibioticRight = antibioticRight;
    }

    public String getEffectiveTimeBegin() {
        return effectiveTimeBegin;
    }

    public void setEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
    }

    public String getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    public String getLogoff() {
        return logoff;
    }

    public void setLogoff(String logoff) {
        this.logoff = logoff;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAssignedPersonId() {
        return assignedPersonId;
    }

    public void setAssignedPersonId(String assignedPersonId) {
        this.assignedPersonId = assignedPersonId;
    }

    public String getAssignedPersonName() {
        return assignedPersonName;
    }

    public void setAssignedPersonName(String assignedPersonName) {
        this.assignedPersonName = assignedPersonName;
    }

    public String getAssignedOfficeCode() {
        return assignedOfficeCode;
    }

    public void setAssignedOfficeCode(String assignedOfficeCode) {
        this.assignedOfficeCode = assignedOfficeCode;
    }

    public String getAssignedOfficeName() {
        return assignedOfficeName;
    }

    public void setAssignedOfficeName(String assignedOfficeName) {
        this.assignedOfficeName = assignedOfficeName;
    }

    public String getAssignedContactPerson() {
        return assignedContactPerson;
    }

    public void setAssignedContactPerson(String assignedContactPerson) {
        this.assignedContactPerson = assignedContactPerson;
    }
}
