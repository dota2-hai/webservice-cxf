package com.chengang.webservice.cxf.client;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈刚
 * @ClassName wsClient
 * @Description //TODO
 * @create 2019-08-30 15:53
 */
public class AxisClient {

    private static String userWsdl = "http://localhost:8080/service/user?wsdl";

    private static String namespace = "http://service.server.cxf.webservice.chengang.com/";


    @Test
    public void demo2() throws ServiceException, RemoteException {
        Service service = new Service();
        Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(userWsdl);
        //参数一：服务端namespace（wsdl:import那行,没有就targetNamespace），参数二：方法名
        call.setOperationName(new QName(namespace,"getUserName"));
        //wsdl文档中的参数名
        call.addParameter("arg0",XMLType.XSD_STRING,ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        Object object = call.invoke(new Object[]{"411001"});
        System.out.println("object = " + object);
        //invoke返回值就是定义的返回值，如果有其他输出参数，用call.getOutputParams()获取,如果没有返回值，只有inout参数，返回的会被放在invoke方法执行后的返回值上
    }

    @Test
    public void demo3() throws Exception {
        Service service = new Service();
        Call call = (Call)service.createCall();
        call.setTargetEndpointAddress(new URL("http://172.16.80.168:9010/yw/search?wsdl"));
        String namespace = "http://www.YWXT.com";
        //参数一：服务端namespace（wsdl:import那行,没有就targetNamespace），参数二：方法名
        call.setOperationName(new QName(namespace,"invokeRequest"));
        //wsdl文档中的参数名EmployeeQueryAll
        call.addParameter(new QName(namespace,"service"),XMLType.XSD_STRING,ParameterMode.IN);
        call.addParameter(new QName(namespace,"urid"),XMLType.XSD_STRING,ParameterMode.IN);
        call.addParameter(new QName(namespace,"pwd"),XMLType.XSD_STRING,ParameterMode.IN);
        call.addParameter(new QName(namespace,"parameter"),XMLType.XSD_STRING,ParameterMode.IN);
        call.setReturnType(XMLType.XSD_STRING);
        call.setUseSOAPAction(true);
        Object object = call.invoke(new Object[]{"EmployeeQueryAll","","",""});
        System.out.println("object = " + object);
        //invoke返回值就是定义的返回值，如果有其他输出参数，用call.getOutputParams()获取,如果没有返回值，只有inout参数，返回的会被放在invoke方法执行后的返回值上
    }


    private static final int default_timeout = 360000;

    @Test
    public void testYw(){
        String baseInfo_wsdlUrl = "http://172.16.80.168:9010/yw/search?wsdl";
        String baseInfo_namespace = "http://www.YWXT.com";
        String result = "";
        Service service = new Service();
        List<Object> values = new ArrayList<Object>();
        try {
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(baseInfo_wsdlUrl));
            call.setOperationName(new QName(baseInfo_namespace,"invokeRequest"));

            call.addParameter(new QName(baseInfo_namespace,"service"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(baseInfo_namespace,"urid"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(baseInfo_namespace,"pwd"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(baseInfo_namespace,"parameter"), XMLType.XSD_STRING, ParameterMode.IN);

            values.add("1");
            values.add("1");
            values.add("1");
            values.add("1");

            call.setReturnType(XMLType.XSD_STRING);//返回类型
            call.setTimeout(default_timeout);
            call.setUseSOAPAction(true);
            result = (String) call.invoke(values.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void demo5(){
        String baseInfo_wsdlUrl = "http://172.16.80.168:8089/webserviceEntry?wsdl";
        String baseInfo_namespace = "http://www.bsoft.com.cn";
        String result = "";
        Service service = new Service();
        List<Object> values = new ArrayList<Object>();
        try {
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(baseInfo_wsdlUrl));
            call.setOperationName(new QName(baseInfo_namespace,"invokeRequest"));

            call.addParameter(new QName(baseInfo_namespace,"service"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(baseInfo_namespace,"urid"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(baseInfo_namespace,"pwd"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(baseInfo_namespace,"parameter"), XMLType.XSD_STRING, ParameterMode.IN);

            values.add("EmployeeQueryAll");
            values.add("");
            values.add("");
            values.add("");

            call.setReturnType(XMLType.XSD_STRING);//返回类型
            call.setTimeout(default_timeout);
            call.setUseSOAPAction(true);
            result = (String) call.invoke(values.toArray());
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
