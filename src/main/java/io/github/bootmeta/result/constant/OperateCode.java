package io.github.bootmeta.result.constant;

public enum OperateCode implements IErrorCode {
    SUCCESS(2000, "操作成功!"),
    FAILED(5000, "操作失败!");

    private final int code;
    private final String message;

    OperateCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
