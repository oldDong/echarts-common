package com.shinemo.bi.echarts.series;

/**
 * Series工场类
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 15:37
 */
public class SeriesFactory {

    /**
     * 新建折线图
     *
     * @return
     */
    public static Line newLine() {
        return new Line();
    }

    /**
     * 新建饼图
     *
     * @return
     */
    public static Pie newPie() {
        return new Pie();
    }

    /**
     * 新建柱状图
     *
     * @return
     */
    public static Bar newBar() {
        return new Bar();
    }
}
