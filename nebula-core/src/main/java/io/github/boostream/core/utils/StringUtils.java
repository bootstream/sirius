package io.github.boostream.core.utils;

/**
 * extension String
 *
 * @author xz man
 * @since 2022/5/5 15:32
 */
public class StringUtils {

    /**
     * null || "" -- true
     *
     * @author xz man
     * @since 2022/5/5 15:32
     */
    public static boolean isEmpty(final CharSequence cs) {
        return null == cs || 0 == cs.length();
    }

    /**
     * null || "" -- false
     *
     * @author xz man
     * @since 2022/5/5 15:32
     */
    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }


    /**
     * null || ""  || " "-- true
     *
     * @author xz man
     * @since 2022/5/5 15:32
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * null || ""  || " "-- false
     *
     * @author xz man
     * @since 2022/5/5 15:32
     */
    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }
}
