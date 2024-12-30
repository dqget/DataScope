package com.hole.hs.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import lombok.extern.slf4j.Slf4j;
import org.dromara.hutool.core.exception.ExceptionUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author dq
 */
@Slf4j
public class DataSourceUtils {
    public static DbType getDataBaseType(DataSource dataSource) {
        DbType dbType;
        try (Connection connection = dataSource.getConnection()) {
            dbType = DbType.getDbType(connection.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            log.error("DataSourceUtils#getDataBaseType error! e:{}", ExceptionUtil.stacktraceToString(e));
            return DbType.MYSQL;
        }
        log.info("data base type | {} : {}", dbType.getDb(), dbType.getDesc());
        return dbType;
    }
}
