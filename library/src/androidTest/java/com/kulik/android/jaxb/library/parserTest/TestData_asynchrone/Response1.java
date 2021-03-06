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
package com.kulik.android.jaxb.library.parserTest.TestData_asynchrone;

import com.kulik.android.jaxb.library.Annotations.XmlElement;

import java.util.List;

/**
 * User: kulik
 * Date: 16.01.13
 * Time: 17:55
 */
public class Response1 {
    @XmlElement(name = "data")
    public List<BankResponse> mBankList;


    public static class BankResponse {
        @XmlElement(name = "bank")
        public String mName;

        @XmlElement(name = "email")
        public String mEmail;

        @XmlElement(name = "phone")
        public String mPhone;

        public BankResponse() {
        }

        public BankResponse(String name, String email, String phone) {
            mName = name;
            mEmail = email;
            mPhone = phone;
        }

        @Override
        public String toString() {
            return mName;
        }
    }
}
