package com.sample.orm.jpa.repository;

import com.sample.orm.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by joelm on 2017-05-04.
 */
public interface RoleRepository extends JpaRepository<Role, String> {
}
