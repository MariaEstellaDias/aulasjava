package br.dias.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity // classe será mapeada no banco de dados
@Table(name = "anuncio")
@Getter
@Setter
public class Anuncio {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar numeração sequencial - 1, 2, 3....
    @Column(name = "id")
    private int id;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao; // 200

    @Column(name = "valor", nullable = false)
    private double valor;

    @ManyToOne
    @JoinColumn(name = "iduser") //nome da coluna na tabela 
    @JsonIgnoreProperties("anuncios") // atributo do User que não deve ser preenchido
    private User usuario;

    

}
