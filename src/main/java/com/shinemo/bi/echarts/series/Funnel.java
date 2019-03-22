package com.shinemo.bi.echarts.series;

import com.shinemo.bi.echarts.code.SeriesType;
import com.shinemo.bi.echarts.code.Sort;
import com.shinemo.bi.echarts.code.X;

/**
 * 漏斗图
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 10:12
 */
public class Funnel extends Series<Funnel> {

    /**
     * 左上角横坐标
     */
    private Object x;

    /**
     * 左上角纵坐标
     */
    private Object y;

    /**
     * 右下角横坐标
     */
    private Object x2;

    /**
     * 右下角纵坐标
     */
    private Object y2;

    /**
     * 水平方向对齐布局类型，默认居中对齐，可用选项还有：'left' | 'right' | 'center'
     */
    private X funnelAlign;

    /**
     * 数据排序
     */
    private Sort sort;

    public Funnel() {
        this.type(SeriesType.funnel);
    }

    public Funnel(String name) {
        super(name);
        this.type(SeriesType.funnel);
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
    public Funnel x(Object x) {
        this.x = x;
        return this;
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
    public Funnel y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取x2值
     */
    public Object x2() {
        return this.x2;
    }

    /**
     * 设置x2值
     *
     * @param x2
     */
    public Funnel x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    /**
     * 获取y2值
     */
    public Object y2() {
        return this.y2;
    }

    /**
     * 设置y2值
     *
     * @param y2
     */
    public Funnel y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    /**
     * 获取funnelAlign值
     */
    public X funnelAlign() {
        return this.funnelAlign;
    }

    /**
     * 设置funnelAlign值
     *
     * @param funnelAlign
     */
    public Funnel funnelAlign(X funnelAlign) {
        this.funnelAlign = funnelAlign;
        return this;
    }

    /**
     * 获取sort值
     */
    public Sort sort() {
        return this.sort;
    }

    /**
     * 设置sort值
     *
     * @param sort
     */
    public Funnel sort(Sort sort) {
        this.sort = sort;
        return this;
    }
}
