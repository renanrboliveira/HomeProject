package br.com.sistcomp.enuns;

/**
 * Enum EstadoCivil representa os diversos estados civis.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumEstadoCivil {

    viuvo("Viúvo"), casadoComunhaoDeBens("Casado com Comunhão De Bens"),
    solteiro("Solteiro"),
    casadoComunhaoParcialDeBens("Casado com Comunhão Parcial De Bens"),
    casadoSeparacaoDeBens("Casado Separação De Bens"), divorciado("Divorciado"),
    separadoJudicialmente("Separado Judicialmente"),
    uniaoEstavel("União Estável"), outros("Outros");
    private final String nome;

    private EnumEstadoCivil(String nome) {
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
