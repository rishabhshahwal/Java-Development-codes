package com.cfs.SecurityP04;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    org.springframework.context.annotation.Role findByName(String name);
}
