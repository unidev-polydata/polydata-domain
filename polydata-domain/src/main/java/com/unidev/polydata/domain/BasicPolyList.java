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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * List of basic poly records
 */
public class BasicPolyList implements PolyList<BasicPoly>  {

    private List<BasicPoly> list;
    private Poly metadata;

    public static BasicPolyList newList() {
        return new BasicPolyList();
    }

    public BasicPolyList() {
        list = new ArrayList<>();
        metadata = new BasicPoly();
    }

    @Override
    public Poly metadata() {
        return metadata;
    }

    @Override
    public PolyList<BasicPoly> withMetadata(Poly metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public List<BasicPoly> list() {
        return list;
    }

    @Override
    public PolyList<BasicPoly> withList(List<BasicPoly> polys) {
        this.list = polys;
        return this;
    }

    @Override
    public Optional<BasicPoly> polyById(String id) {
        for(BasicPoly basicPoly : list) {
            if (basicPoly._id().equals(id)) {
                return Optional.of(basicPoly);
            }
        }
        return Optional.empty();
    }

    @Override
    public <P extends Poly> PolyList<BasicPoly> add(P poly) {
        list.add((BasicPoly) poly);
        return this;
    }

    @Override
    public boolean hasPoly(String polyId) {
        return polyById(polyId).isPresent();
    }

}
