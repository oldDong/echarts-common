package com.shinemo.bi.echarts;

import com.shinemo.bi.echarts.axis.Axis;
import com.shinemo.bi.echarts.series.Series;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 11:46
 */
public class Option implements Serializable {

    private static final long serialVersionUID = -1131077041291170562L;

    /**
     * 时间轴，每个图表最多仅有一个时间轴控件
     */
    private Timeline timeline;

    /**
     * 标题，每个图表最多仅有一个标题控件
     */
    private Title title;

    /**
     * 提示框（详见tooltip），鼠标悬浮交互时的信息提示
     */
    private Tooltip tooltip;


    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    private List<Axis> xAxis;

    /**
     * 直角坐标系中纵轴数组（详见yAxis），数组中每一项代表一条纵轴坐标轴，标准（1.0）中规定最多同时存在2条纵轴
     */
    private List<Axis> yAxis;

    /**
     * 驱动图表生成的数据内容（详见series），数组中每一项代表一个系列的特殊选项及数据
     */
    private List<Series> series;

    /**
     * 当使用timeline时，每一组数据要放到单独的option中
     */
    private List<Option> options;

    /**
     * 设置title值
     *
     * @param title
     */
    public Option title(Title title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     *
     * @param text
     * @return
     */
    public Option title(String text) {
        this.title().text(text);
        return this;
    }

    /**
     * 标题和副标题
     *
     * @param text
     * @param subtext
     * @return
     */
    public Option title(String text, String subtext) {
        this.title().text(text).subtext(subtext);
        return this;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public Option tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * 设置xAxis值
     *
     * @param xAxis
     */
    public Option xAxis(List<Axis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * 设置yAxis值
     *
     * @param yAxis
     */
    public Option yAxis(List<Axis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    /**
     * 设置series值
     *
     * @param series
     */
    public Option series(List<Series> series) {
        this.series = series;
        return this;
    }

    /**
     * 设置options值
     *
     * @param options
     */
    public Option options(List<Option> options) {
        this.options = options;
        return this;
    }

    /**
     * 设置timeline值
     *
     * @param timeline
     */
    public Option timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * 时间轴（详见timeline），每个图表最多仅有一个时间轴控件
     */
    public Timeline timeline() {
        if (this.timeline == null) {
            this.timeline = new Timeline();
        }
        return this.timeline;
    }

    /**
     * 标题（详见title），每个图表最多仅有一个标题控件
     */
    public Title title() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }

    /**
     * 提示框（详见tooltip），鼠标悬浮交互时的信息提示
     */
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    public List<Axis> xAxis() {
        if (this.xAxis == null) {
            this.xAxis = new ArrayList<Axis>();
        }
        return this.xAxis;
    }

    /**
     * 添加x轴
     *
     * @param values
     * @return
     */
    public Option xAxis(Axis... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.xAxis().size() == 2) {
            throw new RuntimeException("xAxis已经存在2个，无法继续添加!");
        }
        if (this.xAxis().size() + values.length > 2) {
            throw new RuntimeException("添加的xAxis超出了最大允许的范围:2!");
        }
        this.xAxis().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    public List<Axis> yAxis() {
        if (this.yAxis == null) {
            this.yAxis = new ArrayList<Axis>();
        }
        return this.yAxis;
    }

    /**
     * 添加y轴
     *
     * @param values
     * @return
     */
    public Option yAxis(Axis... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.yAxis().size() == 2) {
            throw new RuntimeException("yAxis已经存在2个，无法继续添加!");
        }
        if (this.yAxis().size() + values.length > 2) {
            throw new RuntimeException("添加的yAxis超出了最大允许的范围:2!");
        }
        this.yAxis().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 驱动图表生成的数据内容（详见series），数组中每一项代表一个系列的特殊选项及数据
     */
    public List<Series> series() {
        if (this.series == null) {
            this.series = new ArrayList<Series>();
        }
        return this.series;
    }

    /**
     * 添加数据
     *
     * @param values
     * @return
     */
    public Option series(Series... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.series().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 当使用timeline时，每一组数据要放到单独的option中
     */
    public List<Option> options() {
        if (this.options == null) {
            this.options = new ArrayList<Option>();
        }
        return this.options;
    }

    /**
     * 添加Option数据
     *
     * @param values
     * @return
     */
    public Option options(Option... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.options().addAll(Arrays.asList(values));
        return this;
    }
}
