package com.shinemo.bi.echarts.feature;

/**
 * 数据视图
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 09:36
 */
public class DataView extends Feature {

    public DataView() {
        this.show(true);
        this.title("数据视图");
        this.readOnly(false);
        this.lang(new String[]{"数据视图", "关闭", "刷新"});
    }
}
