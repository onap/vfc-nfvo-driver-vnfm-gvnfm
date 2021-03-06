/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
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

package org.onap.vfc.nfvo.vnfm.gvnfm.jujuvnfmadapter.service.adapter.inf;

import java.util.Map;


import net.sf.json.JSONObject;

/**
 * 
 * iJuju adapter to msb manager class.<br>
 * <p>
 * </p>
 * 
 * @author
 * @version     NFVO 0.5  Sep 12, 2016
 */
public interface IJujuAdapter2MSBManager{

    /**
     * 
     * Register juju adapter.<br>
     * 
     * @param paramsMap
     * @param driverInfo
     * @return
     * @since  NFVO 0.5
     */
    JSONObject registerJujuAdapter(Map<String,String> paramsMap, JSONObject driverInfo);

    /**
     * 
     * Unregister juju adapter.<br>
     * 
     * @param paramsMap
     * @return
     * @since  NFVO 0.5
     */
    JSONObject unregisterJujuAdapter(Map<String,String> paramsMap);

}
