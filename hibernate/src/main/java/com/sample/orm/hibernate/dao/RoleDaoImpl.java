package com.sample.orm.hibernate.dao;

import com.sample.orm.model.Role;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by joelm on 2017-05-04.
 */
@Repository("roleDao")
public class RoleDaoImpl extends HibernateDaoSupport implements RoleDao {
    @Transactional(readOnly = true)
    @Override
    public Role findById(String id) {
        Role role = null;
        List result = getHibernateTemplate().find("from Role where id=?", id);
        if (result != null && !result.isEmpty()) {
            role = (Role) result.get(0);
        }
        return role;
    }
}
