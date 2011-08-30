package br.com.sistcomp.enuns;

/**
 * Enum CategoriaImovel representa os tipos de Categorias do imovel.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumCategoriaImovel {

    comercial("Comercial"), residencial("Residencial"), industrial("Industrial");
    private final String nome;

    private EnumCategoriaImovel(String nome) {
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
