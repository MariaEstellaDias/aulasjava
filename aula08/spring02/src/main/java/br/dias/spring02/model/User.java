package br.dias.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // classe será mapeada no banco de dados
@Table(name = "user")
public class User {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerar numeração sequencial - 1, 2, 3....

    @Column(name = "id")
    private int id;

    @Column(name = "name" , length = 150, nullable = false)
    private String name;

    @Column(name = "email" , length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "password" , length = 30, nullable = false)
    private String password;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}