package io.github.boostream.core.enums;

import lombok.Getter;

/**
 * response code
 *
 * @author xz man
 * @since 2022/5/5 14:39
 */
@Getter
public enum ResponseCode implements IEnum {

    /**
     * SUCCESS: 1, BUSINESS_ERROR: 1000--1999, INTERNAL_ERROR: 2000--2999, EXTERNAL_ERROR:3000--3999
     */
    SUCCESS(1, "SUCCESS"),
    BUSINESS_ERROR(1000, "BUSINESS ERROR"),
    INTERNAL_ERROR(2000, "INTERNAL ERROR"),
    EXTERNAL_ERROR(3000, "EXTERNAL ERROR");

    private final Integer code;
    private final String desc;

    ResponseCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
