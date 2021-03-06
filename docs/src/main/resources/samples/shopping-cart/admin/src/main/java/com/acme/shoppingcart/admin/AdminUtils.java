/*                                                                             
 * Copyright 2004,2005 The Apache Software Foundation.                         
 *                                                                             
 * Licensed under the Apache License, Version 2.0 (the "License");             
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 *                                                                             
 *      http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,           
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License.                                              
 */
package com.acme.shoppingcart.admin;

import org.wso2.carbon.context.CarbonContext;

import java.net.URI;
import java.net.URL;
import java.util.Properties;

/**
 * Utilities
 */
public class AdminUtils {

    private static Properties props = new Properties();

    static {
        try {
            ClassLoader loader = AdminUtils.class.getClassLoader();
            String propFileStr = "acme.shopping.cart.eprs.properties";
            URL url = loader.getResource(propFileStr);
            props.load(url.openStream());

        } catch (Throwable ignored) {
            // If there is no properties file, we'll simply rely on WS-D to work.
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }

    public static String getEndpoint() {
        return getProperty("admin.proxy.service");
    }
    
}
