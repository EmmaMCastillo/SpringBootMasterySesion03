package com.tdx.sesion3.dto;

public class ErrorApi {
    private String codigo;
    private String mensaje;

    public  ErrorApi(String codigo, String  mensaje){
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
