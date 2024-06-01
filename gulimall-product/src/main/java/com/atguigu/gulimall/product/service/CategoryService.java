package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author weiser
 * @email weiser0227@gmail.com
 * @date 2024-05-26 02:12:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

