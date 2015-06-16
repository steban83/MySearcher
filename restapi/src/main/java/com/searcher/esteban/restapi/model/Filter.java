package com.searcher.esteban.restapi.model;

import java.util.ArrayList;

public class Filter {
    private int idOrden;
    private ArrayList<TypeResult> lista;
    private String nombre;
    private Range rango;
    private String tipo;
    private String traduccionTitulo;
    private String valor;

    public int getIdOrden() {
        return this.idOrden;
    }

    public ArrayList<TypeResult> getLista() {
        return this.lista;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Range getRango() {
        return this.rango;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getTraduccionTitulo() {
        return this.traduccionTitulo;
    }

    public String getValor() {
        return this.valor;
    }

    public void setIdOrden(int paramInt) {
        this.idOrden = paramInt;
    }

    public void setLista(ArrayList<TypeResult> paramArrayList) {
        this.lista = paramArrayList;
    }

    public void setNombre(String paramString) {
        this.nombre = paramString;
    }

    public void setRango(Range paramRange) {
        this.rango = paramRange;
    }

    public void setTipo(String paramString) {
        this.tipo = paramString;
    }

    public void setTraduccionTitulo(String paramString) {
        this.traduccionTitulo = paramString;
    }

    public void setValor(String paramString) {
        this.valor = paramString;
    }
}
