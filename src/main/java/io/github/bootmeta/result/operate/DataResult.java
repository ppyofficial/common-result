package io.github.bootmeta.result.operate;

import io.github.bootmeta.R;

/**
 * 返回数据和总条数
 *
 * @author fengyupeng
 */
public class DataResult<E> extends R {

    private static final long serialVersionUID = 2561483197294574332L;

    private E data;

    public DataResult(Boolean success,Integer code, String message, E data) {
        super(success,code, message);
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }


}
