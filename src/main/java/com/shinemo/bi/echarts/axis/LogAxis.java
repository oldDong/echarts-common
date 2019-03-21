package com.shinemo.bi.echarts.axis;

import com.shinemo.bi.echarts.code.AxisType;

/**
 * 指数型坐标轴
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:24
 */
public class LogAxis extends Axis<LogAxis> {

    public LogAxis() {
        this.type(AxisType.log);
    }
}
