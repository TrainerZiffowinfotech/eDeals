package com.ziffow.edeals.service;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
;

import javax.sql.DataSource;

/**
 * Created by zffow on 12/7/14.
 */


    @Configuration
    @MapperScan("com.ziffow.edeals.mapper/**/*")
    public class AppConfig {



            @Bean
            public DataSource dataSource() {
                MysqlDataSource ds
                        = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
                ds.setServerName("localhost");
                ds.setPortNumber(3306);
                ds.setDatabaseName("test");
                ds.setUser("root");
                ds.setPassword("");

                return ds;
               // return new EmbeddedDatabaseBuilder().addScript("schema.sql").build()
        }

        @Bean
        public SqlSessionFactory sqlSessionFactory() throws Exception {
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource());
            return sessionFactory.getObject();
        }

}
