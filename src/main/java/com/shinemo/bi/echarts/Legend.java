package com.shinemo.bi.echarts;

import com.shinemo.bi.echarts.code.LegendType;
import com.shinemo.bi.echarts.code.Orient;

import java.util.*;

/**
 * 图例
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 09:46
 */
public class Legend extends Basic<Legend> implements Data<Legend>, Component {

    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     */
    private Orient orient;

    /**
     * 设置分页方式
     */
    private LegendType type;

    /**
     * 选择模式，默认开启图例开关
     */
    private Object selectedMode;

    /**
     * 配置默认选中状态，可配合LEGEND.SELECTED事件做动态数据载入
     */
    private Map<String, Boolean> selected;

    private List data;

    public Legend() {
    }

    public Legend(Object... values) {
        this.data(values);
    }

    /**
     * 获取orient值
     */
    public Orient orient() {
        return this.orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
    public Legend orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * 获取type值
     *
     * @return
     */
    public LegendType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     * @return
     */
    public Legend type(LegendType type) {
        this.type = type;
        return this;
    }

    /**
     * 获取selectedMode值
     */
    public Object selectedMode() {
        return this.selectedMode;
    }

    /**
     * 设置selectedMode值
     *
     * @param selectedMode
     */
    public Legend selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    /**
     * 设置默认选中状态
     *
     * @param name
     * @param selected
     * @return
     */
    public Legend selected(String name, Boolean selected) {
        if (!this.data.contains(name)) {
            throw new RuntimeException("Legend中不包含name为" + name + "的图例");
        }
        if (this.selected == null) {
            this.selected = new LinkedHashMap<String, Boolean>();
        }
        this.selected.put(name, selected);
        return this;
    }

    /**
     * 设置data值
     *
     * @param data
     */
    public Legend data(List data) {
        this.data = data;
        return this;
    }

    /**
     * 获取data值
     */
    public List data() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        return this.data;
    }

    @Override
    public Legend data(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.data().addAll(Arrays.asList(values));
        return this;
    }
}
