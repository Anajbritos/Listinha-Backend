package io.ana.julia.listinha.data.dto;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;

    public UserDTO() {}
    public UserDTO(
            Long id,
            String name,
            String email,
            String password) {
        this.id = id;
        this.name = name;
        this.email = email;
       this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
       return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}
