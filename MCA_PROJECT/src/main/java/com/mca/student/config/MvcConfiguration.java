package com.mca.student.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.mca.student.*")
@EnableWebMvc
//@EnableJpaRepositories(basePackages = "com.mca.student.Repository")
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	public Environment env;

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DataSource dataSource() {
		BasicDataSource db = new BasicDataSource();
		try {
			db.setDriverClassName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		db.setUrl("jdbc:oracle:thin:@192.168.1.15:1521:rfms");
		db.setUsername("rfms");
		db.setPassword("rfms");
		return db;
	}

	@Bean
	public HibernateTransactionManager hibTransMan() {
		return new HibernateTransactionManager(sessionFactory());
	}

	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource());
		lsfb.setPackagesToScan("com.mca.student.*");
		lsfb.setHibernateProperties(hibernateProperties());
		try {
			lsfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lsfb.getObject();
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.hbm2ddl.auto","update");
		properties.put("hibernate.show_sql", "true");
		return properties;
	}
}
