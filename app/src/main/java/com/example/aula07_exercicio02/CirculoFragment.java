/*
 *@author:<Leonardo Lima 1110482423021>
 */
package com.example.aula07_exercicio02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aula07_exercicio02.controller.IGeometriaController;
import com.example.aula07_exercicio02.controller.OperacaoCirculo;
import com.example.aula07_exercicio02.model.Circulo;

public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRaio;
    private Button btnPerimetroCirculo;
    private Button btnAreaCirculo;
    private TextView tvResCirculo;

    public CirculoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaio = view.findViewById(R.id.etRaio);
        btnPerimetroCirculo = view.findViewById(R.id.btnPerimetroCirculo);
        btnAreaCirculo = view.findViewById(R.id.btnAreaCirculo);
        tvResCirculo = view.findViewById(R.id.tvResCirculo);
        tvResCirculo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaCirculo.setOnClickListener(op -> calcArea());
        btnPerimetroCirculo.setOnClickListener(op -> calcPer());

        return view;
    }

    private void calcPer() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(etRaio.getText().toString()));

        IGeometriaController<Circulo> op = new OperacaoCirculo();
        float perimetro = op.calcPerimetro(circulo);
        tvResCirculo.setText(getString(R.string.perimetro) + perimetro);
        limpaCampos();
    }

    private void limpaCampos() {
        etRaio.setText("");
    }

    private void calcArea() {
        Circulo circulo = new Circulo();
        circulo.setRaio(Float.parseFloat(etRaio.getText().toString()));

        IGeometriaController<Circulo> op = new OperacaoCirculo();
        float area = op.calcArea(circulo);
        tvResCirculo.setText(getString(R.string.area) + area);
        limpaCampos();
    }
}