/**
 * Copyright (c) 2015,2016 Denis O <denis@universal-development.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.unidev.polydata.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Basic storage for polydata records
 */
public class BasicPoly implements Poly {

    protected Map<String, Object> data;
    protected Poly metadata;

    /**
     * Build new poly instance
     * @return new poly instance
     */
    public static BasicPoly newPoly() {
        return new BasicPoly();
    }

    /**
     * New poly instance with id
     * @param id Poly id
     * @return new poly instance with provided id
     */
    public static BasicPoly newPoly(String id) {
        return new BasicPoly()._id(id);
    }

    public BasicPoly(Map<String, Object> data, Poly metadata) {
        this.data = data;
        this.metadata = metadata;
    }

    public BasicPoly() {
        data = new HashMap<>();
        metadata = new BasicPoly(new HashMap<>(), null);
    }

    /**
     * Fetch metadata by key, if value is missing, null is returned
     * @param key Metadata key
     * @return value by key or null
     */
    public <T> T fetch(String key) {
        if (!data.containsKey(key)) {
            return null;
        }
        return (T) data.get(key);
    }

    /**
     * Return default by key, if value is missing, defaultValue is returned
     * @param key
     * @param defaultValue
     * @param <T>
     * @return
     */
    public <T> T fetch(String key, T defaultValue) {
        if (!data.containsKey(key)) {
            return defaultValue;
        }
        return (T) data.get(key);
    }

    @Override
    public <P extends Poly> P delete(String key) {
        data.remove(key);
        return (P) this;
    }

    @Override
    public Map<String, Object> getData() {
        return data;
    }

    @Override
    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public Map<String, Object> data() {
        return data;
    }

    @Override
    public <P extends Poly> P withData(Map<String, Object> data) {
        this.data = data;
        return (P) this;
    }

    @Override
    public Poly getMetadata() {
        return this.metadata;
    }

    @Override
    public Poly metadata() {
        return metadata;
    }

    @Override
    public <P extends Poly> P withMetadata(Poly metadata) {
        this.metadata = metadata;
        return (P) this;
    }

    @Override
    public void setMetadata(Poly metadata) {
        this.metadata = metadata;
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

    @Override
    public <T, P extends Poly> P with(String key, T value) {
        put(key, value);
        return (P) this;
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

    @Override
    public boolean containsKey(String key) {
        return data.containsKey(key);
    }

    @Override
    public <T> void put(String key, T value) {
        data.put(key, value);
    }
}
