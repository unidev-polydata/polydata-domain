/**
 * Copyright (c) 2015,2016 Denis O <denis@universal-development.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.unidev.polydata.domain;

import java.util.Map;

/**
 * Poly  - storage for polydata records
 * Each poly predefined field for _id and link
 */
public interface Poly extends Map<String, Object> {

    String LINK_KEY = "link";
    String ID_KEY = "_id";

    /**
     * Fetch Poly ID
     * @return poly id or null
     */
    String _id();

    /**
     * Set poly id
     * @param id New poly id
     * @return poly instance
     */
    Poly _id(String id);

    /**
     * Fetch poly link field
     * @return
     */
    String link();

    /**
     * Set poly link
     * @param link
     * @return
     */
    Poly link(String link);

    /**
     * Set value in poly and return poly
     * @return Updated poly
     */
    <T, P extends Poly> P with(String key, T value);

    /**
     * Fetch metadata by key, if value is missing, null is returned
     */
    <T> T fetch(String key);

    /**
     * Return default by key, if value is missing, defaultValue is returned
     */
    <T> T fetch(String key, T defaultValue);



}
