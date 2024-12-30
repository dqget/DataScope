package com.hole.hs.config;

import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.hole.hs.utils.DataSourceUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author dq
 */
@Slf4j
@Configuration
@MapperScan("com.hole.hs.mapper")
public class MybatisPlusConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public OptimisticLockerInnerInterceptor mybatisPlusInterceptor() {
        return new OptimisticLockerInnerInterceptor();
    }

    @Bean
    public DataScopeInterceptor dataScopeInterceptor() {
        return new DataScopeInterceptor();
    }

    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        return new PaginationInnerInterceptor(DataSourceUtils.getDataBaseType(dataSource));
    }
}
