package com.chengang.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * @author 陈刚
 * @ClassName Demo
 * @Description //TODO
 * @create 2019-10-21 15:34
 */
public class Demo {

    /**
     * 基本信息
     */
    @Test
    public void demo1(){
        String employeeXml = WSDLUtil.invokeInterface(InterfaceConstant.BASEINFO_ALLDATA);
        System.out.println(employeeXml);
    }


    /**
     * 人员信息
     */
    @Test
    public void demo2() throws IOException {
        String employeeXml = WSDLUtil.invokeInterface(InterfaceConstant.EMPLOYEE_QUERY_ALL);
        System.out.println((employeeXml));
        FileUtils.write(new File("d:/a.xml"),employeeXml);
        BSXML bsXml = XMLUtil.convertXmlStrToObject(BSXML.class, employeeXml);
        System.out.println(bsXml.getPersonnel().size());

    }

    /**
     * 科室信息
     */
    @Test
    public void demo3() throws Exception {
        String orgXml = WSDLUtil.invokeInterface(InterfaceConstant.ORGANIZATION_QUERY_ALL);
        System.out.println(orgXml);


    }

    @Test
    public void demo4() throws Exception {

        String orgXml = WSDLUtil.invokeInterface(InterfaceConstant.BASEINFO_ALLDATA);
        System.out.println(orgXml);

    }

    @Test
    public void demo5() throws Exception {
        String personCode = "5277";
        String baseInfoXml = WSDLUtil.invokeInterface(InterfaceConstant.getPersionInfoByCode(personCode));
        BaseInfoBSXML bsXml = XMLUtil.convertXmlStrToObject(BaseInfoBSXML.class, baseInfoXml);
        PersonnelDetail personnelDetail = bsXml.getPersonnelDetail();
        System.out.println(baseInfoXml);
        System.out.println(personnelDetail.getOrganizCode().getValue());

    }
}
