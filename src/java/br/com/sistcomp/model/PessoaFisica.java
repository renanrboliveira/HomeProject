package br.com.sistcomp.model;

import br.com.sistcomp.enuns.EnumEstadoCivil;
import br.com.sistcomp.enuns.EnumGrauDeInstrucao;
import br.com.sistcomp.enuns.EnumNacionalidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe PessoaFisica representa a entidade PessoaFisica.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
@Entity
@Table(name = "PEF_PESSOAS_FISICAS")
public class PessoaFisica extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pef_pessoas_fisicas_id")
    private Integer id;
    @Column(name = "pef_pessoas_fisicas_cpf")
    private String cpf;
    @Column(name = "pef_pessoas_fisicas_estado_civil")
    private EnumEstadoCivil estadoCivil;
    @Column(name = "pef_pessoas_grau_instrucao")
    private EnumGrauDeInstrucao grauDeInstrucao;
    @Column(name = "pef_pessoas_fisicas_nacionalidade")
    private EnumNacionalidade nacionalidade;
    @Column(name = "pef_pessoas_fisicas_naturalidade")
    private String naturalidade;
    @Column(name = "pef_pessoas_fisicas_orgao_emissor")
    private String orgaoEmissor;
    @Column(name = "pef_pessoas_fisicas_documento_identidade")
    private String documentoIdentidade;

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
        if (!(object instanceof PessoaFisica)) {
            return false;
        }
        PessoaFisica other = (PessoaFisica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sistcomp.model.PessoaFisica[ id=" + id + " ]";
    }
}
