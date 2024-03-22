package com.mainapp.morekidsapp.modelo.entity;

import java.math.BigDecimal;

public class ItemVenda {
    private Vendas vendas;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal total;
    private BigDecimal desconto;

    public ItemVenda() {

    }

    public ItemVenda(Vendas vendas, Produto produto, Integer quantidade, BigDecimal total, BigDecimal desconto) {
        this.vendas = vendas;
        this.produto = produto;
        this.quantidade = quantidade;
        this.total = total;
        this.desconto = desconto;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
}
