package com.shinemo.bi.echarts.json;

import com.shinemo.bi.echarts.Option;

/**
 * 增强的Option - 主要用于测试
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 16:32
 */
public class GsonOption extends Option {

    /**
     * 在浏览器中查看
     */
    public void view() {
        OptionUtil.browse(this);
    }

    /**
     * 获取toString值
     *
     * @return
     */
    @Override
    public String toString() {
        return GsonUtil.format(this);
    }

    /**
     * 获取toPrettyString值
     *
     * @return
     */
    public String toPrettyString() {
        return GsonUtil.prettyFormat(this);
    }

    /**
     * 导出到指定文件名
     *
     * @param fileName
     * @return
     */
    public String exportToHtml(String fileName) {
        return exportToHtml(System.getProperty("java.io.tmpdir"), fileName);
    }

    /**
     * 导出到指定文件名
     *
     * @param fileName
     * @return 返回html路径
     */
    public String exportToHtml(String filePath, String fileName) {
        return OptionUtil.exportToHtml(this, filePath, fileName);
    }
}
