package br.com.sistcomp.model;

import br.com.sistcomp.enuns.EnumTipoTelefone;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Telefone representa a entidade Telefone.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "TEL_TELEFONES")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tel_telefones_id")
    private Integer id;
    @Column(name = "tel_telefones_ddd", length = 2)
    private String ddd;
    @Column(name = "tel_telefones_numero")
    private String numero;
    @Column(name = "tel_telefones_tipo")
    private EnumTipoTelefone tipo;

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
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.Telefone[ id=" + id + " ]";
    }
}
