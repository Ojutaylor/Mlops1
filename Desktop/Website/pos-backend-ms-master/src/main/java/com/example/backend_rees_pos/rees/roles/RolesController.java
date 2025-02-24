package com.example.backend_rees_pos.rees.roles;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/roles")
public class RolesController {

    private final RolesService rolesService;

    @Autowired
    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @GetMapping
    public List<Roles> getAllRoles() {
        return rolesService.getAllRoles();
    }

    @GetMapping("/{role}")
    public Roles getRole(@PathVariable String role) {
        return rolesService.getRole(role);
    }

    @PostMapping
    public void addRole(@RequestBody Roles role) {
        rolesService.addRole(role);
    }

    @PutMapping("/{role}")
    public void updateRole(@PathVariable String role, @RequestBody Roles updatedRole) {
        rolesService.updateRole(role, updatedRole);
    }

    @DeleteMapping("/{role}")
    public void deleteRole(@PathVariable String role) {
        rolesService.deleteRole(role);
    }
}
