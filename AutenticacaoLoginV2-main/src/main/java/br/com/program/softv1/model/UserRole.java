package br.com.program.softv1.model;

public enum UserRole {
    ADMIN("admin"),
    USER("pessoa"),
    EMPRESA("empresa");
    
    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
