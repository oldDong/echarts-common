package com.shinemo.bi.echarts.samples.pie;

import com.shinemo.bi.echarts.code.Magic;
import com.shinemo.bi.echarts.code.Tool;
import com.shinemo.bi.echarts.data.Data;
import com.shinemo.bi.echarts.feature.MagicType;
import com.shinemo.bi.echarts.json.GsonUtil;
import com.shinemo.bi.echarts.series.Pie;
import com.shinemo.bi.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 17:14
 */
public class PieTest {

    @Test
    public void test() {
        EnhancedOption option = new EnhancedOption();
        option.title("运营商用户占比");
        option.tooltip().show(true).formatter("{a} <br/>{b} : {c} ({d}%)");
        option.legend("移动","联通","电信");
        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                Tool.restore,
                Tool.saveAsImage,
                new MagicType(Magic.pie, Magic.funnel)
        );

        Pie pie = new Pie("用户占比");
        pie.data(new Data("移动", 80), new Data("联通", 10), new Data("电信", 10));

        option.series(pie);
        GsonUtil.printPretty(option);

    }
}
