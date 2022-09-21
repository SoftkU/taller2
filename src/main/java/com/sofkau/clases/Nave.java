package com.sofkau.clases;

public class Nave {
    private String nombe;
    private float pesoEnKG;
    private String origen;
    private boolean activo;

    public Nave(String nombe, float pesoEnKG, String origen) {
        this.nombe = nombe;
        this.pesoEnKG = pesoEnKG;
        this.origen = origen;
        this.activo = true;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public float getPesoEnKG() {
        return pesoEnKG;
    }

    public void setPesoEnKG(float pesoEnKG) {
        this.pesoEnKG = pesoEnKG;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
