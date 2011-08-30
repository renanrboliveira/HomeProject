package br.com.sistcomp.model;

import br.com.sistcomp.enuns.EnumTipoEndereco;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Endereco representa a entidade Endereco.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "END_ENDERECOS")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "end_enderecos_id")
    private Integer id;
    @Column(name = "end_enderecos_logradouro")
    private String logradouro;
    @Column(name = "end_enderecos_numero")
    private String numero;
    @Column(name = "end_enderecos_bairro")
    private Bairro bairro;
    @Column(name = "end_enderecos_cep")
    private String cep;
    @Column(name = "end_enderecos_cidade")
    private Cidade cidade;
    @Column(name = "end_enderecos_uf")
    private UnidadeFederativa uf;
    @Column(name = "end_enderecos_complemento")
    private String complemento;
    @Column(name = "end_enderecos_ponto_referencia")
    private String pontoReferenecia;
    @Column(name = "end_enderecos_tipo_endereco")
    private EnumTipoEndereco tipoEndereco;

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
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.Endereco[ id=" + id + " ]";
    }
}
