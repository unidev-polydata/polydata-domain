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
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicPolyListTest {

    @Test
    public void basicListOperations() {
        BasicPolyList polyList = BasicPolyList.newList();

        assertThat(polyList, is(notNullValue()));

        BasicPoly potato = BasicPoly.newPoly("potato");
        BasicPoly tomato = BasicPoly.newPoly("tomato");

        polyList.add(potato);
        polyList.add(tomato);

        assertThat(polyList.size(), is(2));
    }

    @Test
    public void testFetchPolyById() {
        BasicPolyList polyList = BasicPolyList.newList();
        BasicPoly potato = BasicPoly.newPoly("potato");

        polyList.add(potato);

        BasicPoly poly = polyList.fetchPoly("potato");
        assertThat(poly, is(notNullValue()));
        assertThat(poly._id(), is("potato"));

        BasicPoly notExistingPoly = polyList.fetchPoly("123");
        assertThat(notExistingPoly, is(nullValue()));

    }

    @Test
    public void testHasPoly() {
        BasicPolyList polyList = BasicPolyList.newList();
        BasicPoly potato = BasicPoly.newPoly("potato");
        polyList.add(potato);

        assertThat(polyList.hasPoly("potato"), is(true));
        assertThat(polyList.hasPoly("tomato"), is(false));
    }

}
