package com.shinemo.bi.echarts;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 15:43
 */
public class Title extends Basic<Title> implements Component {

    /**
     * 主标题文本， '\n'指定换行
     */
    private String text;

    /**
     * 主标题文本超链接
     */
    private String link;

    /**
     * 副标题文本，'\n'指定换行
     */
    private String subtext;

    /**
     * 副标题文本超链接
     */
    private String sublink;

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
    public Title text(String text) {
        this.text = text;
        return this;
    }

    /**
     * 获取link值
     */
    public String link() {
        return this.link;
    }

    /**
     * 设置link值
     *
     * @param link
     */
    public Title link(String link) {
        this.link = link;
        return this;
    }

    /**
     * 获取subtext值
     */
    public String subtext() {
        return this.subtext;
    }

    /**
     * 设置subtext值
     *
     * @param subtext
     */
    public Title subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    /**
     * 获取sublink值
     */
    public String sublink() {
        return this.sublink;
    }

    /**
     * 设置sublink值
     *
     * @param sublink
     */
    public Title sublink(String sublink) {
        this.sublink = sublink;
        return this;
    }
}
