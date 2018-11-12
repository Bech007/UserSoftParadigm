package com.softparadigm.UserSoftParadigm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softparadigm.UserSoftParadigm.model.Role;
import com.softparadigm.UserSoftParadigm.model.RoleName;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
