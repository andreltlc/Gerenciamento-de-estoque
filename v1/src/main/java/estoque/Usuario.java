package main.java.estoque;

private class Usuario {
    private String name;
    private String email;
    private String senha;
    private int cpf;
    
    public Usuario(String name, String email, String senha, int[] cpf) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
}
