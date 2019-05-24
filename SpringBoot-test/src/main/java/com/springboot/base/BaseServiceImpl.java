package com.springboot.base;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <ul>
 * <li>项目名称：MyTest</li>
 * <li>文件名称：BaseServiceImpl</li>
 * <li>user：张浩</li>
 * <li>日期：2019年05月21日 15时40分</li>
 * <li>Copyright ©2017, 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
public class BaseServiceImpl<M extends BaseDao<T>,T> extends ServiceImpl<M,T> implements BaseService<T> {
    public BaseServiceImpl() {
    }
}
