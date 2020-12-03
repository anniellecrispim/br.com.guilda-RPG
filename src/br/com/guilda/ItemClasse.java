package br.com.guilda;

public class ItemClasse {

    private String atributoNome;
    private int atributo;
    private int numeroDoItem;

    public ItemClasse(String atributoNome, int atributo, int numeroDoItem) {
        this.atributoNome = atributoNome;
        this.atributo = atributo;
        this.numeroDoItem = numeroDoItem;
    }

    public int getAtributo() {
        return atributo;
    }

    public int getNumeroDoItem() {
        return numeroDoItem;
    }

    public void setNumeroDoItem(int numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }

    public String getAtributoNome() {
        return atributoNome;
    }

    @Override
    public String toString() {
        return " " + this.getAtributoNome();
    }
}
