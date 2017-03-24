package org.prcode.utility.exception;

/**
 * @ClassName: AppException
 * @Date: 2017-03-24 13:24
 * @Auther: kangduo
 * @Description: (操作过程中的service异常)
 */
public class AppException extends RuntimeException {

    private static final long serialVersionUID = 9086701129484760997L;

    public AppException() {
        super();
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }
}
