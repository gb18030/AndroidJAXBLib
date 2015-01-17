/*
        Copyright 2014 Yevgen Kulik

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package com.kulik.android.jaxb.library.composer.providers.jsonProvider;

import com.kulik.android.jaxb.library.composer.providers.abstractProvider.UMO;
import com.kulik.android.jaxb.library.composer.providers.abstractProvider.UMOArray;

import org.json.JSONArray;

/**
 * User: kulik
 * Date: 10/15/12
 * Time: 8:36 PM
 */
public class JSONArrayProvider implements UMOArray {

    private JSONArray mJsonArray = new JSONArray();

    @Override
    public Object getWrappedObject() {
        return mJsonArray;
    }

    @Override
    public void setWrappedObject(Object obj) {
        mJsonArray = (JSONArray) obj;
    }

    @Override
    public Object getRootDocument() {
        return mJsonArray;
    }

    @Override
    public void put(String key, UMO value) {
        mJsonArray.put(value.getWrappedObject());
    }
}
