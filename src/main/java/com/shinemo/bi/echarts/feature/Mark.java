package com.shinemo.bi.echarts.feature;

import java.util.HashMap;
import java.util.Map;

/**
 * 辅助线标志
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 10:28
 */
public class Mark extends Feature {

    public Mark() {
        this.show(true);
        Map title = new HashMap<>();
        title.put("mark", "辅助线开关");
        title.put("markUndo", "删除辅助线");
        title.put("markClear", "清空辅助线");
        this.title(title);
    }
}
