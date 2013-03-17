package com.worker.rest.responses.roster;

import biz.kulik.android.jaxb.library.Annotations.XmlElement;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: bender
 * Date: 16.01.13
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */
public class ActivityCollection implements Serializable {

    private static final String TAG = ActivityCollection.class.getSimpleName();

    @XmlElement(name = "ACTIVITY")
    private String activity;

    public String getActivity() {
        return activity;
    }
}