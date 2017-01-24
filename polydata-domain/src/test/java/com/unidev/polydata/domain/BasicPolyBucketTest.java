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

import com.unidev.polydata.domain.bucket.BasicPolyBucket;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Basic poly bucket tests
 */
public class BasicPolyBucketTest {

    @Test
    public void testBasicPolyBucketOperations() {
        BasicPolyBucket polyBucket = BasicPolyBucket.newBucket()
                .metadata(BasicPoly.newPoly()._id("potato")).polys(BasicPolyList.newList());

        assertThat(polyBucket, is(notNullValue()));
        assertThat(polyBucket.metadata(), is(notNullValue()));
        assertThat(polyBucket.polys(), is(notNullValue()));

        assertThat(polyBucket.metadata()._id(), is("potato"));
    }



}
