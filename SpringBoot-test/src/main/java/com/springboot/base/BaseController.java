package com.springboot.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * <ul>
 * <li>功能描述：公用抽象controller</li>
 * <li>创建人:周颂灵</li>
 * <li>创建时间：2017/8/23-13:38</li>
 * </ul>
 */
public abstract class BaseController<T> {


    /**
     * 日志记录
     */
    public final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 返回对象信息
     *
     * @param success 是否成功
     * @param msg     操作信息
     * @param data    操作数据
     * @return
     */
    protected String resultInfo(boolean success, String msg, Object data) {
        JSONObject json = new JSONObject();
        json.put("error_code", success ? 0 : -1);
        json.put("reason", msg);
        json.put("result", data);
        return JSONObject.toJSONStringWithDateFormat(json, "yyyy-MM-dd HH:mm:ss", SerializerFeature.WriteMapNullValue);
    }

    /**
     * 返回对象信息
     *
     * @param success 是否成功
     * @param msg     操作信息
     * @return
     */
    protected String resultInfo(boolean success, String msg) {
        return resultInfo(success, msg, null);
    }

    /**
     * 返回对象信息
     *
     * @param success          是否成功
     * @param msg              操作信息
     * @param data             数据
     * @param ignoreAnnotation 忽略注解
     * @return java.lang.String
     * @author 周颂灵
     * @Date 2017-11-09 17:00:03
     */
    protected String resultInfo(boolean success, String msg, Object data, boolean ignoreAnnotation) {
        if (ignoreAnnotation) {
            JSONObject json = new JSONObject();
            json.put("error_code", success ? 0 : -1);
            json.put("reason", msg);
            json.put("result", data);
            return json.toString();
        }
        return resultInfo(success, msg, data);


    }


    /**
     * 结果集
     *
     * @param success 是否成功
     * @param msg     信息
     * @param object  结果
     * @return com.zhiyingwl.iwooc.biz.base.ResultEntity
     * @author 周颂灵
     * @Date 2018-03-07 17:24:14
     */
    protected <T> ResultEntity resultEntity(boolean success, String msg, T object) {
        return ResultEntity.builder()
                .success(success)
                .msg(msg)
                .data(object)
                .build();
    }

    /**
     * 操作结果
     *
     * @param success 是否成功
     * @param msg     信息
     * @return com.zhiyingwl.iwooc.biz.base.ResultEntity
     * @author 周颂灵
     * @Date 2018-03-07 17:26:08
     */
    protected ResultEntity resultEntity(boolean success, String msg) {
        return ResultEntity.builder()
                .success(success)
                .msg(msg)
                .build();
    }
}
