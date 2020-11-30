/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation;


import com.wuda.foundation.commons.impl.jooq.generation.tables.AdministrativeUnit;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Email;
import com.wuda.foundation.commons.impl.jooq.generation.tables.FlowHistory;
import com.wuda.foundation.commons.impl.jooq.generation.tables.MenuItem;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Phone;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKey;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKeyDefinition;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyMount;
import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyValue;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Task;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TaskLog;
import com.wuda.foundation.commons.impl.jooq.generation.tables.TaskPhase;
import com.wuda.foundation.commons.impl.jooq.generation.tables.Variable;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.AdministrativeUnitRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.EmailRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.FlowHistoryRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.MenuItemRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PhoneRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyKeyDefinitionRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyKeyRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyMountRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.PropertyValueRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.TaskLogRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.TaskPhaseRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.TaskRecord;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.VariableRecord;

import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>foundation_commons</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<EmailRecord, ULong> IDENTITY_EMAIL = Identities0.IDENTITY_EMAIL;
    public static final Identity<MenuItemRecord, ULong> IDENTITY_MENU_ITEM = Identities0.IDENTITY_MENU_ITEM;
    public static final Identity<PhoneRecord, ULong> IDENTITY_PHONE = Identities0.IDENTITY_PHONE;
    public static final Identity<PropertyKeyRecord, ULong> IDENTITY_PROPERTY_KEY = Identities0.IDENTITY_PROPERTY_KEY;
    public static final Identity<PropertyKeyDefinitionRecord, ULong> IDENTITY_PROPERTY_KEY_DEFINITION = Identities0.IDENTITY_PROPERTY_KEY_DEFINITION;
    public static final Identity<PropertyMountRecord, ULong> IDENTITY_PROPERTY_MOUNT = Identities0.IDENTITY_PROPERTY_MOUNT;
    public static final Identity<PropertyValueRecord, ULong> IDENTITY_PROPERTY_VALUE = Identities0.IDENTITY_PROPERTY_VALUE;
    public static final Identity<TaskRecord, ULong> IDENTITY_TASK = Identities0.IDENTITY_TASK;
    public static final Identity<TaskLogRecord, ULong> IDENTITY_TASK_LOG = Identities0.IDENTITY_TASK_LOG;
    public static final Identity<TaskPhaseRecord, ULong> IDENTITY_TASK_PHASE = Identities0.IDENTITY_TASK_PHASE;
    public static final Identity<VariableRecord, ULong> IDENTITY_VARIABLE = Identities0.IDENTITY_VARIABLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AdministrativeUnitRecord> KEY_ADMINISTRATIVE_UNIT_PRIMARY = UniqueKeys0.KEY_ADMINISTRATIVE_UNIT_PRIMARY;
    public static final UniqueKey<EmailRecord> KEY_EMAIL_PRIMARY = UniqueKeys0.KEY_EMAIL_PRIMARY;
    public static final UniqueKey<EmailRecord> KEY_EMAIL_IDX_EMAIL_UNIQUE = UniqueKeys0.KEY_EMAIL_IDX_EMAIL_UNIQUE;
    public static final UniqueKey<FlowHistoryRecord> KEY_FLOW_HISTORY_PRIMARY = UniqueKeys0.KEY_FLOW_HISTORY_PRIMARY;
    public static final UniqueKey<MenuItemRecord> KEY_MENU_ITEM_PRIMARY = UniqueKeys0.KEY_MENU_ITEM_PRIMARY;
    public static final UniqueKey<PhoneRecord> KEY_PHONE_PRIMARY = UniqueKeys0.KEY_PHONE_PRIMARY;
    public static final UniqueKey<PhoneRecord> KEY_PHONE_IDX_PHONE_NUMBER = UniqueKeys0.KEY_PHONE_IDX_PHONE_NUMBER;
    public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_PRIMARY = UniqueKeys0.KEY_PROPERTY_KEY_PRIMARY;
    public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_IDX_UNIQUE = UniqueKeys0.KEY_PROPERTY_KEY_IDX_UNIQUE;
    public static final UniqueKey<PropertyKeyDefinitionRecord> KEY_PROPERTY_KEY_DEFINITION_PRIMARY = UniqueKeys0.KEY_PROPERTY_KEY_DEFINITION_PRIMARY;
    public static final UniqueKey<PropertyMountRecord> KEY_PROPERTY_MOUNT_PRIMARY = UniqueKeys0.KEY_PROPERTY_MOUNT_PRIMARY;
    public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_PRIMARY = UniqueKeys0.KEY_PROPERTY_VALUE_PRIMARY;
    public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_IDX_ATTR_VALUE = UniqueKeys0.KEY_PROPERTY_VALUE_IDX_ATTR_VALUE;
    public static final UniqueKey<TaskRecord> KEY_TASK_PRIMARY = UniqueKeys0.KEY_TASK_PRIMARY;
    public static final UniqueKey<TaskLogRecord> KEY_TASK_LOG_PRIMARY = UniqueKeys0.KEY_TASK_LOG_PRIMARY;
    public static final UniqueKey<TaskPhaseRecord> KEY_TASK_PHASE_PRIMARY = UniqueKeys0.KEY_TASK_PHASE_PRIMARY;
    public static final UniqueKey<VariableRecord> KEY_VARIABLE_PRIMARY = UniqueKeys0.KEY_VARIABLE_PRIMARY;
    public static final UniqueKey<VariableRecord> KEY_VARIABLE_IDX_OWNER = UniqueKeys0.KEY_VARIABLE_IDX_OWNER;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<EmailRecord, ULong> IDENTITY_EMAIL = Internal.createIdentity(Email.EMAIL, Email.EMAIL.EMAIL_ID);
        public static Identity<MenuItemRecord, ULong> IDENTITY_MENU_ITEM = Internal.createIdentity(MenuItem.MENU_ITEM, MenuItem.MENU_ITEM.MENU_ITEM_ID);
        public static Identity<PhoneRecord, ULong> IDENTITY_PHONE = Internal.createIdentity(Phone.PHONE, Phone.PHONE.PHONE_ID);
        public static Identity<PropertyKeyRecord, ULong> IDENTITY_PROPERTY_KEY = Internal.createIdentity(PropertyKey.PROPERTY_KEY, PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID);
        public static Identity<PropertyKeyDefinitionRecord, ULong> IDENTITY_PROPERTY_KEY_DEFINITION = Internal.createIdentity(PropertyKeyDefinition.PROPERTY_KEY_DEFINITION, PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.PROPERTY_DEFINITION_ID);
        public static Identity<PropertyMountRecord, ULong> IDENTITY_PROPERTY_MOUNT = Internal.createIdentity(PropertyMount.PROPERTY_MOUNT, PropertyMount.PROPERTY_MOUNT.ID);
        public static Identity<PropertyValueRecord, ULong> IDENTITY_PROPERTY_VALUE = Internal.createIdentity(PropertyValue.PROPERTY_VALUE, PropertyValue.PROPERTY_VALUE.PROPERTY_VALUE_ID);
        public static Identity<TaskRecord, ULong> IDENTITY_TASK = Internal.createIdentity(Task.TASK, Task.TASK.TASK_ID);
        public static Identity<TaskLogRecord, ULong> IDENTITY_TASK_LOG = Internal.createIdentity(TaskLog.TASK_LOG, TaskLog.TASK_LOG.TASK_LOG_ID);
        public static Identity<TaskPhaseRecord, ULong> IDENTITY_TASK_PHASE = Internal.createIdentity(TaskPhase.TASK_PHASE, TaskPhase.TASK_PHASE.TASK_PHASE_ID);
        public static Identity<VariableRecord, ULong> IDENTITY_VARIABLE = Internal.createIdentity(Variable.VARIABLE, Variable.VARIABLE.VARIABLE_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AdministrativeUnitRecord> KEY_ADMINISTRATIVE_UNIT_PRIMARY = Internal.createUniqueKey(AdministrativeUnit.ADMINISTRATIVE_UNIT, "KEY_administrative_unit_PRIMARY", new TableField[] { AdministrativeUnit.ADMINISTRATIVE_UNIT.ADMINISTRATIVE_UNIT_ID }, true);
        public static final UniqueKey<EmailRecord> KEY_EMAIL_PRIMARY = Internal.createUniqueKey(Email.EMAIL, "KEY_email_PRIMARY", new TableField[] { Email.EMAIL.EMAIL_ID }, true);
        public static final UniqueKey<EmailRecord> KEY_EMAIL_IDX_EMAIL_UNIQUE = Internal.createUniqueKey(Email.EMAIL, "KEY_email_idx_email_unique", new TableField[] { Email.EMAIL.ADDRESS, Email.EMAIL.IS_DELETED }, true);
        public static final UniqueKey<FlowHistoryRecord> KEY_FLOW_HISTORY_PRIMARY = Internal.createUniqueKey(FlowHistory.FLOW_HISTORY, "KEY_flow_history_PRIMARY", new TableField[] { FlowHistory.FLOW_HISTORY.FLOW_HISTORY_ID }, true);
        public static final UniqueKey<MenuItemRecord> KEY_MENU_ITEM_PRIMARY = Internal.createUniqueKey(MenuItem.MENU_ITEM, "KEY_menu_item_PRIMARY", new TableField[] { MenuItem.MENU_ITEM.MENU_ITEM_ID }, true);
        public static final UniqueKey<PhoneRecord> KEY_PHONE_PRIMARY = Internal.createUniqueKey(Phone.PHONE, "KEY_phone_PRIMARY", new TableField[] { Phone.PHONE.PHONE_ID }, true);
        public static final UniqueKey<PhoneRecord> KEY_PHONE_IDX_PHONE_NUMBER = Internal.createUniqueKey(Phone.PHONE, "KEY_phone_idx_phone_number", new TableField[] { Phone.PHONE.NUMBER, Phone.PHONE.IS_DELETED }, true);
        public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_PRIMARY = Internal.createUniqueKey(PropertyKey.PROPERTY_KEY, "KEY_property_key_PRIMARY", new TableField[] { PropertyKey.PROPERTY_KEY.PROPERTY_KEY_ID }, true);
        public static final UniqueKey<PropertyKeyRecord> KEY_PROPERTY_KEY_IDX_UNIQUE = Internal.createUniqueKey(PropertyKey.PROPERTY_KEY, "KEY_property_key_idx_unique", new TableField[] { PropertyKey.PROPERTY_KEY.OWNER_IDENTIFIER, PropertyKey.PROPERTY_KEY.OWNER_TYPE, PropertyKey.PROPERTY_KEY.KEY, PropertyKey.PROPERTY_KEY.IS_DELETED }, true);
        public static final UniqueKey<PropertyKeyDefinitionRecord> KEY_PROPERTY_KEY_DEFINITION_PRIMARY = Internal.createUniqueKey(PropertyKeyDefinition.PROPERTY_KEY_DEFINITION, "KEY_property_key_definition_PRIMARY", new TableField[] { PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.PROPERTY_DEFINITION_ID }, true);
        public static final UniqueKey<PropertyMountRecord> KEY_PROPERTY_MOUNT_PRIMARY = Internal.createUniqueKey(PropertyMount.PROPERTY_MOUNT, "KEY_property_mount_PRIMARY", new TableField[] { PropertyMount.PROPERTY_MOUNT.ID }, true);
        public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_PRIMARY = Internal.createUniqueKey(PropertyValue.PROPERTY_VALUE, "KEY_property_value_PRIMARY", new TableField[] { PropertyValue.PROPERTY_VALUE.PROPERTY_VALUE_ID }, true);
        public static final UniqueKey<PropertyValueRecord> KEY_PROPERTY_VALUE_IDX_ATTR_VALUE = Internal.createUniqueKey(PropertyValue.PROPERTY_VALUE, "KEY_property_value_idx_attr_value", new TableField[] { PropertyValue.PROPERTY_VALUE.PROPERTY_KEY_ID, PropertyValue.PROPERTY_VALUE.VALUE, PropertyValue.PROPERTY_VALUE.IS_DELETED }, true);
        public static final UniqueKey<TaskRecord> KEY_TASK_PRIMARY = Internal.createUniqueKey(Task.TASK, "KEY_task_PRIMARY", new TableField[] { Task.TASK.TASK_ID }, true);
        public static final UniqueKey<TaskLogRecord> KEY_TASK_LOG_PRIMARY = Internal.createUniqueKey(TaskLog.TASK_LOG, "KEY_task_log_PRIMARY", new TableField[] { TaskLog.TASK_LOG.TASK_LOG_ID }, true);
        public static final UniqueKey<TaskPhaseRecord> KEY_TASK_PHASE_PRIMARY = Internal.createUniqueKey(TaskPhase.TASK_PHASE, "KEY_task_phase_PRIMARY", new TableField[] { TaskPhase.TASK_PHASE.TASK_PHASE_ID }, true);
        public static final UniqueKey<VariableRecord> KEY_VARIABLE_PRIMARY = Internal.createUniqueKey(Variable.VARIABLE, "KEY_variable_PRIMARY", new TableField[] { Variable.VARIABLE.VARIABLE_ID }, true);
        public static final UniqueKey<VariableRecord> KEY_VARIABLE_IDX_OWNER = Internal.createUniqueKey(Variable.VARIABLE, "KEY_variable_idx_owner", new TableField[] { Variable.VARIABLE.OWNER_TYPE, Variable.VARIABLE.OWNER_IDENTIFIER }, true);
    }
}
