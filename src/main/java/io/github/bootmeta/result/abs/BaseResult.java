package io.github.bootmeta.result.abs;

import io.github.bootmeta.result.Result;

/**
 * 抽象结果集，用户返回json格式数据，
 *
 * @author  fengyupeng
 */
public class BaseResult implements Result {

    private static final long serialVersionUID = -8564317802372171889L;

    private int type;

    private int code;

    private String message;

    public BaseResult(int type, int code, String message) {
        this.type = type;
        this.code = code;
        this.message = message;
    }

    public BaseResult() {

    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
