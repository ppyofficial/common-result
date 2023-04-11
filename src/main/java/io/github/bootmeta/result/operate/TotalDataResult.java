package io.github.bootmeta.result.operate;

import io.github.bootmeta.R;

/**
 * @author fengyupeng
 */
public class TotalDataResult<E> extends R {
    private long total;
    private E data;

    public TotalDataResult(Boolean success,Integer code, String message, long total, E data) {
        super(success,code, message);
        this.total = total;
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
