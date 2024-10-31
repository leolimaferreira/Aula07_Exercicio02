/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio02.controller;

import com.example.aula07_exercicio02.model.Retangulo;

public class OperacaoRetangulo implements IGeometriaController<Retangulo> {
    @Override
    public float calcArea(Retangulo retangulo) {
        return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public float calcPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getBase() + retangulo.getAltura());
    }
}
