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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * List of basic poly records
 */
public class BasicPolyMap implements PolyMap<BasicPoly>  {

    private Map<String, BasicPoly> map;
    private Poly metadata;

    public static BasicPolyMap basicPolyMap() {
        return new BasicPolyMap();
    }

    public BasicPolyMap() {
        metadata = new BasicPoly();
        map = new HashMap<>();
    }

    @Override
    public Poly metadata() {
        return metadata;
    }

    @Override
    public PolyMap<BasicPoly> withMetadata(Poly meta) {
        metadata = meta;
        return this;
    }

    @Override
    public Map<String, BasicPoly> map() {
        return map;
    }

    @Override
    public PolyMap<BasicPoly> withMap(Map<String, BasicPoly> map) {
        this.map = map;
        return this;
    }

    @Override
    public Optional<BasicPoly> polyById(String id) {
        if (map.containsKey(id)) {
            return Optional.of(map.get(id));
        }
        return Optional.empty();
    }

    @Override
    public <P extends Poly> PolyMap<BasicPoly> put(P poly) {
        map.put(poly._id(), (BasicPoly) poly);
        return this;
    }

    @Override
    public <P extends Poly> PolyMap<BasicPoly> delete(String polyId) {
        map.remove(polyId);
        return this;
    }

    @Override
    public boolean hasPoly(String polyId) {
        return polyById(polyId).isPresent();
    }


}
