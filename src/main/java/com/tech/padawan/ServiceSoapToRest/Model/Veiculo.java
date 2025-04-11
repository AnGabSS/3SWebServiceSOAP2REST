package com.tech.padawan.ServiceSoapToRest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Veiculo {
    @JsonProperty("Frota")
    private String frota;

    @JsonProperty("Placa")
    private String placa;

    @JsonProperty("Modelo")
    private String modelo;

    @JsonProperty("Chassis")
    private String chassis;

    @JsonProperty("RENAVAM")
    private String renavam;

    @JsonProperty("idEquipamento")
    private String idEquipamento;

    @JsonProperty("idCliente")
    private String idCliente;

    @JsonProperty("NumSerie")
    private String numSerie;

    @JsonProperty("idVeiculo")
    private String idVeiculo;

    @JsonProperty("Tipo")
    private String tipo;

    public Veiculo() {
    }

    public Veiculo(String frota, String placa, String modelo, String chassis, String renavam, String idEquipamento, String idCliente, String numSerie, String idVeiculo, String tipo) {
        this.frota = frota;
        this.placa = placa;
        this.modelo = modelo;
        this.chassis = chassis;
        this.renavam = renavam;
        this.idEquipamento = idEquipamento;
        this.idCliente = idCliente;
        this.numSerie = numSerie;
        this.idVeiculo = idVeiculo;
        this.tipo = tipo;
    }

    public String getFrota() {
        return frota;
    }

    public void setFrota(String frota) {
        this.frota = frota;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(String idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(String idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
