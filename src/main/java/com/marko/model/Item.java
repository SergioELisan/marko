package com.marko.model;

import java.util.Objects;

/**
 * @author Serginho
 */
public class Item {

    private int quantidade;
    private Produto produto;

    public Item() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        return Objects.equals(this.produto, other.produto);
    }

    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.quantidade;
        hash = 73 * hash + Objects.hashCode(this.produto);
        return hash;
    }
}
