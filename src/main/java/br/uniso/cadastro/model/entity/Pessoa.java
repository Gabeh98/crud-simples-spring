package br.uniso.cadastro.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Cpf", nullable = false)
    private Long cpf;

    @Column(name = "Rg", nullable = false)
    private String rg;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Idade", nullable = false)
    private Integer idade;

}
