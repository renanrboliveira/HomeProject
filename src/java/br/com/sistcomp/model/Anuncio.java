package br.com.sistcomp.model;

import br.com.sistcomp.enuns.EnumCategoriaImovel;
import br.com.sistcomp.enuns.EnumEstadoImovel;
import br.com.sistcomp.enuns.EnumStatusImovel;
import br.com.sistcomp.enuns.EnumTipoAnuncio;
import br.com.sistcomp.enuns.EnumTipoImovel;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Anuncio representa a entidade Anuncio.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "ANC_ANUNCIOS")
public class Anuncio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anc_anuncios_id")
    private Integer id;
    private Pessoa anunciante;
    private Imovel imovel;
    private EnumTipoImovel tipoImovel;
    private EnumCategoriaImovel categoriaImovel;
    private EnumStatusImovel statusImovel;
    private EnumEstadoImovel estadoImovel;
    private EnumTipoAnuncio tipoAnuncio;
    private float metragem;
    private float valorLocacao;
    private float valorVenda;
    private List<Mensagem> mensagens;

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
        if (!(object instanceof Anuncio)) {
            return false;
        }
        Anuncio other = (Anuncio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.Anuncio[ id=" + id + " ]";
    }
}
