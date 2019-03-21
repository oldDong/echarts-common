package com.shinemo.bi.echarts;

import com.shinemo.bi.echarts.code.AxisType;
import com.shinemo.bi.echarts.code.TimeLineType;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 11:48
 */
public class Timeline extends AbstractData<Timeline> implements Component {

    /**
     * 轴的类型
     */
    private AxisType axisType;

    /**
     * 显示策略，true(显示) | false(隐藏)
     */
    private Boolean show;

    /**
     * 默认为time,模式是时间类型
     */
    private TimeLineType type;

    public AxisType axisType() {
        return this.axisType;
    }

    public Timeline axisType(AxisType axisType) {
        this.axisType = axisType;
        return this;
    }

    public Boolean show() {
        return this.show;
    }

    public Timeline show(Boolean show) {
        this.show = show;
        return this;
    }

    public TimeLineType type() {
        return this.type;
    }

    public Timeline type(TimeLineType type) {
        this.type = type;
        return this;
    }
}
