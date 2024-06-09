package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @description:收集属性id和属性分组的id
 * @author：Weiser
 * @date: 2024/6/9
 */
@Data
public class AttrGroupRelationVo {
    private Long attrId;

    private Long attrGroupId;
}
