/*
 *
 *  * Copyright (C) 2024-2024 Huawei Technologies Co., Ltd. All rights reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.huaweicloud.sermant.router.config.handler;

import com.huaweicloud.sermant.core.service.dynamicconfig.common.DynamicConfigEvent;

/**
 * Processor interface
 *
 * @author provenceee
 * @since 2024-01-16
 */
public interface AbstractHandler {
    /**
     * Configure processing
     *
     * @param event Configure listening events
     * @param cacheName Cache name
     */
    void handle(DynamicConfigEvent event, String cacheName);

    /**
     * Whether it needs to be processed
     *
     * @param key 配置key
     * @return 是否需要处理
     */
    boolean shouldHandle(String key);
}
