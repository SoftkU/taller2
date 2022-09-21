package com.sofkau.clases;

import com.sofkau.interfaces.InterfaceNaves;

public class NaveLanzadera extends Nave implements InterfaceNaves {

String combustible;
String carga;
String potencia;
String capacidadDeTrasporte;

    public NaveLanzadera(String nombe, float pesoEnKG, String origen, String combustible, String carga, String potencia, String capacidadDeTrasporte) {
        super(nombe, pesoEnKG, origen);
        this.combustible = combustible;
        this.carga = carga;
        this.potencia = potencia;
        this.capacidadDeTrasporte = capacidadDeTrasporte;
    }

    @Override
    public void iniciarMision() {

    }

    @Override
    public void finalizarMision() {

    }

    @Override
    public void archivarNave() {

    }
}
