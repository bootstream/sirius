package io.github.boostream.core.exception;

import io.github.boostream.core.enums.IEnum;
import io.github.boostream.core.enums.ResponseCode;
import lombok.Getter;

/**
 * rec exception
 *
 * @author xz man
 * @since 2022/5/5 14:21
 */
@Getter
public class ExternalException extends RuntimeException {

    /**
     * error code
     */
    private final Integer code;

    /**
     * error message
     */
    private final String message;

    public ExternalException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public ExternalException(IEnum errorEnum) {
        super(errorEnum.getDesc());
        this.code = errorEnum.getCode();
        this.message = errorEnum.getDesc();
    }

    public ExternalException(String message) {
        super(message);
        this.code = ResponseCode.BUSINESS_ERROR.getCode();
        this.message = message;
    }
}
