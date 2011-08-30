package br.com.sistcomp.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe EspecificacaoImovel representa a especificacao do Imovel.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "EIM_ESPECIFICACAO_IMOVEL")
public class EspecificacaoImovel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eim_especificacoes_imoveis_id")
    private Integer id;
    private Boolean conjugado;
    private Boolean financiado;
    private Boolean forrado;
    private Boolean logradouroPavimentado;
    private Boolean mobiliado;
    private Integer quantidadeDormitorio;
    private Integer quantidadeSuite;
    private Integer pavimento;
    private Integer vagaVeiculos;

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
        if (!(object instanceof EspecificacaoImovel)) {
            return false;
        }
        EspecificacaoImovel other = (EspecificacaoImovel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.EspecificacaoImovel[ id=" + id + " ]";
    }
}
