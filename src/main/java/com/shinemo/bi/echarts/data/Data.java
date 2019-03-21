package com.shinemo.bi.echarts.data;

/**
 * 通用的Data对象
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:34
 */
public class Data extends BasicData<Data> {

    public Data() {
    }

    public Data(String name) {
        super(name);
    }

    public Data(String name, Object value) {
        super(name, value);
    }
}
