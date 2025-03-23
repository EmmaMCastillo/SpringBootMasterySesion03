package com.tdx.sesion3.dto;

public class RespuestaApi<T> {
    private  String estado;
    private T datos;

    public RespuestaApi(String estado, T datos){
        this.estado = estado;
        this.datos = datos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }
}
