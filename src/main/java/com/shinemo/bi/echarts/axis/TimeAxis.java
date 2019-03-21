package com.shinemo.bi.echarts.axis;

import com.shinemo.bi.echarts.code.AxisType;

/**
 * 时间型坐标轴用法同数值型
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:23
 */
public class TimeAxis extends ValueAxis {

    public TimeAxis() {
        this.type(AxisType.time);
    }
}
