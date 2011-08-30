package br.com.sistcomp.enuns;

/**
 * Enum Endereco representa os tipos de Endereco.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumTipoEndereco {

    residencial("Residencial"), comercial("Comercial");
    private final String nome;

    private EnumTipoEndereco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
