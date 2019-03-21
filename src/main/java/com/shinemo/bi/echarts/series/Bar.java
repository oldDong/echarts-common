package com.shinemo.bi.echarts.series;

import com.shinemo.bi.echarts.code.SeriesType;

/**
 * 柱状图
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 15:02
 */
public class Bar extends Series<Bar> {

    public Bar() {
        this.type(SeriesType.bar);
    }

    public Bar(String name) {
        super(name);
        this.type(SeriesType.bar);
    }
}
