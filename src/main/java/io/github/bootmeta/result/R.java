package io.github.bootmeta.result;

import io.github.bootmeta.result.constant.C;
import io.github.bootmeta.result.constant.OperateCode;
import io.github.bootmeta.result.exception.CommonException;
import io.github.bootmeta.result.operate.MessageDataResult;
import io.github.bootmeta.result.operate.MessageResult;
import io.github.bootmeta.result.utils.LoadPropertiesFileUtil;

/**
 * @author fengyupeng
 */
public class R {

    /**
     * @return 返回统一结果
     */
    public static Result success() {
        return new MessageResult(C.TYPE_RESULT_SUCCESS, OperateCode.SUCCESS.getCode(), OperateCode.SUCCESS.getMessage());
    }

    public static <E> Result success(E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS, OperateCode.SUCCESS.getCode(), OperateCode.SUCCESS.getMessage(), data);
    }

    public static Result success(int code) {
        String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
        return new MessageResult(C.TYPE_RESULT_SUCCESS, code, message);
    }

    public static <E> Result success(int code, E data) {
        String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
        return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS, code, message, data);
    }

    public static Result success(String fileName, int code) {
        String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
        return new MessageResult(C.TYPE_RESULT_SUCCESS, code, message);
    }

    public static <E> Result success(String fileName, int code, E data) {
        String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
        return new MessageDataResult<E>(C.TYPE_RESULT_SUCCESS, code, message, data);
    }

    public static Result success(int code, String message) {
        return new MessageResult(C.TYPE_RESULT_SUCCESS, code, message);
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

    public static <E> Result fail(E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage(), data);
    }

    public static Result fail(int code) {
        String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
        return new MessageResult(C.TYPE_RESULT_FAIL, code, message);
    }

    public static <E> Result fail(int code, E data) {
        String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, code, message, data);
    }

    public static Result fail(String fileName, int code) {
        String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
        return new MessageResult(C.TYPE_RESULT_FAIL, code, message);
    }

    public static <E> Result fail(String fileName, int code, E data) {
        String message = LoadPropertiesFileUtil.loadProperties(fileName, code);
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, code, message, data);
    }


    public static Result fail(int code, String message) {
        return new MessageResult(C.TYPE_RESULT_FAIL, code, message);
    }

    public static <E> Result fail(int code, String message, E data) {
        return new MessageDataResult<E>(C.TYPE_RESULT_FAIL, code, message, data);
    }

    /**
     * @param code 状态码
     */
    public static void problem(int code) {
        String message = LoadPropertiesFileUtil.loadProperties(C.R, code);
        throw new CommonException(code, message);
    }

    public static void problem(int code, String message) {
        throw new CommonException(code, message);
    }
}
