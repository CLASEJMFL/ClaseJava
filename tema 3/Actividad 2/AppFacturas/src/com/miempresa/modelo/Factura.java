package com.miempresa.modelo;

public class Factura {
    // Atributos
    private Cliente cliente;
    private double montoBase;
    private double montoTotal;

    // Constructor

    public Factura(Cliente cliente, double montoBase) {
        this.cliente = cliente;
        this.montoBase = montoBase;
    }

    // Método que requiere la CalculadorImpuestos (del paquete 'util')
    public void setMontoTotal(double iva) {
        this.montoTotal = this.montoBase + iva;
    }

    // Getters para mostrar el resutlado en Main
    public Cliente getCliente() { return cliente; }
    public double getMontoBase() { return montoBase; }
    public double getMontoTotal() { return montoTotal; }
}

