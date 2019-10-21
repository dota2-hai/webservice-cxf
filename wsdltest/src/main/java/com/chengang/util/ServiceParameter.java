package com.chengang.util;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.XMLType;


/**
 * @author 陈刚
 * @ClassName ServiceParameter
 * @Description //TODO
 * @create 2019-10-21 15:32
 */
public class ServiceParameter {

    private String name;

    private QName xmlType;

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QName getXmlType() {
        return xmlType;
    }

    public void setXmlType(QName xmlType) {
        this.xmlType = xmlType;
    }

    /**
     * Creates a new instance of ServiceParameter
     */
    public ServiceParameter() {
        super();
    }

    /**
     * Creates a new instance of ServiceParameter
     * @param name
     * @param xmlType
     * @param value
     */
    public ServiceParameter(String name, QName xmlType, String value) {
        super();
        this.name = name;
        this.xmlType = xmlType;
        this.value = value;
    }

    /**
     * (简单描述该方法的实现功能 -可选)
     */
    @Override
    public String toString() {
        return this.toString();
    }


}
