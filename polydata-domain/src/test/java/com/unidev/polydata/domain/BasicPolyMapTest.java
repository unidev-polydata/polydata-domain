package com.unidev.polydata.domain;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BasicPolyMapTest {

    @Test
    public void testEmptyMap() {
        BasicPolyMap basicPolyMap = BasicPolyMap.basicPolyMap();
        assertThat(basicPolyMap, is(notNullValue()));
        assertThat(basicPolyMap.map(), is(notNullValue()));
        assertThat(basicPolyMap.metadata(), is(notNullValue()));
    }

    @Test
    public void testFetchingRecords() {
        BasicPolyMap basicPolyMap = BasicPolyMap.basicPolyMap();

        assertThat(basicPolyMap.hasPoly("test"), is(false));

        BasicPoly basicPoly = BasicPoly.newPoly("test");
        basicPoly.put("key", "value");
        basicPolyMap.put(basicPoly);

        assertThat(basicPolyMap.hasPoly("test"), is(true));

        Optional<BasicPoly> test = basicPolyMap.polyById("test");
        assertThat(test.isPresent(), is(true));
        assertThat(test.get().fetch("key"), is("value"));
    }
}
