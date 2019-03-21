package com.shinemo.bi.echarts.series;

import com.shinemo.bi.echarts.AbstractData;
import com.shinemo.bi.echarts.Chart;
import com.shinemo.bi.echarts.code.SeriesType;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 11:20
 */
public abstract class Series<T> extends AbstractData<T> implements Chart {

    /**
     * xAxis坐标轴数组的索引，指定该系列数据所用的横坐标轴
     */
    private Integer xAxisIndex;

    /**
     * yAxis坐标轴数据的索引，指定该系列数据所用的纵坐标轴
     */
    private Integer yAxisIndex;

    /**
     * 系列名称，如启用legend，该值将被legend.data索引相关
     */
    private String name;

    /**
     * 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示
     */
    private SeriesType type;

    public Series() {
    }

    public Series(String name) {
        this.name = name;
    }

    /**
     * 获取xAxisIndex值
     *
     * @return
     */
    public Integer xAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 设置xAxisIndex值
     *
     * @param xAxisIndex
     * @return
     */
    public T xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return (T) this;
    }

    /**
     * 获取yAxisIndex值
     *
     * @return
     */
    public Integer yAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 设置yAxisIndex值
     *
     * @param yAxisIndex
     * @return
     */
    public T yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return (T) this;
    }

    /**
     * 获取name值
     *
     * @return
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     * @return
     */
    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    /**
     * 获取type值
     *
     * @return
     */
    public SeriesType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     * @return
     */
    public T type(SeriesType type) {
        this.type = type;
        return (T) this;
    }
}
