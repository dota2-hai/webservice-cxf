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
        "msgHeader",
        "personnel"
})
public class BSXML {

    @XmlElement(name="MsgHeader")
    private MsgHeader msgHeader;

    @XmlElement(name="Personnel")
    private List<Personnel> personnel;

    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        this.msgHeader = msgHeader;
    }

    public List<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(List<Personnel> personnel) {
        this.personnel = personnel;
    }




}
