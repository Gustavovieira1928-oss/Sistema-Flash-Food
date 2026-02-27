
package model;

public class Categoria {
    private int id;
    private String nomeCategoria;

    public Categoria(int id, String nomeCategoria) {this.id = id;
    this.nomeCategoria = nomeCategoria;}

    public int getId() {return id;}

    public String getNomeCategoria() { return nomeCategoria;}
    
@Override
    public String toString() {
        return this.nomeCategoria; // Isso é o que aparecerá escrito no ComboBox
    }
}


