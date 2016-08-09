package com.unidev.polydata.domain;

import java.util.HashMap;

/**
 * Basic storage for polydata records
 */
public class BasicPoly extends HashMap<String, Object> implements Poly {

    public static BasicPoly newPoly() {return new BasicPoly(); }

    public static BasicPoly newPoly(String id) {return new BasicPoly()._id(id);}

    /**
     * Fetch metadata by key, if value is missing, null is returned
     * @param key Metadata key
     * @return value by key or null
     */
    public <T> T fetch(String key) {
        if (!super.containsKey(key)) {
            return null;
        }
        return (T) get(key);
    }

    /**
     * Return default by key, if value is missing, defaultValue is returned
     * @param key
     * @param defaultValue
     * @param <T>
     * @return
     */
    public <T> T fetch(String key, T defaultValue) {
        if (!super.containsKey(key)) {
            return defaultValue;
        }
        return (T) get(key);
    }

    public String link() {
        return fetch(LINK_KEY);
    }

    public String _id() {
        return fetch(ID_KEY);
    }

    public BasicPoly _id(String id) {
        put(ID_KEY, id);
        return this;
    }

    public BasicPoly link(String link) {
        put(LINK_KEY, link);
        return this;
    }

    public String get_id() {
        return fetch(ID_KEY);
    }

    public void set_id(String _id) {
        put(ID_KEY, _id);
    }

    public String getLink() {
        return fetch(LINK_KEY);
    }

    public void setLink(String link) {
        put(LINK_KEY, link);
    }

}
