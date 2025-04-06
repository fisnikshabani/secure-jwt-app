package com.example.secure_jwt_app.repository;

import com.example.secure_jwt_app.constant.ERole;
import com.example.secure_jwt_app.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByName(ERole name);

}
