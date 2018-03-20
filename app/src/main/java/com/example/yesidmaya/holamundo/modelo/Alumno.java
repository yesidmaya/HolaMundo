package com.example.yesidmaya.holamundo.modelo;

import java.util.Date;

/**
 * Created by yesidmaya on 14/03/18.
 */

public class Alumno {

    private String nombre;
    private long numero_cuenta;
    private Date fechanacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}
