package br.com.sistcomp.enuns;

/**
 * Enum EstadoImovel representa o estado que o imóvel esta.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumEstadoImovel {

    novo("Novo"), usado("Usado"), emConstrucao("Em Constrção"),
    naPlanta("Na Planta"), outros("Outros");
    private final String nome;

    private EnumEstadoImovel(String nome) {
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
