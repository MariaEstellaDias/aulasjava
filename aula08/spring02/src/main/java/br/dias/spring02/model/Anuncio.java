package br.dias.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // classe será mapeada no banco de dados
@Table(name = "anuncio")
public class Anuncio {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar numeração sequencial - 1, 2, 3....
    @Column(name = "id")
    private int id;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao; // 200

    @Column(name = "valor", nullable = false)
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}