package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author weiser
 * @email weiser0227@gmail.com
 * @date 2024-05-26 13:59:29
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
