package com.yinuo.training.collection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bill Lv on 7/12/16.
 */
public class CollectionTest {
    Collection collection;

    @Before
    public void setUp() {
        collection = new Collection();
    }

    @Test
    public void sort() throws Exception {
        collection.sort();
    }

    @Test
    public void arrayToList() {
        collection.arrayToList();
    }

    @Test
    public void aggregateMethods() {
        collection.aggregateMethods();
    }

    @Test
    public void map() {
        collection.map();
    }

}