package com.shinemo.bi.echarts.data;

import java.io.Serializable;

/**
 * 自定义样式的数据
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:26
 */
public class AxisData implements Serializable {

    private static final long serialVersionUID = 3429053723395890004L;

    /**
     * 值
     */
    private Object value;

    public AxisData(Object value) {
        this.value = value;
    }

    /**
     * 获取value值
     *
     * @return
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     * @return
     */
    public AxisData value(Object value) {
        this.value = value;
        return this;
    }
}
