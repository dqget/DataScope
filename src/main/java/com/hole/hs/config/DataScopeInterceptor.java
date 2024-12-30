package com.hole.hs.config;

import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.dromara.hutool.core.collection.CollUtil;

import java.util.Set;

/**
 * @author dq
 */
@Slf4j
public class DataScopeInterceptor implements InnerInterceptor {

    // 白名单
    @Setter
    private Set<String> whiteMethodList;

    @Override
    public void beforeQuery(Executor executor, MappedStatement mappedStatement, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) {
        // 如果是查询语句并且不是存储过程时
        if (SqlCommandType.SELECT == mappedStatement.getSqlCommandType() && StatementType.CALLABLE != mappedStatement.getStatementType()) {

            String classMethodName = mappedStatement.getId();
            // 白名单
            if (CollUtil.isNotEmpty(whiteMethodList) && whiteMethodList.contains(classMethodName)) {
                return;
            }

        }
    }
}
