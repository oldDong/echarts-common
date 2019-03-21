package com.shinemo.bi.echarts;

/**
 * 配置信息
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 11:38
 */
public interface Config {

    //图表类型
    String CHART_TYPE_LINE = "line";
    String CHART_TYPE_BAR = "bar";
    String CHART_TYPE_PIE = "pie";

    //组件类型
    String COMPONENT_TYPE_TITLE = "title";
    String COMPONENT_TYPE_LEGEND = "legend";
    String COMPONENT_TYPE_AXIS = "axis";
    String COMPONENT_TYPE_X_AXIS = "xAxis";
    String COMPONENT_TYPE_Y_AXIS = "yAxis";
    String COMPONENT_TYPE_AXIS_CATEGORY = "categoryAxis";
    String COMPONENT_TYPE_AXIS_VALUE = "valueAxis";
    String COMPONENT_TYPE_TIMELINE = "timeline";
}
