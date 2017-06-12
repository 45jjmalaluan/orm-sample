package com.sample.orm.hibernate.dao;

import com.sample.orm.model.Role;

import java.util.UUID;

/**
 * Created by joelm on 2017-05-04.
 */
public interface RoleDao {
    Role findById(String id);
}
