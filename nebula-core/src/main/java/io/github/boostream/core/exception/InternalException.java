package io.github.boostream.core.exception;

import io.github.boostream.core.enums.IEnum;
import io.github.boostream.core.enums.ResponseCode;
import lombok.Getter;

/**
 * application unexpected exception
 *
 * @author xz man
 * @since 2022/5/5 14:21
 */
@Getter
public class InternalException extends RuntimeException {

    /**
     * error code
     */
    private final Integer code;

    /**
     * error message
     */
    private final String message;

    public InternalException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public InternalException(IEnum errorEnum) {
        super(errorEnum.getDesc());
        this.code = errorEnum.getCode();
        this.message = errorEnum.getDesc();
    }

    public InternalException(String message) {
        super(message);
        this.code = ResponseCode.BUSINESS_ERROR.getCode();
        this.message = message;
    }
}
