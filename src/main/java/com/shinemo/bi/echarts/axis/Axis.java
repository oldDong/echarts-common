package com.shinemo.bi.echarts.axis;

import com.shinemo.bi.echarts.AbstractData;
import com.shinemo.bi.echarts.Component;
import com.shinemo.bi.echarts.code.AxisType;

/**
 * 坐标轴
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:14
 */
public abstract class Axis<T> extends AbstractData<T> implements Component {

    /**
     * 是否显示
     */
    private Boolean show;

    /**
     * 坐标轴类型，横轴默认类目型category，纵轴默认为数值型value
     */
    private AxisType type;

    /**
     * 坐标轴名称，默认为空
     */
    private String name;

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

    /**
     * 获取type值
     */
    public AxisType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public T type(AxisType type) {
        this.type = type;
        return (T) this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public T name(String name) {
        this.name = name;
        return (T) this;
    }
}
