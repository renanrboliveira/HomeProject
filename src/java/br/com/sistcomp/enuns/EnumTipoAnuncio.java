package br.com.sistcomp.enuns;

/**
 * Enum TipoAnuncio representa os tipos de anuncios.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumTipoAnuncio {

    temporada("Temporada"), aluguel("Aluguel"), venda("Venda");
    private final String nome;

    private EnumTipoAnuncio(String nome) {
        this.nome = nome;
    }

    //getter and setter
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
