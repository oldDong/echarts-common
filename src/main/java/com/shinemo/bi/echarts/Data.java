package com.shinemo.bi.echarts;

/**
 * 数据接口
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 11:12
 */
public interface Data<T> {

    /**
     * 添加元素
     *
     * @param values
     * @return
     */
    T data(Object... values);
}
