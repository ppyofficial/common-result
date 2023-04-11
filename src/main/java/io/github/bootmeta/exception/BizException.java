package io.github.bootmeta.exception;

/**
 * 异常信息
 *
 * @author fengyupeng
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1379659528682508908L;

    private Boolean success;
    private Integer code;
    private String message;


    public BizException() {
    }

    public BizException(Boolean success,Integer code, String message) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
