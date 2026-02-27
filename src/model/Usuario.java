
package model;


public class Usuario {
     private int id;
    private String nome;
    private String login;
    private String senha;
    private String funcao;

    public Usuario(int id, String nome, String login, String senha, String funcao) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.funcao = funcao;
    }

    public String getFuncao() { return funcao;}

    public void setFuncao(String funcao) {this.funcao = funcao;}

    public int getId() {return id;}

    public String getNome() {return nome;}

    public String getLogin() {return login;}

    public String getSenha() {return senha;}

    public void setId(int id) {this.id = id;}

    public void setNome(String nome) {this.nome = nome;}

    public void setLogin(String login) {this.login = login;}

    public void setSenha(String senha) {this.senha = senha;}
    }
