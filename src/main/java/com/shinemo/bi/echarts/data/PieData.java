package com.shinemo.bi.echarts.data;

import java.io.Serializable;

/**
 * 饼图
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:37
 */
public class PieData implements Serializable {

    private static final long serialVersionUID = -4233434180591162326L;

    private Object value;
    private String name;

    public PieData(Object value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public PieData value(Object value) {
        this.value = value;
        return this;
    }
}
