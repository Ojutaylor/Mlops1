package com.example.backend_rees_pos.rees.roles;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends MongoRepository<Roles, String> {
    Roles findByRole(String role);
}
