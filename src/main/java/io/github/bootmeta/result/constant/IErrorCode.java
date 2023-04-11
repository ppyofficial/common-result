package io.github.bootmeta.result.constant;

import io.github.bootmeta.exception.BizException;

public interface IErrorCode {
    /**
     * @return 返回一个状态码，用于表名当前操作返回是否正常
     */
    int getCode();

    /**
     * 返回状态信息
     * @return 返回状态信息
     */
    String getMessage();


    static void instance(IErrorCode error) {
        throw new BizException(false,error.getCode(), error.getMessage());
    }
}
