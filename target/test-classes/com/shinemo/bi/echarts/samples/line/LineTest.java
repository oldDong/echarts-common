package com.shinemo.bi.echarts.samples.line;

import com.shinemo.bi.echarts.axis.CategoryAxis;
import com.shinemo.bi.echarts.axis.ValueAxis;
import com.shinemo.bi.echarts.code.Magic;
import com.shinemo.bi.echarts.code.Tool;
import com.shinemo.bi.echarts.code.Trigger;
import com.shinemo.bi.echarts.feature.MagicType;
import com.shinemo.bi.echarts.json.GsonUtil;
import com.shinemo.bi.echarts.series.Line;
import com.shinemo.bi.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 16:39
 */
public class LineTest {

    @Test
    public void test() {
        EnhancedOption option = new EnhancedOption();
        option.title("模板中心趋势");
        option.legend("PV","UV");
        option.tooltip().trigger(Trigger.axis);
        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                new MagicType(Magic.line, Magic.bar, Magic.pie),
                Tool.restore,
                Tool.saveAsImage
        );
        option.xAxis(new CategoryAxis().data("03-14","03-15","03-16"));
        option.yAxis(new ValueAxis());

        Line l1 = new Line("PV");
        l1.data(147, 193, 219);

        Line l2 = new Line("UV");
        l2.data(94, 189, 178);

        option.series(l1, l2);

        GsonUtil.printPretty(option);
    }
}
