package br.com.sistcomp.enuns;

/**
 * Enum Nacionalidade representa a nacionalidade.
 *
 * @author Jefferson Araújo, jefferssonaraujo@gmail.com
 * @version 1.0
 * @since 28/08/2011
 *
 * Copyright (C) 2011 SistComp Empresa Jr.
 */
public enum EnumNacionalidade {

    brasileiro("Brasileiro"), brasileiroNaturalizado("Brasileiro Naturalizado"),
    estrangeiro("Estrangeiro");
    private final String nome;

    private EnumNacionalidade(String nome) {
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
