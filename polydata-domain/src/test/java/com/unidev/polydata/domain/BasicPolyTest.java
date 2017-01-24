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

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.nullValue;

/**
 * Tests on basic poly operations
 */
public class BasicPolyTest {

    @Test
    public void polyCreationTest() {
        BasicPoly newPoly = BasicPoly.newPoly();

        assertThat(newPoly, is(not(nullValue())));
        assertThat(newPoly.size(), is(0));

        BasicPoly potatoPoly = BasicPoly.newPoly("potato");

        assertThat(potatoPoly, is(not(nullValue())));
        assertThat(potatoPoly.size(), is(1));
        assertThat(potatoPoly._id(), is("potato"));
    }

}
