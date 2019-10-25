package com.chengang.util;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MsgHeader")
@XmlType(propOrder = { "sender", "msgType", "msgVersion", "status",

        "errCode", "detail", "returnCount" })
public class MsgHeader {

    @XmlElement(name="Sender")
    private String sender;

    @XmlElement(name="MsgType")
    private String msgType;

    @XmlElement(name="MsgVersion")
    private String msgVersion;

    @XmlElement(name="Status")
    private String status;

    @XmlElement(name="ErrCode")
    private String errCode;

    @XmlElement(name="Detail")
    private String detail;

    @XmlElement(name="ReturnCount")
    private String returnCount;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgVersion() {
        return msgVersion;
    }

    public void setMsgVersion(String msgVersion) {
        this.msgVersion = msgVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(String returnCount) {
        this.returnCount = returnCount;
    }


}
