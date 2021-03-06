/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.jooq.code.generation.commons.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 流程处理历史记录
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlowHistory implements Serializable {

    private static final long serialVersionUID = -868147986;

    private ULong         flowHistoryId;
    private UByte         currentState;
    private UByte         event;
    private UByte         nextState;
    private UByte         flowVersion;
    private String        description;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public FlowHistory() {}

    public FlowHistory(FlowHistory value) {
        this.flowHistoryId = value.flowHistoryId;
        this.currentState = value.currentState;
        this.event = value.event;
        this.nextState = value.nextState;
        this.flowVersion = value.flowVersion;
        this.description = value.description;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public FlowHistory(
        ULong         flowHistoryId,
        UByte         currentState,
        UByte         event,
        UByte         nextState,
        UByte         flowVersion,
        String        description,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.flowHistoryId = flowHistoryId;
        this.currentState = currentState;
        this.event = event;
        this.nextState = nextState;
        this.flowVersion = flowVersion;
        this.description = description;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getFlowHistoryId() {
        return this.flowHistoryId;
    }

    public void setFlowHistoryId(ULong flowHistoryId) {
        this.flowHistoryId = flowHistoryId;
    }

    public UByte getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(UByte currentState) {
        this.currentState = currentState;
    }

    public UByte getEvent() {
        return this.event;
    }

    public void setEvent(UByte event) {
        this.event = event;
    }

    public UByte getNextState() {
        return this.nextState;
    }

    public void setNextState(UByte nextState) {
        this.nextState = nextState;
    }

    public UByte getFlowVersion() {
        return this.flowVersion;
    }

    public void setFlowVersion(UByte flowVersion) {
        this.flowVersion = flowVersion;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlowHistory (");

        sb.append(flowHistoryId);
        sb.append(", ").append(currentState);
        sb.append(", ").append(event);
        sb.append(", ").append(nextState);
        sb.append(", ").append(flowVersion);
        sb.append(", ").append(description);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
