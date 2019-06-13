package thinkinginjava.demo.com.test.chapter12;

import java.io.Serializable;

/**
 * Created date: 2017-07-23
 *
 * @author mixta@chanjet.com
 */
public class Error implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Error SERVER_ERROR = new Error(ErrorEnum.SERVER_ERROR.getCode(), ErrorEnum.SERVER_ERROR.getDisplayName());

    private int code;

    private String msg;

    private String hint;

    public Error() {
    }

    public Error(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Error fromErrorEnum(ErrorEnum errorEnum) {
        return new Error(errorEnum.getCode(), errorEnum.getDisplayName());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
