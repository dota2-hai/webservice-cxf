package com.chengang.webservice.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;

public class webserviceclient {

    public static void main(String[] args) throws Exception  {
        JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();

        Client client=dcflient.createClient("http://localhost:8080/service/user?wsdl");

        Object[] objects=client.invoke("getUserName","411001");
        System.out.println("*******"+objects[0].toString());
    }

    @Test
    public void main() throws Exception {
        JaxWsDynamicClientFactory dcflient=JaxWsDynamicClientFactory.newInstance();

        Client client=dcflient.createClient("http://localhost:8080/service/user?wsdl");

        Object[] objects=client.invoke("getUserName","411001");
        System.out.println("*******"+objects[0].toString());


    }



}