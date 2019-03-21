package com.shinemo.bi.echarts;

import com.shinemo.bi.echarts.code.Trigger;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 17:25
 */
public class Tooltip extends Basic<Tooltip> implements Component {

    /**
     * tooltip主体内容显示策略 - true（显示）| false（隐藏）
     */
    private Boolean showContent;

    /**
     * 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
     *
     */
    private Trigger trigger;

    /**
     * 是否永远显示提示框内容，默认情况下在移出可触发提示框区域后 一定时间 后隐藏，设置为 true 可以保证一直显示提示框内容
     *
     * @since 3.0
     */
    private Boolean alwaysShowContent;

    /**
     * 位置指定，传入{Array}，如[x, y]， 固定位置[x, y]；传入{Function}，如function([x, y]) {return [newX,newY]}，默认显示坐标为输入参数，用户指定的新坐标为输出返回。
     */
    private Object formatter;

    /**
     * 获取showContent值
     */
    public Boolean showContent() {
        return this.showContent;
    }

    /**
     * 设置showContent值
     *
     * @param showContent
     */
    public Tooltip showContent(Boolean showContent) {
        this.showContent = showContent;
        return this;
    }

    /**
     * 获取trigger值
     */
    public Trigger trigger() {
        return this.trigger;
    }

    /**
     * 设置trigger值
     *
     * @param trigger
     */
    public Tooltip trigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * 获取alwaysShowContent值
     *
     * @return
     */
    public Boolean alwaysShowContent() {
        return this.alwaysShowContent;
    }

    /**
     * 设置alwaysShowContent值
     *
     * @param alwaysShowContent
     * @return
     */
    public Tooltip alwaysShowContent(Boolean alwaysShowContent) {
        this.alwaysShowContent = alwaysShowContent;
        return this;
    }

    /**
     * 获取formatter值
     */
    public Object formatter() {
        return this.formatter;
    }

    /**
     * 设置formatter值
     *
     * @param formatter
     */
    public Tooltip formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

}
