/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.item.tables;


import com.wuda.foundation.jooq.code.generation.item.FoundationItem;
import com.wuda.foundation.jooq.code.generation.item.Indexes;
import com.wuda.foundation.jooq.code.generation.item.Keys;
import com.wuda.foundation.jooq.code.generation.item.tables.records.ItemBelongsToGroupRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * 表示item所属的组。比如店铺是一种组，分类也是一种组，等等。item与所有的组的关系都记录在这个表里。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemBelongsToGroup extends TableImpl<ItemBelongsToGroupRecord> {

    private static final long serialVersionUID = -1969498033;

    /**
     * The reference instance of <code>foundation_item.item_belongs_to_group</code>
     */
    public static final ItemBelongsToGroup ITEM_BELONGS_TO_GROUP = new ItemBelongsToGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemBelongsToGroupRecord> getRecordType() {
        return ItemBelongsToGroupRecord.class;
    }

    /**
     * The column <code>foundation_item.item_belongs_to_group.id</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, ULong> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_item.item_belongs_to_group.item_id</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, ULong> ITEM_ID = createField(DSL.name("item_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_item.item_belongs_to_group.group_type</code>. 组的类型，比如店铺是一种组
     */
    public final TableField<ItemBelongsToGroupRecord, UShort> GROUP_TYPE = createField(DSL.name("group_type"), org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "组的类型，比如店铺是一种组");

    /**
     * The column <code>foundation_item.item_belongs_to_group.group_identifier</code>. 组的identifier，比如当group_type为店铺时，则组的唯一标记就是店铺ID
     */
    public final TableField<ItemBelongsToGroupRecord, ULong> GROUP_IDENTIFIER = createField(DSL.name("group_identifier"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "组的identifier，比如当group_type为店铺时，则组的唯一标记就是店铺ID");

    /**
     * The column <code>foundation_item.item_belongs_to_group.create_time</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_item.item_belongs_to_group.create_user_id</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_item.item_belongs_to_group.last_modify_time</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_item.item_belongs_to_group.last_modify_user_id</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_item.item_belongs_to_group.is_deleted</code>.
     */
    public final TableField<ItemBelongsToGroupRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_item.item_belongs_to_group</code> table reference
     */
    public ItemBelongsToGroup() {
        this(DSL.name("item_belongs_to_group"), null);
    }

    /**
     * Create an aliased <code>foundation_item.item_belongs_to_group</code> table reference
     */
    public ItemBelongsToGroup(String alias) {
        this(DSL.name(alias), ITEM_BELONGS_TO_GROUP);
    }

    /**
     * Create an aliased <code>foundation_item.item_belongs_to_group</code> table reference
     */
    public ItemBelongsToGroup(Name alias) {
        this(alias, ITEM_BELONGS_TO_GROUP);
    }

    private ItemBelongsToGroup(Name alias, Table<ItemBelongsToGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private ItemBelongsToGroup(Name alias, Table<ItemBelongsToGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("表示item所属的组。比如店铺是一种组，分类也是一种组，等等。item与所有的组的关系都记录在这个表里。"), TableOptions.table());
    }

    public <O extends Record> ItemBelongsToGroup(Table<O> child, ForeignKey<O, ItemBelongsToGroupRecord> key) {
        super(child, key, ITEM_BELONGS_TO_GROUP);
    }

    @Override
    public Schema getSchema() {
        return FoundationItem.FOUNDATION_ITEM;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ITEM_BELONGS_TO_GROUP_IDX_ITEM_ID);
    }

    @Override
    public Identity<ItemBelongsToGroupRecord, ULong> getIdentity() {
        return Keys.IDENTITY_ITEM_BELONGS_TO_GROUP;
    }

    @Override
    public UniqueKey<ItemBelongsToGroupRecord> getPrimaryKey() {
        return Keys.KEY_ITEM_BELONGS_TO_GROUP_PRIMARY;
    }

    @Override
    public List<UniqueKey<ItemBelongsToGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemBelongsToGroupRecord>>asList(Keys.KEY_ITEM_BELONGS_TO_GROUP_PRIMARY);
    }

    @Override
    public ItemBelongsToGroup as(String alias) {
        return new ItemBelongsToGroup(DSL.name(alias), this);
    }

    @Override
    public ItemBelongsToGroup as(Name alias) {
        return new ItemBelongsToGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemBelongsToGroup rename(String name) {
        return new ItemBelongsToGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemBelongsToGroup rename(Name name) {
        return new ItemBelongsToGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, UShort, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
