package com.sample.orm.jpa

import com.sample.orm.jpa.config.Persistence
import com.sample.orm.jpa.repository.RoleRepository
import com.sample.orm.model.Role
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

/**
 * Created by joelm on 2017-05-04.
 */
@ContextConfiguration(classes = [Persistence.class, RoleRepository.class])
@Transactional(readOnly = true)
class OrmSpec extends Specification {
    @Autowired
    RoleRepository roleRepository

    def "Find existing USER role"() {
        Role role
        when: "using the JPA Repository"
        role = roleRepository.getOne("4c9ae8e6-46b8-43b8-a037-64cee0f04149")
        then: "role is found"
        role != null
        println role
    }

    def "Find existing ADMIN role"() {
        Role role
        when: "using the JPA Repository"
        role = roleRepository.getOne("00d08083-60dc-422e-a2e8-61a77ac35d7f")
        then: "role is found"
        role != null
        println role
    }

    def "Find role by a random ID"() {
        Role role
        when: "using the JPA Repository"
        role = roleRepository.getOne(UUID.randomUUID().toString())
        then: "role is not found"
        role != null
    }
}
