package com.shinemo.bi.echarts.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:29
 */
public abstract class BasicData<T> implements Serializable {

    private static final long serialVersionUID = 1079913413294775260L;

    private String name;
    private String text;
    private Object value;

    /**
     * 饼图使用x,y
     */
    private Object x;
    private Object y;

    /**
     * 直角坐标系的图表使用，如折线图、柱状图
     */
    private Integer xAxis;
    private Integer yAxis;

    public BasicData() {
    }

    public BasicData(String name) {
        this.name = name;
    }

    public BasicData(String name, Object value) {
        this.name = name;
        this.value = value;
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

    /**
     * 获取text值
     */
    public String text() {
        return this.text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public T text(String text) {
        this.text = text;
        return (T) this;
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
    public T value(Object value) {
        this.value = value;
        return (T) this;
    }

    /**
     * 设置value值
     *
     * @param values
     */
    public T value(Object... values) {
        if (values == null || values.length == 0) {
            return (T) this;
        }
        if (this.value == null) {
            this.value = new ArrayList<Object>(values.length);
        }
        if (this.value instanceof List) {
            ((List) this.value).addAll(Arrays.asList(values));
        }
        return (T) this;
    }

    /**
     * 获取x值
     */
    public Object x() {
        return this.x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public T x(Object x) {
        this.x = x;
        return (T) this;
    }

    /**
     * 获取y值
     */
    public Object y() {
        return this.y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public T y(Object y) {
        this.y = y;
        return (T) this;
    }

    /**
     * 获取xAxis值
     */
    public Integer xAxis() {
        return this.xAxis;
    }

    /**
     * 设置xAxis值
     *
     * @param xAxis
     */
    public T xAxis(Integer xAxis) {
        this.xAxis = xAxis;
        return (T) this;
    }

    /**
     * 获取yAxis值
     */
    public Integer yAxis() {
        return this.yAxis;
    }

    /**
     * 设置yAxis值
     *
     * @param yAxis
     */
    public T yAxis(Integer yAxis) {
        this.yAxis = yAxis;
        return (T) this;
    }
}
