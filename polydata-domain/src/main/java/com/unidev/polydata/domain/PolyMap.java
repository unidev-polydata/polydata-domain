/**
 * Copyright (c) 2017 Denis O <denis@universal-development.com>
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
import java.util.Optional;

/**
 * Map of polys.
 * @param <T>
 */
public interface PolyMap<T extends Poly> extends Poly {

    Poly metadata();

    PolyMap<T> withMetadata(Poly meta);

    Map<String, T> map();

    PolyMap<T> withMap(Map<String, T> map);

    /**
     * Get poly by id
     */
    Optional<T> polyById(String id);

    <P extends Poly> PolyMap<T> put(P poly);

    <P extends Poly> PolyMap<T> deletePoly(String polyId);

    boolean hasPoly(String polyId);
}


