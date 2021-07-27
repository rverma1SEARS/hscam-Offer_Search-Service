package com.transformco.hs.ccn.offersearch.config;

import java.time.LocalDate;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.transformco.hs.ccn.offersearch.dao.mapper")
@MappedTypes(value = { LocalDate.class })
@PropertySource("classpath:application.yml")
public class DataAccessConfig {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DataAccessConfig.class);

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.maxActive}")
	private int maxActive;
	@Value("${spring.datasource.maxIdle}")
	private int maxIdle;
	@Value("${spring.datasource.pingQuery}")
	private String pingQuery;
	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	@Value("${spring.datasource.poolMaximumCheckoutTime}")
	private int poolMaximumCheckoutTime;
	@Value("${spring.datasource.pingEnabled}")
	private boolean pingEnabled;
	@Value("${spring.datasource.poolPingConnectionsNotUsedFor}")
	private int poolPingConnectionsNotUsedFor;


	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		LOGGER.debug("Setting sql session factory.");
		factoryBean.setDataSource(dataSource());
		return factoryBean.getObject();
	}

	@Bean
	public DataSource dataSource() {
		PooledDataSource dataSource = new PooledDataSource(driver,url,username,password);
		dataSource.setPoolMaximumIdleConnections(maxIdle);
		dataSource.setPoolMaximumActiveConnections(maxActive);
		dataSource.setPoolMaximumCheckoutTime(poolMaximumCheckoutTime);
		dataSource.setPoolPingEnabled(pingEnabled);
		dataSource.setPoolPingQuery(pingQuery);
		dataSource.setPoolPingConnectionsNotUsedFor(poolPingConnectionsNotUsedFor);
		LOGGER.debug("DataPool Status : {} ", dataSource.getPoolState());
		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	

}
