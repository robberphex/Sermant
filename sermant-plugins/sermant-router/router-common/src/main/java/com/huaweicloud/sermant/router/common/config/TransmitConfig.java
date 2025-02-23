/*
 * Copyright (C) 2024-2024 Huawei Technologies Co., Ltd. All rights reserved.
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

package com.huaweicloud.sermant.router.common.config;

import com.huaweicloud.sermant.core.config.common.ConfigFieldKey;
import com.huaweicloud.sermant.core.config.common.ConfigTypeKey;
import com.huaweicloud.sermant.core.plugin.config.PluginConfig;

/**
 * Cross-threaded transparent transmission configuration
 *
 * @author provenceee
 * @since 2024-01-16
 */
@ConfigTypeKey("transmit.plugin")
public class TransmitConfig implements PluginConfig {
    /**
     * Whether to pass the label on the direct new thread
     */
    @ConfigFieldKey("enabled-thread")
    private boolean enabledThread;

    /**
     * Whether labels are passed in the pool of unscheduled threads
     */
    @ConfigFieldKey("enabled-thread-pool")
    private boolean enabledThreadPool;

    /**
     * Is the label passed in the schedule/scheduleAtFixedRate/scheduleWithFixedDelay method of the scheduled thread
     * pool?
     */
    @ConfigFieldKey("enabled-scheduler")
    private boolean enabledScheduler;

    public boolean isEnabledThread() {
        return enabledThread;
    }

    public void setEnabledThread(boolean enabledThread) {
        this.enabledThread = enabledThread;
    }

    public boolean isEnabledThreadPool() {
        return enabledThreadPool;
    }

    public void setEnabledThreadPool(boolean enabledThreadPool) {
        this.enabledThreadPool = enabledThreadPool;
    }

    public boolean isEnabledScheduler() {
        return enabledScheduler;
    }

    public void setEnabledScheduler(boolean enabledScheduler) {
        this.enabledScheduler = enabledScheduler;
    }
}