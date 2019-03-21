package com.shinemo.bi.echarts;

import java.io.Serializable;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 15:43
 */
public abstract class Basic<T> implements Serializable {

    private static final long serialVersionUID = 8221484511074693536L;

    /**
     * 是否显示
     */
    private Boolean show;

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }
}
