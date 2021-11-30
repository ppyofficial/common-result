package io.github.bootmeta.result.operate;

import io.github.bootmeta.result.abs.BaseResult;

/**
 * 无token结果集
 *
 * @author fengyupeng
 */
public class MessageResult extends BaseResult {

    private static final long serialVersionUID = 1041649114986641702L;

    public MessageResult() {
    }

    public MessageResult(int type, int code, String message) {
        super(type, code, message);
    }

}
