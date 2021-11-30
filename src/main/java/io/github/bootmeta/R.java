package io.github.bootmeta;

import io.github.bootmeta.exception.CommonException;
import io.github.bootmeta.result.Result;
import io.github.bootmeta.result.constant.C;
import io.github.bootmeta.result.constant.OperateCode;
import io.github.bootmeta.result.operate.MessageDataResult;
import io.github.bootmeta.result.operate.MessageResult;

/**
 * 返回值
 * @author fengyupeng
 */
public class R {

    /**
     * @return 返回统一结果
     */
    public static Result success() {
        return new MessageResult(C.TYPE_RESULT_SUCCESS, OperateCode.SUCCESS.getCode(), OperateCode.SUCCESS.getMessage());
    }

    public static Result success(int code, String message) {
        return new MessageResult(C.TYPE_RESULT_SUCCESS, code, message);
    }

    public static <E> Result success(E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage(), data);
    }

    public static <E> Result success(int code, String message, E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS, code, message, data);
    }


    /**
     * @return 返回统一结果
     */
    public static Result fail() {
        return new MessageResult(C.TYPE_RESULT_FAIL, OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage());
    }

    public static Result fail(int code, String message) {
        return new MessageResult(C.TYPE_RESULT_FAIL, code, message);
    }

    public static <E> Result fail(E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage(), data);
    }
    public static <E> Result fail(int code, String message, E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, code, message, data);
    }

    public static void problem(int code, String message) {
        throw new CommonException(code, message);
    }

    public static Result decision (boolean value){
        return value ? success() : fail();
    }
}
