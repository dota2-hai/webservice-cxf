package com.chengang.util;


/**
 * 项目名称:hams
 * 文件名称:orgBSXML.java
 * 包名称:org.xinghai.com.maras.jiekou.taizhou.entity
 * 日期:2018年12月19日 下午3:12:58
 */


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>类名称: orgBSXML</p>
 * <p>功能: () </p>
 * <p>公司: 星海信息技术有限公司</p>
 * @author 陈刚
 * @date 2018年12月19日 下午3:12:58
 */
@XmlAccessorType(XmlAccessType.FIELD)
//XML文件中的根标识
@XmlRootElement(name = "BSXml")
//控制JAXB 绑定类中属性和字段的排序
@XmlType(propOrder = {
        "MsgHeader",
        "Office"
})
public class OrgBSXML {

    private MsgHeader MsgHeader;

    private List<Department> Office;

    public MsgHeader getMsgHeader() {
        return MsgHeader;
    }

    public void setMsgHeader(MsgHeader msgHeader) {
        MsgHeader = msgHeader;
    }

    public List<Department> getOffice() {
        return Office;
    }

    public void setOffice(List<Department> office) {
        Office = office;
    }

}
