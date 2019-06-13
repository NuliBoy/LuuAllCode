package thinkinginjava.demo.com.test.chapter12;

/**
 * @author Administrator
 * @title: luyu
 * @ClassName ThinkingInJava
 * @description: TODO
 * @date 2019/4/28 22:06
 */
public class CodeRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    protected Error error;

    public CodeRuntimeException() {
    }

    public CodeRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeRuntimeException(Error error) {
        this.error = error;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
