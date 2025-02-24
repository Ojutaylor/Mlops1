package com.example.backend_rees_pos.rees.roles;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Roles {
    private String role;
    private String description;

    public Roles() {
    }

    public Roles(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    
}
