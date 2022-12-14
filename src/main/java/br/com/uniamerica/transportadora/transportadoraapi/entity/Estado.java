package br.com.uniamerica.transportadora.transportadoraapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table(name = "tb_estados",schema = "transportadora")
public class Estado extends AbstractEntity{
    @Getter @Setter
    @Column(name = "nome",length = 30,nullable = false,unique = true)
    private String nome;

}
