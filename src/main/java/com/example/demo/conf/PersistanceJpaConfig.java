package com.example.demo.conf;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class PersistanceJpaConfig {

    @Bean
    public LocalSessionFactoryBean hibernateSessionFactory(@Autowired DataSource dataSource) {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setHibernateProperties(additionalProperties());

        return sessionFactory;
    }

    @Bean
    HibernateTransactionManager transactionManager(@Autowired SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);

        return transactionManager;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/hr");
        dataSource.setUsername("root");
        dataSource.setPassword("0000");
        return dataSource;
    }

    protected Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
//        properties.setProperty("hibernate.dialect", );
        return properties;
    }

}