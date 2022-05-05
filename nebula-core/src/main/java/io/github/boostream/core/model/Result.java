package io.github.boostream.core.model;

import io.github.boostream.core.enums.IEnum;
import io.github.boostream.core.enums.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * rpc basic class
 *
 * @author xz man
 * @since 2022/5/5 14:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * rpc status
     */
    private Boolean success;

    /**
     * rpc code
     */
    private Integer code;

    /**
     * rpc message
     */
    private String message;

    /**
     * rpc business data
     */
    private T data;

    public static <E> Result<E> ok(E data) {
        Result<E> result = new Result<>();
        result.success = Boolean.TRUE;
        result.code = ResponseCode.SUCCESS.getCode();
        result.message = ResponseCode.SUCCESS.getDesc();
        result.data = data;
        return result;
    }

    public static Result<Void> ok() {
        Result<Void> result = new Result<>();
        result.success = Boolean.TRUE;
        result.code = ResponseCode.SUCCESS.getCode();
        result.message = ResponseCode.SUCCESS.getDesc();
        return result;
    }

    public static <E> Result<E> error(IEnum errorEnum) {
        Result<E> result = new Result<>();
        result.success = Boolean.FALSE;
        if (null != errorEnum) {
            result.code = errorEnum.getCode();
            result.message = errorEnum.getDesc();
        }
        return result;
    }
}
