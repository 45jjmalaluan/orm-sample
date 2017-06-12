package com.sample.orm.hibernate.config;

import com.sample.orm.hibernate.dao.RoleDao;
import com.sample.orm.hibernate.dao.RoleDaoImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by joelm on 2017-05-04.
 */
@Configuration
@ComponentScan({"com.sample.orm.hibernate.config"})
public class Dao {
    @Autowired
    private SessionFactory sessionFactory;

    @Bean
    public RoleDao roleDao() {
        RoleDaoImpl roleDao = new RoleDaoImpl();
        roleDao.setSessionFactory(sessionFactory);
        return roleDao;
    }
}
