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

import com.unidev.polydata.domain.Poly;
import com.unidev.polydata.domain.PolyList;

import java.io.Serializable;

/**
 * Bucket of polys contains metadata and list of polys
 */
@Deprecated
public interface PolyBucket extends Serializable {

    <P extends Poly> P metadata();

    <P extends PolyList> P polys();
}
