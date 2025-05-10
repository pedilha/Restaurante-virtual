package org.example.restaurantevirtual.model;

public class Bebida {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bebida() {
    }

    public Bebida(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Bebida(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
