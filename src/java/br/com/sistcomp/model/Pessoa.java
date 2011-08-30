package br.com.sistcomp.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classe abstrata Pessoa representa a entidade Pessoa.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "PES_PESSOAS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pes_pessoas_id")
    private Integer id;
    @Column(name = "pes_pessoas_nome")
    private String nome;
    @Column(name = "pes_pessoas_sobrenome")
    private String sobrenome;
    @Column(name = "pes_pessoas_sexo")
    private String sexo;
    @Column(name = "pes_pessoas_data_Nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "pes_pessoas_endereco")
    private Endereco endereco;
    @Column(name = "pes_pessoas_fotoPessoa")
    private Foto foto;

    //getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.Pessoa[ id=" + id + " ]";
    }
}
