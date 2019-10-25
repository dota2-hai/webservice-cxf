package com.chengang.util;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis.encoding.XMLType;

/**
 * @author 陈刚
 * @ClassName InterfaceConstant
 * @Description //TODO
 * @create 2019-10-21 15:35
 */
public class InterfaceConstant {
    public static String default_wsdlUrl = "http://172.16.80.168:8089/webserviceEntry?wsdl";
    public static String default_namespace = "http://www.bsoft.com.cn";
    public static String default_opreationName = "invokeRequest";
	  /*public static String default_wsdlUrl = "http://localhost:8080/ws/baseInfo?wsdl";
	  public static String default_namespace = "http://ws.maras.com.xinghai.org/";
	  public static String default_opreationName = "getAllAccess";*/

    public static String baseInfo_wsdlUrl = "http://172.16.80.168:9010/yw/search?wsdl";
    public static String baseInfo_namespace = "http://www.YWXT.com";

    //查询所有人员
    public static final InterfaceParameter EMPLOYEE_QUERY_ALL = new InterfaceParameter(default_wsdlUrl, default_namespace, default_opreationName);

    //查询所有科室
    public static final InterfaceParameter ORGANIZATION_QUERY_ALL = new InterfaceParameter(default_wsdlUrl, default_namespace, default_opreationName);

    //条件查询某一个人的信息详情----没有业务去调用
    public static final InterfaceParameter BASEINFO_QUERY = new InterfaceParameter(default_wsdlUrl, default_namespace, default_opreationName);

    //基本信息接口
    public static final InterfaceParameter BASEINFO_ALLDATA = new InterfaceParameter(baseInfo_wsdlUrl, baseInfo_namespace, default_opreationName);

    static
    {
        //查询人员参数
        List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
        serviceParameters.add(new ServiceParameter("service", XMLType.XSD_STRING, "EmployeeQueryAll"));
        serviceParameters.add(new ServiceParameter("urid", XMLType.XSD_STRING, ""));
        serviceParameters.add(new ServiceParameter("pwd", XMLType.XSD_STRING, ""));
        serviceParameters.add(new ServiceParameter("parameter", XMLType.XSD_STRING, ""));
        EMPLOYEE_QUERY_ALL.setServiceParameters(serviceParameters);

        //查询科室的参数
        List<ServiceParameter> serviceParametersOrg = new ArrayList<ServiceParameter>();
        serviceParametersOrg.add(new ServiceParameter("service", XMLType.XSD_STRING, "DepatmentQueryAll"));
        serviceParametersOrg.add(new ServiceParameter("urid", XMLType.XSD_STRING, ""));
        serviceParametersOrg.add(new ServiceParameter("pwd", XMLType.XSD_STRING, ""));
        serviceParametersOrg.add(new ServiceParameter("parameter", XMLType.XSD_STRING, ""));
        ORGANIZATION_QUERY_ALL.setServiceParameters(serviceParametersOrg);

        //基本信息接口参数
        List<ServiceParameter> serviceParametersBaseInfo = new ArrayList<ServiceParameter>();
        serviceParametersBaseInfo.add(new ServiceParameter("input", XMLType.XSD_STRING, "{\"page\":\"4\"}"));

        BASEINFO_ALLDATA.setServiceParameters(serviceParametersBaseInfo);

    }

    public static void main(String[] args)
    {
//	    System.out.println(EMPLOYEE_QUERY_ALL.getNamespace());
//		  System.out.println(ORGANIZATION_QUERY_ALL.getNamespace());
        System.out.println(BASEINFO_QUERY.getNamespace());
    }

    public static InterfaceParameter getPersionInfoByCode(String personCode){
        //查询人员详情
        List<ServiceParameter> serviceParametersBaseInfo = new ArrayList<ServiceParameter>();
        serviceParametersBaseInfo.add(new ServiceParameter("service", XMLType.XSD_STRING, "EmployeeQuery"));
        serviceParametersBaseInfo.add(new ServiceParameter("urid", XMLType.XSD_STRING, ""));
        serviceParametersBaseInfo.add(new ServiceParameter("pwd", XMLType.XSD_STRING, ""));
        serviceParametersBaseInfo.add(new ServiceParameter("parameter", XMLType.XSD_STRING, "<BSXml>\n" +
                "<MsgHeader>\n" +
                "<Sender>HIS</Sender>\n" +
                "<MsgType>RES_0103</MsgType>\n" +
                "<MsgVersion>3.0</MsgVersion>\n" +
                "</MsgHeader>\n" +
                "<Personnel>\n" +
                "	<PersonCode>"+personCode+"</PersonCode>\n" +
                "</Personnel>\n" +
                "</BSXml>"));
        BASEINFO_QUERY.setServiceParameters(serviceParametersBaseInfo);
        return BASEINFO_QUERY;
    }

}
