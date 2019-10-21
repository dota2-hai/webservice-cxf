package com.chengang.util;

import java.util.ArrayList;
import java.util.List;


/**
 * 项目名称:hams
 * 文件名称:WSDLUtil.java
 * 包名称:org.xinghai.com.maras.jiekou.base.util
 * 日期:2018年12月10日 上午11:21:22
 */


import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

/**
 * <p>类名称: WSDLUtil</p>
 * <p>功能: () </p>
 * <p>公司: 星海信息技术有限公司</p>
 * @author 陈刚
 * @date 2018年12月10日 上午11:21:22
 */
public class WSDLUtil {

    private static final int default_timeout = 360000;
    public static String invokeInterface(InterfaceParameter interfaceParameter){
        String result = "";
        Service service = new Service();
        List<Object> values = new ArrayList<Object>();
        try {
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(interfaceParameter.getWsdlUrl()));
            call.setOperationName(new QName(interfaceParameter.getNamespace(),interfaceParameter.getOpreationName()));
            for (ServiceParameter serviceParameter : interfaceParameter.getServiceParameters()) {
                call.addParameter(new QName(interfaceParameter.getNamespace(),serviceParameter.getName()), serviceParameter.getXmlType(), ParameterMode.IN);
                values.add(serviceParameter.getValue());
            }
            call.setReturnType(XMLType.XSD_STRING);//返回类型
            call.setTimeout(default_timeout);
            call.setUseSOAPAction(true);
            result = (String) call.invoke(values.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
