package br.com.uniamerica.transportadora.transportadoraapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;
    @Getter @Setter
    @Column(name = "cadastro",nullable = false)
    private LocalDateTime cadastro;
    @Getter @Setter
    @Column(name = "atualizado")
    private LocalDateTime atualizado;
    @Getter @Setter
    @Column(name = "ativo",nullable = false)
    private boolean ativo;

    @PrePersist
    public void dataCadastro(){
        this.setCadastro(LocalDateTime.now());
        this.setAtivo(true);
    }

    @PreUpdate
    public void dataAtualizado(){
        this.setAtualizado(LocalDateTime.now());
    }

}
