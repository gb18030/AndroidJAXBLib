package com.kulik.compouserTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: kulik
 * Date: 10/16/12
 * Time: 1:40 PM
 */
@XmlRootElement
public class RootProxy {

    @XmlElement(name = "B")
    BProxy mb = new BProxy();

    @XmlElement(name = "A")
    AProxy ma = new AProxy();

    @XmlElement(name = "TestList1")
    @XmlElementWrapper(name = "bookList")
    List<TestListItem> mlist1 = new ArrayList<TestListItem>(Arrays.asList(new TestListItem[]{new TestListItem(1224), new TestListItem(1234)}));

    @XmlElement(name = "TestList")
    List<TestListItem> mlist = new ArrayList<TestListItem>(Arrays.asList(new TestListItem[]{new TestListItem(122), new TestListItem(123)}));

    @XmlElement(name = "TestIntegerValue")
    Integer mTestIntegerVal = Integer.valueOf(12212);

    @XmlElement(name = "TestNull")
    String mTestNull = null;

    @XmlElement(name = "TestNullList")
    List<TestListItem> mNullList = null;

    @XmlElement(name = "TestNullObj")
    Object mNullObj = null;

    @XmlElement(name = "TestNullNillableObj", nillable = true)
    Object mNullObjnilable = null;

    @XmlElement(name = "TestNullObj1", defaultValue = "14", required = true)
    Integer mNullObj1 = null;

    @XmlAttribute(name = "classicType")
    int classicType = 10;

    public static class TestListItem {
        @XmlElement(name = "item_value")
        Integer mItval;

        TestListItem(int val) {
            mItval = Integer.valueOf(val);
        }
    }

    public static class BProxy {
    }

    public static class AProxy {
    }

}
