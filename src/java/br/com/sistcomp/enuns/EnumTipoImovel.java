package br.com.sistcomp.enuns;

/**
 * Enum TipoImovel representa os tipos de imovel.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumTipoImovel {

    casa("Casa"), terreno("Terreno"), lote("Lote"), chacara("Chácara"),
    apartamento("Apartamento"), loja("Loja"), salaComercial("Sala Comercial"),
    fazenda("Fazenda"), flat("Flat");
    private final String nome;

    private EnumTipoImovel(String nome) {
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
