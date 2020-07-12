/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.daos;


import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKey;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyKeyRecord;

import java.time.LocalDateTime;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 属性的key
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyKeyDao extends DAOImpl<PropertyKeyRecord, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey, ULong> {

    /**
     * Create a new PropertyKeyDao without any configuration
     */
    public PropertyKeyDao() {
        super(PropertyKey.PROPERTY_KEY, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey.class);
    }

    /**
     * Create a new PropertyKeyDao with an attached configuration
     */
    public PropertyKeyDao(Configuration configuration) {
        super(PropertyKey.PROPERTY_KEY, com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey.class, configuration);
    }

    @Override
    public ULong getId(com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey object) {
        return object.getPropertyKeyId();
    }

    /**
     * Fetch records that have <code>property_key_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfPropertyKeyId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>property_key_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByPropertyKeyId(ULong... values) {
        return fetch(PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>property_key_id = value</code>
     */
    public com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey fetchOneByPropertyKeyId(ULong value) {
        return fetchOne(PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID, value);
    }

    /**
     * Fetch records that have <code>key BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfKey(String lowerInclusive, String upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.KEY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>key IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByKey(String... values) {
        return fetch(PropertyKey.PROPERTY_KEY.KEY, values);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByType(UByte... values) {
        return fetch(PropertyKey.PROPERTY_KEY.TYPE, values);
    }

    /**
     * Fetch records that have <code>owner_type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfOwnerType(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.OWNER_TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>owner_type IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByOwnerType(UByte... values) {
        return fetch(PropertyKey.PROPERTY_KEY.OWNER_TYPE, values);
    }

    /**
     * Fetch records that have <code>owner_identifier BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfOwnerIdentifier(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.OWNER_IDENTIFIER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>owner_identifier IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByOwnerIdentifier(ULong... values) {
        return fetch(PropertyKey.PROPERTY_KEY.OWNER_IDENTIFIER, values);
    }

    /**
     * Fetch records that have <code>use BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfUse(UByte lowerInclusive, UByte upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.USE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>use IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByUse(UByte... values) {
        return fetch(PropertyKey.PROPERTY_KEY.USE, values);
    }

    /**
     * Fetch records that have <code>create_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfCreateTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.CREATE_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByCreateTime(LocalDateTime... values) {
        return fetch(PropertyKey.PROPERTY_KEY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfCreateUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.CREATE_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>create_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByCreateUserId(ULong... values) {
        return fetch(PropertyKey.PROPERTY_KEY.CREATE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>last_modify_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfLastModifyTime(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.LAST_MODIFY_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_time IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByLastModifyTime(LocalDateTime... values) {
        return fetch(PropertyKey.PROPERTY_KEY.LAST_MODIFY_TIME, values);
    }

    /**
     * Fetch records that have <code>last_modify_user_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfLastModifyUserId(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.LAST_MODIFY_USER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_modify_user_id IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByLastModifyUserId(ULong... values) {
        return fetch(PropertyKey.PROPERTY_KEY.LAST_MODIFY_USER_ID, values);
    }

    /**
     * Fetch records that have <code>is_deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchRangeOfIsDeleted(ULong lowerInclusive, ULong upperInclusive) {
        return fetchRange(PropertyKey.PROPERTY_KEY.IS_DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.wuda.foundation.commons.impl.jooq.generation.tables.pojos.PropertyKey> fetchByIsDeleted(ULong... values) {
        return fetch(PropertyKey.PROPERTY_KEY.IS_DELETED, values);
    }
}
