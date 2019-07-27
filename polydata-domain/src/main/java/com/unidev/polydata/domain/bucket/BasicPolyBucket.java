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
package com.unidev.polydata.domain.bucket;

import com.unidev.polydata.domain.BasicPoly;
import com.unidev.polydata.domain.BasicPolyList;

/**
 * Basic poly bucket
 */
@Deprecated
public class BasicPolyBucket implements PolyBucket {

    private BasicPoly metadata;
    private BasicPolyList polys;

    public static BasicPolyBucket newBucket() {
        return new BasicPolyBucket();
    }

    public BasicPolyBucket() {}

    @Override
    public BasicPoly metadata() {
        return metadata;
    }

    @Override
    public BasicPolyList polys() {
        return polys;
    }


    public BasicPolyBucket metadata(BasicPoly metadata) {
        this.metadata = metadata;
        return this;
    }

    public BasicPolyBucket polys(BasicPolyList polys) {
        this.polys = polys;
        return this;
    }

    public BasicPoly getMetadata() {
        return metadata;
    }

    public void setMetadata(BasicPoly metadata) {
        this.metadata = metadata;
    }

    public BasicPolyList getPolys() {
        return polys;
    }

    public void setPolys(BasicPolyList polys) {
        this.polys = polys;
    }
}
