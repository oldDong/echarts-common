package com.shinemo.bi.echarts.feature;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/22
 * Time: 10:29
 */
public class SaveAsImage extends Feature {

    public SaveAsImage() {
        this.show(true);
        this.title("保存为图片");
        this.type("png");
        this.lang(new String[]{"点击保存"});
    }
}
