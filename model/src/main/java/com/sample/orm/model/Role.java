package com.sample.orm.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;

/**
 * Role entity.
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    private String role;

    public String getId() {
        return id;
    }

    public void setId(String idParam) {
        id = idParam;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String roleParam) {
        role = roleParam;
    }

    @Override
    public String toString() {
        return "Role{" +
            "id=" + id +
            ", role='" + role + '\'' +
            '}';
    }
}