/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.alibaba.fescar.config.apollo;

import com.alibaba.fescar.common.loader.LoadLevel;
import com.alibaba.fescar.config.Configuration;
import com.alibaba.fescar.config.ConfigurationProvider;

/**
 * @author xingfudeshi@gmail.com
 * @date 2019/04/12
 */
@LoadLevel(name = "Apollo", order = 1)
public class ApolloConfigurationProvider implements ConfigurationProvider {
    @Override
    public Configuration provide() {
        return ApolloConfiguration.getInstance();
    }
}
