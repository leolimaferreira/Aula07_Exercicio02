/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio02.controller;

import com.example.aula07_exercicio02.model.Circulo;

public class OperacaoCirculo implements IGeometriaController<Circulo> {
    @Override
    public float calcArea(Circulo circulo) {
        return (float) (Math.PI * Math.pow(circulo.getRaio(), 2));
    }

    @Override
    public float calcPerimetro(Circulo circulo) {
        return (float) (2 * Math.PI * circulo.getRaio());
    }
}
