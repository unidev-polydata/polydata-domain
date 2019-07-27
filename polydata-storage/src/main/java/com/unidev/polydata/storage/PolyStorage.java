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
import com.unidev.polydata.domain.PolyList;
import com.unidev.polydata.domain.PolyMap;
import com.unidev.polydata.domain.PolyQuery;

import java.util.Optional;

/**
 * Generic poly storage
 */
public interface PolyStorage {

    /**
     * Fetch storage metadata
     */
    <P extends Poly> Optional<P> metadata(String container);

    /**
     * Fetch poly record by id
     * @param id Poly id
     * @return stored poly or null if nothing found
     */
     <P extends Poly> Optional<P> fetchById(String container, String id);

     <P extends PolyList> Optional<P> fetchPolyList(String container);

     <P extends PolyMap> Optional<P> fetchPolyMap(String container);

    /**
     * Persist poly into storage
     * @param poly Poly to store
     */
    <P extends Poly> P persist(String container, P poly);

    <P extends Poly> P persistMetadata(String container, P metadata);

    <P extends PolyList> P persist(String container,P polyList);

    <P extends PolyMap> P persist(String container,P polyMap);

    <P extends PolyList> P query(String container, PolyQuery polyQuery);

    /**
     * Remove poly from storage
     * @return true - if success, false - if poly not found
     */
    boolean removePoly(String container, String id);

    /**
     * Remove poly list by container
     */
    boolean removePolyList(String container);

    /**
     * Remove poly map.
     */
    boolean removePolyMap(String container);

}
