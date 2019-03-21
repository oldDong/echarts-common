package com.shinemo.bi.echarts.json;

import com.google.gson.*;
import com.shinemo.bi.echarts.axis.Axis;
import com.shinemo.bi.echarts.axis.CategoryAxis;
import com.shinemo.bi.echarts.axis.TimeAxis;
import com.shinemo.bi.echarts.axis.ValueAxis;
import com.shinemo.bi.echarts.code.AxisType;

import java.lang.reflect.Type;

/**
 * gson反序列化
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/3/21
 * Time: 14:41
 */
public class AxisDeserializer implements JsonDeserializer<Axis> {

    /**
     * 设置json，typeOfT,context值
     *
     * @param json
     * @param typeOfT
     * @param context
     * @return
     * @throws JsonParseException
     */
    @Override
    public Axis deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type = jsonObject.get("type").getAsString();
        AxisType type = AxisType.valueOf(_type);
        Axis axis = null;
        switch (type) {
            case category:
                axis = context.deserialize(jsonObject, CategoryAxis.class);
                break;
            case value:
                axis = context.deserialize(jsonObject, ValueAxis.class);
                break;
            case time:
                axis = context.deserialize(jsonObject, TimeAxis.class);
                break;
        }
        return axis;
    }
}
