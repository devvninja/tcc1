package com.leonardo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity   // Entidade - Faz Mapeamento no Banco de Dados - Caso nome da Entidade for igual o nome da Tabela
//@Table (name = "grade") // Especifica o nome da tabela 
public class Grade {
    
    @Id     // Indica PK na Tabela
    @GeneratedValue (strategy = GenerationType.AUTO)   // Gerador - Gera automaticamente o ID - PK quando houver insert na tabela
    private Long id;

    @Column(length = 200, nullable = false)     // Tamanho e NOTNULL na tabela 
    private String name;

    @Column(length = 200, nullable = false)     // Tamanho e NOTNULL na tabela 
    private String cidade;


}
