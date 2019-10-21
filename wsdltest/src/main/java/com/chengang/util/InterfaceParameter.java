package com.chengang.util;

import java.util.List;

/**
 * @author 陈刚
 * @ClassName InterfaceParameter
 * @Description //TODO
 * @create 2019-10-21 15:31
 */
public class InterfaceParameter {

    private String wsdlUrl;

    private String namespace;

    private String opreationName;

    private List<ServiceParameter> serviceParameters;

    public String getWsdlUrl() {
        return wsdlUrl;
    }

    public void setWsdlUrl(String wsdlUrl) {
        this.wsdlUrl = wsdlUrl;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getOpreationName() {
        return opreationName;
    }

    public void setOpreationName(String opreationName) {
        this.opreationName = opreationName;
    }

    public List<ServiceParameter> getServiceParameters() {
        return serviceParameters;
    }

    public void setServiceParameters(List<ServiceParameter> serviceParameters) {
        this.serviceParameters = serviceParameters;
    }

    /**
     * Creates a new instance of InterfaceParameter
     */
    public InterfaceParameter() {
    }

    /**
     * Creates a new instance of InterfaceParameter
     * @param wsdlUrl
     * @param namespace
     * @param opreationName
     */
    public InterfaceParameter(String wsdlUrl, String namespace, String opreationName) {
        super();
        this.wsdlUrl = wsdlUrl;
        this.namespace = namespace;
        this.opreationName = opreationName;
    }

    /**
     * Creates a new instance of InterfaceParameter
     * @param wsdlUrl
     * @param namespace
     * @param opreationName
     * @param serviceParameters
     */
    public InterfaceParameter(String wsdlUrl, String namespace, String opreationName, List<ServiceParameter> serviceParameters) {
        super();
        this.wsdlUrl = wsdlUrl;
        this.namespace = namespace;
        this.opreationName = opreationName;
        this.serviceParameters = serviceParameters;
    }




}
