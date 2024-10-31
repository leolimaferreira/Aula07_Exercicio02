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
import com.example.aula07_exercicio02.controller.OperacaoRetangulo;
import com.example.aula07_exercicio02.model.Retangulo;

public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etBase;
    private EditText etAltura;
    private Button btnPerimetroRetangulo;
    private Button btnAreaRetangulo;
    private TextView tvResRetangulo;

    public RetanguloFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etBase = view.findViewById(R.id.etBase);
        etAltura = view.findViewById(R.id.etAltura);
        btnPerimetroRetangulo = view.findViewById(R.id.btnPerimetroRetangulo);
        btnAreaRetangulo = view.findViewById(R.id.btnAreaRetangulo);
        tvResRetangulo = view.findViewById(R.id.tvResRetangulo);
        tvResRetangulo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaRetangulo.setOnClickListener(op -> calcArea());
        btnPerimetroRetangulo.setOnClickListener(op -> calcPer());

        return view;
    }
    private void calcPer() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Float.parseFloat(etAltura.getText().toString()));
        retangulo.setBase(Float.parseFloat(etBase.getText().toString()));

        IGeometriaController<Retangulo> op = new OperacaoRetangulo();
        float perimetro = op.calcPerimetro(retangulo);
        tvResRetangulo.setText(getString(R.string.perimetro) + perimetro);
        limpaCampos();
    }

    private void limpaCampos() {
        etAltura.setText("");
        etBase.setText("");
    }

    private void calcArea() {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Float.parseFloat(etAltura.getText().toString()));
        retangulo.setBase(Float.parseFloat(etBase.getText().toString()));

        IGeometriaController<Retangulo> op = new OperacaoRetangulo();
        float area = op.calcArea(retangulo);
        tvResRetangulo.setText(getString(R.string.area) + area);
        limpaCampos();
    }
}