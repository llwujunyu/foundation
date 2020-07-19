package com.wuda.foundation.security;

import com.wuda.foundation.lang.identify.IdentifierType;
import com.wuda.foundation.lang.identify.LongIdentifier;

/**
 * A subject may be any entity, such as a person or a service.
 * 表示拥有permission的任何实体.
 *
 * @author wuda
 * @since 1.0.0
 */
public class Subject extends LongIdentifier {

    /**
     * 构造函数.
     *
     * @param value value
     * @param type  type
     */
    public Subject(Long value, IdentifierType type) {
        super(value, type);
    }
}