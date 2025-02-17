/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.dynamictp.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.dromara.dynamictp.common.em.QueueTypeEnum;

import java.util.Set;

/**
 * Dynamic ThreadPool main properties.
 *
 * @author yanhom
 * @since 1.0.0
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DtpExecutorProps extends TpExecutorProps {

    /**
     * Executor type, used in create phase, see {@link org.dromara.dynamictp.core.executor.ExecutorType}
     */
    private String executorType;

    /**
     * Blocking queue type, see {@link QueueTypeEnum}
     */
    private String queueType = QueueTypeEnum.VARIABLE_LINKED_BLOCKING_QUEUE.getName();

    /**
     * If fair strategy, for SynchronousQueue
     */
    private boolean fair = false;

    /**
     * Thread name prefix.
     */
    private String threadNamePrefix = "dtp";

    /**
     * Whether to wait for scheduled tasks to complete on shutdown,
     * not interrupting running tasks and executing all tasks in the queue.
     */
    private boolean waitForTasksToCompleteOnShutdown = true;

    /**
     * The maximum number of seconds that this executor is supposed to block
     * on shutdown in order to wait for remaining tasks to complete their execution
     * before the rest of the container continues to shut down.
     */
    private int awaitTerminationSeconds = 3;

    /**
     * If pre start all core threads.
     */
    private boolean preStartAllCoreThreads = false;

    /**
     * If enhance reject.
     */
    private boolean rejectEnhanced = true;

    /**
     * Plugin names.
     */
    private Set<String> pluginNames;
}
