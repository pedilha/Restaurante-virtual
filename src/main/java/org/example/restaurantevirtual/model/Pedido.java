package org.example.restaurantevirtual.model;

public class Pedido {
    private final String prato;
    private final String qtd;
    private final String bebida;
    private final boolean gelo;

    public Pedido(String prato, String qtd, String bebida, boolean gelo) {
        this.prato = prato;
        this.qtd = qtd;
        this.bebida = bebida;
        this.gelo = gelo;
    }
    public String getPrato()   { return prato; }
    public String getQtd()     { return qtd; }
    public String getBebida()  { return bebida; }
    public boolean isGelo(){ return gelo; }
}
