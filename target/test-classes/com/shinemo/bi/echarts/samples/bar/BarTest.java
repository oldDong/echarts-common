package com.shinemo.bi.echarts.samples.bar;

import com.shinemo.bi.echarts.axis.CategoryAxis;
import com.shinemo.bi.echarts.axis.ValueAxis;
import com.shinemo.bi.echarts.code.Trigger;
import com.shinemo.bi.echarts.json.GsonUtil;
import com.shinemo.bi.echarts.series.Bar;
import com.shinemo.bi.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 17:06
 */
public class BarTest {

    @Test
    public void test() {
        EnhancedOption option = new EnhancedOption();
        option.title("运营商用户");
        option.tooltip().trigger(Trigger.axis);
        option.xAxis(new CategoryAxis().data("移动","联通","电信"));
        option.yAxis(new ValueAxis());

        Bar bar = new Bar();
        bar.data(85.5, 5.5, 9);

        option.series(bar);
        GsonUtil.printPretty(option);
    }
}
