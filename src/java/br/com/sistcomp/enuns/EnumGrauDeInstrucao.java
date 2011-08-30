package br.com.sistcomp.enuns;

/**
 * Enum GrauDeInstrucao representa os graus de instrução.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumGrauDeInstrucao {

    naoAlfabetizado("Não Alfabetizado"),
    ensinoFundamentalIncompleto("Ensino Fundamental Incompleto"),
    medioCompleto("Médio Completo"), medioIncompleto("Médio Incompleto"),
    superiorIncompleto("Superior Incompleto"),
    superiorCompleto("Superior Completo"), especializacao("Especialização"),
    mestrado("Mestrado"), doutorado("Doutorado");
    private final String nome;

    private EnumGrauDeInstrucao(String nome) {
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
