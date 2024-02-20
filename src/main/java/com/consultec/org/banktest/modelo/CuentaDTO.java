package com.consultec.org.banktest.modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Date;

public class CuentaDTO implements Serializable {
    private Long numeroCuenta;
    private String alias;
    private String estado;
    private String tipoCuenta;
    private double balance;
    private double interes;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;


    public CuentaDTO() { }

    public CuentaDTO(Long numeroCuenta, String alias, String estado, String tipoCuenta, double balance, double interes, Date fecha_creacion) {
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.estado = estado;
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
        this.interes = interes;
        this.fecha_creacion = fecha_creacion;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
