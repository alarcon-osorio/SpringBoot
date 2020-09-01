package com.sventas.sventas.exception;

public class ModelNotFoundException {

    private String mensaje;

    public ModelNotFoundException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
