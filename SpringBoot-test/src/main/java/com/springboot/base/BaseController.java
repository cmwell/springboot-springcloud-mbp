package com.springboot.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <ul> 基础框架
 * 基础框架
 * <li>项目名称：mybatis-plus2.0</li>
 * <li>文件名称：BaseController</li>
 * <li>user：张浩</li>
 * <li>日期：2019年06月17日 11时08分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
public abstract  class BaseController {
    public final Logger log = LoggerFactory.getLogger(this.getClass());

    public BaseController() {
    }

    protected ResultEntity resultInfo(boolean success, String msg, Object data) {
        return new ResultEntity(success, msg, data);
    }

    protected ResultEntity resultInfo(boolean success, String msg) {
        return this.resultInfo(success, msg, (Object)null);
    }


}
