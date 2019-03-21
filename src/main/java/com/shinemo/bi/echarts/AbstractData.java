package com.shinemo.bi.echarts;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Data接口 - 添加数据
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 11:14
 */
@Getter
@Setter
public abstract class AbstractData<T> implements Data<T>, Serializable {

    private static final long serialVersionUID = -6237440289882236833L;

    /**
     * 标线图形数据
     */
    protected List data;

    /**
     * 获取data值
     *
     * @return
     */
    public List data() {
        if (null == this.data) {
            this.data = new ArrayList();
        }
        return this.data;
    }

    /**
     * 添加元素
     *
     * @param values
     * @return
     */
    @Override
    public T data(Object... values) {
        if (null == values || values.length == 0) {
            return (T)this;
        }
        for (Object value : values) {
            this.data().add(value);
        }
        return (T)this;
    }
}
