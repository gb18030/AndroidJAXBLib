/*
        Copyright 2014 Yevgen Kulik

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package com.kulik.android.jaxb.library.parser.chache;

import com.kulik.android.jaxb.library.parser.methodFieldAdapter.MethodFieldFactory;

import java.util.HashMap;
import java.util.List;

/**
 * User: kulik
 * Date: 11/27/12
 * Time: 10:52 AM
 */
public class ClassCacheManager {
    private static final String TAG = ClassCacheManager.class.getSimpleName();

    //TODO Refactoring make only one list for methods, and one for fields, or only one map;
    private HashMap<Class<?>, List<CacheEntity>> mAttributesFieldsChache;
    private HashMap<Class<?>, List<CacheEntity>> mElementsFieldsChache;
    private HashMap<Class<?>, List<CacheEntity>> mAttributesMethodsChache;
    private HashMap<Class<?>, List<CacheEntity>> mElementsMethodsChache;

    private HashMap<Class<?>, List<CacheWrapperEntity>> mElementsWrapperFieldsChache;
    private HashMap<Class<?>, List<CacheWrapperEntity>> mElementsWrapperMethodsChache;
    private HashMap<Class<?>, List<CacheEntity>> mValueMethodsChache;
    private HashMap<Class<?>, List<CacheEntity>> mValueFieldsChache;


    public ClassCacheManager() {
        mAttributesFieldsChache = new HashMap<Class<?>, List<CacheEntity>>();
        mElementsFieldsChache = new HashMap<Class<?>, List<CacheEntity>>();
        mAttributesMethodsChache = new HashMap<Class<?>, List<CacheEntity>>();
        mElementsMethodsChache = new HashMap<Class<?>, List<CacheEntity>>();
        mElementsWrapperFieldsChache = new HashMap<Class<?>, List<CacheWrapperEntity>>();
        mElementsWrapperMethodsChache = new HashMap<Class<?>, List<CacheWrapperEntity>>();
        mValueFieldsChache = new HashMap<Class<?>, List<CacheEntity>>();
        mValueMethodsChache = new HashMap<Class<?>, List<CacheEntity>>();

    }

    /**
     * Pushing List of anotated by {@link com.kulik.android.jaxb.library.Annotations.XmlAttribute} and <br/>
     * {@link com.kulik.android.jaxb.library.Annotations.XmlElement} to chache.
     *
     * @param clazz - necessary class
     * @param valueEntities
     * @return instance of necessary List of accessor fields, if
     */
    public void pushEntityToCache(Class<?> clazz,
                                  List<CacheEntity> attributesEntities,
                                  List<CacheEntity> elementsEntities,
                                  List<CacheWrapperEntity> cacheWrapperEntities,
                                  List<CacheEntity> valueEntities, MethodFieldFactory.EntityType entityType) {

        switch (entityType) {
            case FIELDS:
                mAttributesFieldsChache.put(clazz, attributesEntities);
                mElementsFieldsChache.put(clazz, elementsEntities);
                mElementsWrapperFieldsChache.put(clazz, cacheWrapperEntities);
                mValueFieldsChache.put(clazz, valueEntities);
                break;
            case METHODS:
                mAttributesMethodsChache.put(clazz, attributesEntities);
                mElementsMethodsChache.put(clazz, elementsEntities);
                mElementsWrapperMethodsChache.put(clazz, cacheWrapperEntities);
                mValueMethodsChache.put(clazz, valueEntities);
                break;
            default:
                throw new UnsupportedOperationException("Can't find cache with current entity type for fields");
        }
    }


    public List<CacheEntity> getChachedElementsEntityList(Class<?> clazz, MethodFieldFactory.EntityType entityType) {
        switch (entityType) {
            case FIELDS:
                return mElementsFieldsChache.get(clazz);
            case METHODS:
                return mElementsMethodsChache.get(clazz);
            default:
                throw new UnsupportedOperationException("Can't find cache with current entity type for methods");
        }
    }

    public List<CacheEntity> getChachedAttributesEntityList(Class<?> clazz, MethodFieldFactory.EntityType entityType) {
        switch (entityType) {
            case FIELDS:
                return mAttributesFieldsChache.get(clazz);
            case METHODS:
                return mAttributesMethodsChache.get(clazz);
            default:
                throw new NoSuchMethodError();
        }
    }

    public List<CacheWrapperEntity> getChachedWrappedElementsEntityList(Class<?> clazz, MethodFieldFactory.EntityType entityType) {
        switch (entityType) {
            case FIELDS:
                return mElementsWrapperFieldsChache.get(clazz);
            case METHODS:
                return mElementsWrapperMethodsChache.get(clazz);
            default:
                throw new UnsupportedOperationException("Can't find cache with current entity type for methods");
        }
    }

    public List<CacheEntity> getChachedValueEntityList(Class<?> clazz, MethodFieldFactory.EntityType entityType) {
        switch (entityType) {
            case FIELDS:
                return mValueFieldsChache.get(clazz);
            case METHODS:
                return mValueMethodsChache.get(clazz);
            default:
                throw new UnsupportedOperationException("Can't find cache with current entity type for methods");
        }
    }
}
