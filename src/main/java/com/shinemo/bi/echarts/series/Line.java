package com.shinemo.bi.echarts.series;

import com.shinemo.bi.echarts.code.SeriesType;

/**
 * 折线图
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 15:04
 */
public class Line extends Series<Line> {

    public Line() {
        this.type(SeriesType.line);
    }

    public Line(String name) {
        super(name);
        this.type(SeriesType.line);
    }
}
