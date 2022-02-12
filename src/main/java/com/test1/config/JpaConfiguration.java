package com.test1.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.test1")
public class JpaConfiguration{
	
}
//extends JpaBaseConfiguration {
//
//	protected JpaConfiguration(DataSource dataSource, JpaProperties properties,
//			ObjectProvider<JtaTransactionManager> jtaTransactionManager) {
//		super(dataSource, properties, jtaTransactionManager);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(final EntityManagerFactoryBuilder builder) {
//	        final LocalContainerEntityManagerFactoryBean ret =
//	                builder.dataSource(dataSource())
//	                .packages("com.test1")
//	                .properties(jpaProperties())
//	                .persistenceUnit("com.test1")
//	                .build();
//	        return ret;
//	}
//	
//	@Bean
//	public DataSource dataSource() {
//	        // In classpath from spring-boot-starter-web
//	        final Properties props = new Properties();
//	        props.put("driverClassName", "com.mysql.jdbc.Driver");
//	        props.put("jdbcUrl", "jdbc:mysql://localhost:3306/master?createDatabaseIfNotExist=false");
//	        props.put("username", "root");
//	        props.put("password", "mysql");
//	        HikariConfig hc = new HikariConfig(props);
//	        HikariDataSource ds = new HikariDataSource(hc);
//	        return ds;
//	}
//	
//	@Bean
//	public Map<String, String> jpaProperties() {
//	        Map<String, String> props = new HashMap<>();
//	        props.put("eclipselink.weaving", "false");
//	        props.put("eclipselink.logging.level.sql", "FINE");
//	        props.put("eclipselink.logging.parameters", "true");
//	        props.put("javax.persistence.schema-generation.database.action", "create");
//	        //props.put("javax.persistence.sql-load-script-source", "sql/import.sql");
//	        return props;
//	}
////	@Bean
////	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
////	        final MultiTenantJpaTransactionManager transactionManager = new MultiTenantJpaTransactionManager();
////	        transactionManager.setEntityManagerFactory(emf);
////	        return transactionManager;
////	}
//	
//	@Override
//	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
//	        return new EclipseLinkJpaVendorAdapter();
//	}
//
////	@Override
////	protected Map<String, Object> getVendorProperties() {
////		// TODO Auto-generated method stub
////		return null;
////	}
//	
//	
//	
//	@Override
//	protected Map<String, Object> getVendorProperties() {
//	        final Map<String, Object> ret = new HashMap<>();
//	        ret.put(PersistenceUnitProperties.BATCH_WRITING, BatchWriting.JDBC);
//	        return ret;
//	}
//
//
//}