package com.example.backend_rees_pos.rees.roles;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesService {

    private final RolesRepository rolesRepository;

    @Autowired
    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    public Roles getRole(String role) {
        return rolesRepository.findByRole(role);
    }

    public void addRole(Roles role) {
        rolesRepository.save(role);
    }

    public void updateRole(String roleName, Roles updatedRole) {
        Roles existingRole = rolesRepository.findByRole(roleName);
        if (existingRole != null) {
            existingRole.setDescription(updatedRole.getDescription()); // Update fields
            rolesRepository.save(existingRole);
        }
    }

    public void deleteRole(String role) {
        Roles existingRole = rolesRepository.findByRole(role);
        if (existingRole != null) {
            rolesRepository.delete(existingRole);
        }
    }
}
