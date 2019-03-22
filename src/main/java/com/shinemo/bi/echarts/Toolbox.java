package com.shinemo.bi.echarts;

import com.shinemo.bi.echarts.code.Orient;
import com.shinemo.bi.echarts.code.Tool;
import com.shinemo.bi.echarts.feature.Feature;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 工具箱
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 09:34
 */
public class Toolbox extends Basic<Toolbox> implements Component{

    /**
     * 启用功能
     */
    private Map<String, Feature> feature;

    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     */
    private Orient orient;

    /**
     * 是否显示工具箱文字提示，默认启用
     */
    private Boolean showTitle;

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
    public Toolbox orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * 获取showTitle值
     */
    public Boolean showTitle() {
        return this.showTitle;
    }

    /**
     * 设置showTitle值
     *
     * @param showTitle
     */
    public Toolbox showTitle(Boolean showTitle) {
        this.showTitle = showTitle;
        return this;
    }

    /**
     * 启用功能，目前支持feature见下，工具箱自定义功能回调处理
     */
    public Map<String, Feature> feature() {
        if (this.feature == null) {
            this.feature = new LinkedHashMap<String, Feature>();
        }
        return this.feature;
    }

    /**
     * 添加组件
     *
     * @param value
     * @return
     */
    private Toolbox _addFeature(Feature value) {
        if (value == null) {
            return this;
        }
        //第一个字母转小写
        String name = value.getClass().getSimpleName();
        name = name.substring(0, 1).toLowerCase() + name.substring(1);
        _addFeatureOnce(name, value);
        return this;
    }

    /**
     * 同一种组件只添加一次
     *
     * @param name
     * @param feature
     */
    private void _addFeatureOnce(Object name, Feature feature) {
        String _name = String.valueOf(name);
        if (!this.feature().containsKey(_name)) {
            this.feature().put(_name, feature);
        }
    }

    /**
     * 添加组件
     *
     * @param values
     * @return
     */
    public Toolbox feature(Object... values) {
        if (values == null && values.length == 0) {
            return this;
        }
        if (this.feature == null) {
            this.feature = new LinkedHashMap<String, Feature>();
        }
        for (Object t : values) {
            if (t instanceof Feature) {
                _addFeature((Feature) t);
            } else if (t instanceof Tool) {
                switch ((Tool) t) {
                    case dataView:
                        _addFeatureOnce(t, Feature.dataView);
                        break;
                    case magicType:
                        _addFeatureOnce(t, Feature.magicType);
                        break;
                    case mark:
                        _addFeatureOnce(t, Feature.mark);
                        break;
                    case restore:
                        _addFeatureOnce(t, Feature.restore);
                        break;
                    case saveAsImage:
                        _addFeatureOnce(t, Feature.saveAsImage);
                        break;
                    default:
                        //ignore
                }
            }
        }
        return this;
    }

}
