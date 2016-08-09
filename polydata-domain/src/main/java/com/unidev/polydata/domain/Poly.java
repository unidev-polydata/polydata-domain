package com.unidev.polydata.domain;

import java.util.Map;

/**
 * Poly  - storage for polydata records
 * Each poly predefined field for _id and link
 */
public interface Poly extends Map<String, Object> {

    String LINK_KEY = "link";
    String ID_KEY = "_id";

    /**
     * Fetch Poly ID
     * @return poly id or null
     */
    String _id();

    /**
     * Set poly id
     * @param id New poly id
     * @return poly instance
     */
    Poly _id(String id);

    /**
     * Fetch poly link field
     * @return
     */
    String link();

    /**
     * Set poly link
     * @param link
     * @return
     */
    Poly link(String link);



}
