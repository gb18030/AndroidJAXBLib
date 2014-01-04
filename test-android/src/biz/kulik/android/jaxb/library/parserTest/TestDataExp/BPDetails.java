package biz.kulik.android.jaxb.library.parserTest.TestDataExp;

import biz.kulik.android.jaxb.library.Annotations.XmlElement;

import java.io.Serializable;

/**
 * User: bender
 * Date: 15.02.13
 * Time: 11:00
 */
public class BPDetails implements Serializable {

    @XmlElement(name = "BUP_PUR")
    private String busPurpose;

    @XmlElement(name = "BP_DESCR")
    private String busPurposeDescr;

}
