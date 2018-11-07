/*
 * Copyright 2017 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onap.vfc.nfvo.vnfm.gvnfm.jujuvnfmadapter.service.rest.exceptionmapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.onap.vfc.nfvo.vnfm.gvnfm.jujuvnfmadapter.service.rest.exceptionmapper.ExceptionMessage;

public class ExceptionMessageTest {

    ExceptionMessage mess;

    @Before
    public void setUp(){
        mess = new ExceptionMessage();
    }

    @Test
    public void getErrorCodeTest() {
        String errorCode = "404";
        String message = "success";
        int httpCode = 200;
        mess.setErrorCode(errorCode);
        mess.setMessage(message);
        mess.setHttpCode(httpCode);
        assertEquals(mess.getErrorCode(), errorCode);
        assertEquals(mess.getHttpCode(),httpCode);
        assertEquals(mess.getMessage(),message);
    }

}