package br.com.sistcomp.enuns;

/**
 * Enum StatusImovel representa o status atual do imovel.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumStatusImovel {

    disponivel("Disponível"), alugado("Alugado"), vendido("Vendido"),
    vendendo("Vendendo"), alugando("Alugando");
    private final String nome;

    private EnumStatusImovel(String nome) {
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
