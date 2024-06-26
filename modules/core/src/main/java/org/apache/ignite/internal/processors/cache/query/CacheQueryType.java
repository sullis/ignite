/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.cache.query;

/**
 * Cache query type.
 * <p>
 * Used in {@link org.apache.ignite.events.CacheQueryExecutedEvent} and {@link org.apache.ignite.events.CacheQueryReadEvent}
 * to identify the type of query for which an event was fired.
 *
 * @see org.apache.ignite.events.CacheQueryExecutedEvent#queryType()
 * @see org.apache.ignite.events.CacheQueryReadEvent#queryType()
 */
public enum CacheQueryType {
    /** SQL query. */
    SQL,

    /** SQL fields query. */
    SQL_FIELDS,

    /** Full text query. */
    FULL_TEXT,

    /** Scan query. */
    SCAN,

    /** Continuous query. */
    CONTINUOUS,

    /** SPI query. */
    SPI,

    /** Index query. */
    INDEX
}
