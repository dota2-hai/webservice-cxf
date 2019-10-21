package com.chengang.util;

import org.junit.Test;

/**
 * @author 陈刚
 * @ClassName Demo
 * @Description //TODO
 * @create 2019-10-21 15:34
 */
public class Demo {

    @Test
    public void demo1(){
        String employeeXml = WSDLUtil.invokeInterface(InterfaceConstant.BASEINFO_ALLDATA);
        System.out.println(employeeXml);
    }
}
