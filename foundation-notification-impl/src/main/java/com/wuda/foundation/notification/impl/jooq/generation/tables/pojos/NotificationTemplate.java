/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.notification.impl.jooq.generation.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.ULong;


/**
 * 通知内容的模板
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationTemplate implements Serializable {

    private static final long serialVersionUID = 598103376;

    private ULong         notificationTemplateId;
    private String        name;
    private String        content;
    private String        description;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public NotificationTemplate() {}

    public NotificationTemplate(NotificationTemplate value) {
        this.notificationTemplateId = value.notificationTemplateId;
        this.name = value.name;
        this.content = value.content;
        this.description = value.description;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public NotificationTemplate(
        ULong         notificationTemplateId,
        String        name,
        String        content,
        String        description,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.notificationTemplateId = notificationTemplateId;
        this.name = name;
        this.content = content;
        this.description = description;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getNotificationTemplateId() {
        return this.notificationTemplateId;
    }

    public void setNotificationTemplateId(ULong notificationTemplateId) {
        this.notificationTemplateId = notificationTemplateId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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
        StringBuilder sb = new StringBuilder("NotificationTemplate (");

        sb.append(notificationTemplateId);
        sb.append(", ").append(name);
        sb.append(", ").append(content);
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