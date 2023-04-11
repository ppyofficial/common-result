package io.github.bootmeta;

import io.github.bootmeta.exception.BizException;
import io.github.bootmeta.result.constant.IErrorCode;
import io.github.bootmeta.result.constant.OperateCode;
import io.github.bootmeta.result.operate.DataResult;
import io.github.bootmeta.result.operate.TotalDataResult;

import java.io.Serializable;

/**
 * 返回值
 *
 * @author fengyupeng
 */
public class R implements Serializable {

    private Boolean success;

    private Integer code;

    private String message;

    public R() {
    }

    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public R(Boolean success,Integer code, String message) {
        this.code = code;
        this.message = message;
        this.success = success;
    }


    /**
     * @return 返回统一结果
     */
    public static R ok() {
        return new R(true,OperateCode.SUCCESS.getCode(), OperateCode.SUCCESS.getMessage());
    }

    /**
     * @param code    状态码
     * @param message 状态信息
     * @return Result 返回一个json
     */
    public static R ok(int code, String message) {
        return new R(true,code, message);
    }

    /**
     * @param data 返回数据
     * @param <E>  泛型值
     * @return Result 返回一个json
     */
    public static <E> R ok(E data) {
        return new DataResult<>(true,OperateCode.SUCCESS.getCode(), OperateCode.SUCCESS.getMessage(), data);
    }

    /**
     * @param total 数据总数
     * @param data  返回数据
     * @param <E>   泛型值
     * @return Result 返回一个json
     */
    public static <E> R ok(long total, E data) {
        return new TotalDataResult<>(true,OperateCode.SUCCESS.getCode(), OperateCode.SUCCESS.getMessage(), total, data);
    }

    /**
     * @param code    状态码
     * @param message 状态信息
     * @param data    返回数据
     * @param <E>     泛型值
     * @return Result 返回一个json
     */
    public static <E> R ok(int code, String message, E data) {
        return new DataResult<>(true,code, message, data);
    }

    /**
     * @param code    状态码
     * @param message 状态信息
     * @param data    返回数据
     * @param <E>     泛型值
     * @param total   总记录数
     * @return Result 返回一个json
     */
    public static <E> R ok(int code, String message, long total, E data) {
        return new TotalDataResult<>(true,code, message, total, data);
    }

    /**
     * @return 返回统一结果
     */
    public static R fail() {
        return new R(false,OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage());
    }

    /**
     * @param code    状态码
     * @param message 状态信息
     * @return Result 返回一个json
     */
    public static R fail(int code, String message) {
        return new R(false,code, message);
    }

    public static R fail(IErrorCode error) {
        return new R(false,error.getCode(), error.getMessage());
    }

    /**
     * @param data 返回数据
     * @param <E>  泛型值
     * @return Result 返回一个json
     */
    public static <E> R fail(E data) {
        return new DataResult<>(false,OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage(), data);
    }


    /**
     * @param total 数据总数
     * @param data  返回数据
     * @param <E>   泛型值
     * @return Result 返回一个json
     */
    public static <E> R fail(long total, E data) {
        return new TotalDataResult<>(false,OperateCode.FAILED.getCode(), OperateCode.FAILED.getMessage(), total, data);
    }

    /**
     * @param code    状态码
     * @param message 状态信息
     * @param data    返回数据
     * @param <E>     泛型值
     * @return Result 返回一个json
     */
    public static <E> R fail(int code, String message, E data) {
        return new DataResult<>(false,code, message, data);
    }

    public static <E> R fail(IErrorCode error, E data) {
        return new DataResult<>(false,error.getCode(), error.getMessage(), data);
    }


    /**
     * @param code    状态码
     * @param message 状态信息
     * @param data    返回数据
     * @param <E>     泛型值
     * @param total   总记录数
     * @return Result 返回一个json
     */
    public static <E> R fail(int code, String message, long total, E data) {
        return new TotalDataResult<>(false,code, message, total, data);
    }

    public static <E> R fail(IErrorCode error, long total, E data) {
        return new TotalDataResult<>(false,error.getCode(), error.getMessage(),total, data);
    }

    /**
     * @param code    状态码
     * @param message 状态信息
     */
    public static void error(int code, String message) {
        throw new BizException(false,code, message);
    }

    public static void error(IErrorCode error) {
        throw new BizException(false,error.getCode(), error.getMessage());
    }

    /**
     * 返回值是json
     *
     * @param value 参数类型
     * @return Result 返回一个json结果
     */
    public static R decision(boolean value) {
        return value ? ok() : fail();
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
