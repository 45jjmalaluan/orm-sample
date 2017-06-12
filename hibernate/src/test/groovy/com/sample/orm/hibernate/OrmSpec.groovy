package com.sample.orm.hibernate

import com.sample.orm.hibernate.config.Dao
import com.sample.orm.hibernate.config.Persistence
import com.sample.orm.hibernate.dao.RoleDao
import com.sample.orm.model.Role
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Created by joelm on 2017-05-04.
 */
@ContextConfiguration(classes = [Persistence.class, Dao.class])
class OrmSpec extends Specification {
    @Autowired
    RoleDao roleDao

    def "Find existing USER role"() {
        Role role
        when: "using the Hibernate DAO"
        role = roleDao.findById("4c9ae8e6-46b8-43b8-a037-64cee0f04149")
        then: "role is found"
        role != null
        println role
    }

    def "Find existing ADMIN role"() {
        Role role
        when: "using the Hibernate DAO"
        role = roleDao.findById("00d08083-60dc-422e-a2e8-61a77ac35d7f")
        then: "role is found"
        role != null
        println role
    }

    def "Find role by a random ID"() {
        Role role
        when: "using the Hibernate DAO"
        role = roleDao.findById(UUID.randomUUID().toString())
        then: "role is not found"
        role == null
    }
}
