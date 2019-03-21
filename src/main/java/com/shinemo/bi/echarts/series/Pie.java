package com.shinemo.bi.echarts.series;

import com.shinemo.bi.echarts.code.SeriesType;

/**
 * 饼图
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 15:34
 */
public class Pie extends Series<Pie> {

    public Pie() {
        this.type(SeriesType.pie);
    }

    public Pie(String name) {
        super(name);
        this.type(SeriesType.pie);
    }
}
