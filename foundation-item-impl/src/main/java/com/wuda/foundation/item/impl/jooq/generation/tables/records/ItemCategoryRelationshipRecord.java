/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.item.impl.jooq.generation.tables.records;


import com.wuda.foundation.item.impl.jooq.generation.tables.ItemCategoryRelationship;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * 物品与分类的关系表，有很多设计是在物品表中放分类一，分类二，分类三这样的字段，这样设计的扩展性很弱
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemCategoryRelationshipRecord extends UpdatableRecordImpl<ItemCategoryRelationshipRecord> implements Record6<ULong, ULong, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 408851611;

    /**
     * Setter for <code>foundation_item.item_category_relationship.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_item.item_category_relationship.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_item.item_category_relationship.item_id</code>. item id
     */
    public void setItemId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_item.item_category_relationship.item_id</code>. item id
     */
    public ULong getItemId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_item.item_category_relationship.item_category_id</code>. item category id
     */
    public void setItemCategoryId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_item.item_category_relationship.item_category_id</code>. item category id
     */
    public ULong getItemCategoryId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>foundation_item.item_category_relationship.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_item.item_category_relationship.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>foundation_item.item_category_relationship.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_item.item_category_relationship.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_item.item_category_relationship.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_item.item_category_relationship.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<ULong, ULong, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<ULong, ULong, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ID;
    }

    @Override
    public Field<ULong> field2() {
        return ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ITEM_ID;
    }

    @Override
    public Field<ULong> field3() {
        return ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.ITEM_CATEGORY_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.CREATE_TIME;
    }

    @Override
    public Field<ULong> field5() {
        return ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.CREATE_USER_ID;
    }

    @Override
    public Field<ULong> field6() {
        return ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public ULong component2() {
        return getItemId();
    }

    @Override
    public ULong component3() {
        return getItemCategoryId();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public ULong component5() {
        return getCreateUserId();
    }

    @Override
    public ULong component6() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public ULong value2() {
        return getItemId();
    }

    @Override
    public ULong value3() {
        return getItemCategoryId();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public ULong value5() {
        return getCreateUserId();
    }

    @Override
    public ULong value6() {
        return getIsDeleted();
    }

    @Override
    public ItemCategoryRelationshipRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public ItemCategoryRelationshipRecord value2(ULong value) {
        setItemId(value);
        return this;
    }

    @Override
    public ItemCategoryRelationshipRecord value3(ULong value) {
        setItemCategoryId(value);
        return this;
    }

    @Override
    public ItemCategoryRelationshipRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public ItemCategoryRelationshipRecord value5(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public ItemCategoryRelationshipRecord value6(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public ItemCategoryRelationshipRecord values(ULong value1, ULong value2, ULong value3, LocalDateTime value4, ULong value5, ULong value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ItemCategoryRelationshipRecord
     */
    public ItemCategoryRelationshipRecord() {
        super(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP);
    }

    /**
     * Create a detached, initialised ItemCategoryRelationshipRecord
     */
    public ItemCategoryRelationshipRecord(ULong id, ULong itemId, ULong itemCategoryId, LocalDateTime createTime, ULong createUserId, ULong isDeleted) {
        super(ItemCategoryRelationship.ITEM_CATEGORY_RELATIONSHIP);

        set(0, id);
        set(1, itemId);
        set(2, itemCategoryId);
        set(3, createTime);
        set(4, createUserId);
        set(5, isDeleted);
    }
}
