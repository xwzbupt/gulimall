package com.atguigu.gulimall.product.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author：Weiser
 * @date: 2024/6/4
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.atguigu.gulimall.product.dao")
public class MyBatisConfig {
    /**
     * 添加分页插件
     */
    @Bean
    public PaginationInterceptor mybatisPlusInterceptor() {
        PaginationInterceptor interceptor = new PaginationInterceptor();
        //设置请求页面大于页码的操作，true返回首页，false继续操作，默认false
        interceptor.setOverflow(true);
        //最大单页限制数量
        interceptor.setLimit(500);
        return interceptor;
    }
}
