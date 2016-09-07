package com.unidev.polydata.storage;

import com.unidev.polydata.domain.Poly;

/**
 * Poly storage with metadata
 */
public interface PolyStorageWithMetadata extends PolyStorage  {

    /**
     * Fetch storage metadata
     * @return Storage metadata
     */
    Poly fetchMetadata();


}
