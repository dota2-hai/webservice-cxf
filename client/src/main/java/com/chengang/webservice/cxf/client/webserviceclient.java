package com.chengang.webservice.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.service.model.BindingInfo;
import org.apache.cxf.service.model.BindingOperationInfo;
import org.junit.Test;

import javax.xml.namespace.QName;

public class webserviceclient {

    private static String userWsdl = "http://localhost:8080/service/user?wsdl";

    private static String namespace = "http://service.server.cxf.webservice.chengang.com/";


    public static void main(String[] args) throws Exception  {
        JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();

        Client client=dcflient.createClient(userWsdl);

        Object[] objects=client.invoke("getUserName","411001");
        System.out.println("*******"+objects[0].toString());
    }

    @Test
    public void test() throws Exception {
        JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();

        Client client=dcflient.createClient("http://172.16.80.168:9010/yw/search?wsdl");

        Object[] objects=client.invoke("invoke","");
        System.out.println("*******"+objects[0].toString());
    }



}