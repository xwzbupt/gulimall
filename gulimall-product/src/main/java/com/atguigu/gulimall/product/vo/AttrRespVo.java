package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @description:
 * @author：Weiser
 * @date: 2024/6/5
 */
@Data
public class AttrRespVo extends AttrVo{
    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
}
