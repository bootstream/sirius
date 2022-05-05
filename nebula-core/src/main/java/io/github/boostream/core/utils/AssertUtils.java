package io.github.boostream.core.utils;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

import io.github.boostream.core.exception.BusinessException;

/**
 * extension java assert
 *
 * @author xz man
 * @since 2022/5/5 15:09
 */
public class AssertUtils {

    /**
     * check object is null
     *
     * @author xz man
     * @since 2022/5/5 15:11
     */
    public static void notNull(Object value, String message) {
        if (null == value) {
            throw new BusinessException(message);
        }
    }

    /**
     * check object is null
     *
     * @author xz man
     * @since 2022/5/5 15:11
     */
    public static <E extends RuntimeException> void notNull(Object value,  Supplier<E> supplier) {
        if (null == value) {
            throw supplier.get();
        }
    }

    /**
     * check collection is empty
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static void notEmpty(Collection<?> collection, String message) {
        if (null == collection || collection.isEmpty()) {
            throw new BusinessException(message);
        }
    }

    /**
     * check collection is empty
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static <E extends RuntimeException> void notEmpty(Collection<?> collection, Supplier<E> supplier) {
        if (null == collection || collection.isEmpty()) {
            throw supplier.get();
        }
    }

    /**
     * check collection is empty
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static void notEmpty(Map<?, ?> map, String message) {
        if (null == map || map.isEmpty()) {
            throw new BusinessException(message);
        }
    }

    /**
     * check collection is empty
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static <E extends RuntimeException> void notEmpty(Map<?, ?> map, Supplier<E> supplier) {
        if (null == map || map.isEmpty()) {
            throw supplier.get();
        }
    }

    /**
     * check String is not blank
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static void notBlank(String value, String message) {
        if (StringUtils.isBlank(value)) {
            throw new BusinessException(message);
        }
    }

    /**
     * check String is not blank
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static <E extends RuntimeException> void notBlank(String value, Supplier<E> supplier) {
        if (StringUtils.isBlank(value)) {
            throw supplier.get();
        }
    }

    /**
     * check condition is not false
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static void check(boolean condition, String message) {
        if (!condition) {
            throw new BusinessException(message);
        }
    }

    /**
     * check condition is not false
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static <E extends RuntimeException> void check(boolean condition, Supplier<E> supplier) {
        if (!condition) {
            throw supplier.get();
        }
    }



    /**
     * check condition is not true
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static void checkNot(boolean condition, String message) {
        if (condition) {
            throw new BusinessException(message);
        }
    }


    /**
     * check condition is not true
     *
     * @author xz man
     * @since 2022/5/5 15:14
     */
    public static <E extends RuntimeException> void checkNot(boolean condition, Supplier<E> supplier) {
        if (condition) {
            throw supplier.get();
        }
    }
}
