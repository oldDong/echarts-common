package com.shinemo.bi.echarts.json;

import com.google.gson.*;
import com.shinemo.bi.echarts.code.SeriesType;
import com.shinemo.bi.echarts.series.Bar;
import com.shinemo.bi.echarts.series.Line;
import com.shinemo.bi.echarts.series.Pie;
import com.shinemo.bi.echarts.series.Series;

import java.lang.reflect.Type;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:57
 */
public class SeriesDeserializer implements JsonDeserializer<Series> {

    /**
     * 设置json, typeOfT, context值
     *
     * @param json
     * @param typeOfT
     * @param context
     * @return
     * @throws JsonParseException
     */
    @Override
    public Series deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type = jsonObject.get("type").getAsString();
        SeriesType type = SeriesType.valueOf(_type);
        Series series = null;
        switch (type) {
            case line:
                series = context.deserialize(jsonObject, Line.class);
                break;
            case bar:
                series = context.deserialize(jsonObject, Bar.class);
                break;
            case pie:
                series = context.deserialize(jsonObject, Pie.class);
                break;
        }
        return series;
    }
}
