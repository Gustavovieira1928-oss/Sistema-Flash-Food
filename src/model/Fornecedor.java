
package model;

public class Fornecedor {
    private int id;
    private String nome;
    private String cnpj;
    private String contato;

    public Fornecedor(int id, String nome, String cnpj, String contato) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
    }

    public int getId() {return id; }

    public String getNome() {return nome;}

    public String getCnpj() {return cnpj;}

    public String getContato() {return contato;}

    public void setId(int id) { this.id = id;}

    public void setNome(String nome) {this.nome = nome;}

    public void setCnpj(String cnpj) {this.cnpj = cnpj;}

    public void setContato(String contato) {this.contato = contato;}
    
}
