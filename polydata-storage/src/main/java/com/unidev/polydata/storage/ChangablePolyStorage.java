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
package com.unidev.polydata.storage;

import com.unidev.polydata.domain.Poly;

/**
 * Poly storage which allows changes on stored records
 */
public interface ChangablePolyStorage extends PolyStorage {

    /**
     * Persist poly into storage
     * @param poly Poly to store
     * @param <P>
     * @return
     */
    <P extends Poly> P persist(P poly);

    /**
     * Remove poly from storage
     * @param id
     * @return true - if success, false - if poly not found
     */
    boolean remove(String id);

}