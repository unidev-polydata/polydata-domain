package com.unidev.polydata.storage;

import com.unidev.polydata.domain.Poly;

import java.util.Collection;

/**
 * Generic poly storage
 */
public interface PolyStorage {

    /**
     * Fetch poly record by id
     * @param id Poly id
     * @return stored poly or null if nothing found
     */
    Poly fetchById(String id);

    /**
     * List stored poly records
     * @return
     */
    Collection<Poly> list();
}
