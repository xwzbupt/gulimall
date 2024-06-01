package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author weiser
 * @email weiser0227@gmail.com
 * @date 2024-05-26 13:50:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
