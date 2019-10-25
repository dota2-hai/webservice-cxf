package com.chengang.util;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
//XML文件中的根标识
@XmlRootElement(name = "BSXml")
//控制JAXB 绑定类中属性和字段的排序
@XmlType(propOrder = {
        "MsgHeader",
        "personnelDetail"
})
public class BaseInfoBSXML {

    private MsgHeader MsgHeader;

    @XmlElement(name="Personnel")
    private PersonnelDetail personnelDetail;

    public MsgHeader getMsgHeader() {
        return MsgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        MsgHeader = msgHeader;
    }

    public PersonnelDetail getPersonnelDetail() {
        return personnelDetail;
    }

    public void setPersonnelDetail(PersonnelDetail personnelDetail) {
        this.personnelDetail = personnelDetail;
    }
}

