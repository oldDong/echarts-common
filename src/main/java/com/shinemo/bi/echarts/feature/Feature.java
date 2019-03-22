package com.shinemo.bi.echarts.feature;

import java.io.Serializable;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 09:35
 */
public class Feature implements Serializable {

    private static final long serialVersionUID = -5882296206126655015L;

    /**
     * 是否显示
     */
    private Boolean show;

    /**
     * 标题
     */
    private Object title;

    /**
     * 类型
     */
    private Object type;

    /**
     * 只读
     */
    private Boolean readOnly;

    /**
     * lang 非IE浏览器支持点击下载，有保存话术，默认是“点击保存”，可修改
     */
    private Object lang;

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
    public Feature show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取title值
     */
    public Object title() {
        return this.title;
    }

    /**
     * 设置title值
     *
     * @param title
     */
    public Feature title(Object title) {
        this.title = title;
        return this;
    }

    /**
     * 获取type值
     */
    public Object type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public Feature type(Object type) {
        this.type = type;
        return this;
    }

    /**
     * 获取readOnly值
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * 设置readOnly值
     *
     * @param readOnly
     */
    public Feature readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    /**
     * 获取lang值
     */
    public Object lang() {
        return this.lang;
    }

    /**
     * 设置lang值
     *
     * @param lang
     */
    public Feature lang(Object lang) {
        this.lang = lang;
        return this;
    }
}
