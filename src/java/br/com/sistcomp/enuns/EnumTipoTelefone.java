package br.com.sistcomp.enuns;

/**
 * Enum Telefone representa os tipos de telefone.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumTipoTelefone {

    fax("Fax"), comercial("Comercial"), residencial("Residencial"),
    celular("Celular"), telefoneContato("Telefone contato");
    private final String nome;

    private EnumTipoTelefone(String nome) {
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
