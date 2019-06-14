package com.springboot.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述：结果对象
 *
 * @author: 周颂灵
 * @date： 2018/3/7-17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultEntity<T> {

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 操作信息
     */
    private String msg;

    /**
     * 结果对象
     */
    private T data;
}
