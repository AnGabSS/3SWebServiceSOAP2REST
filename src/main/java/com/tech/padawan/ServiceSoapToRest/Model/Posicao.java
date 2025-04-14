package com.tech.padawan.ServiceSoapToRest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Posicao {

    @JsonProperty("idPosicao")
    private String idPosicao;

    @JsonProperty("Frota")
    private String frota;

    @JsonProperty("Placa")
    private String placa;

    @JsonProperty("Modelo")
    private String modelo;

    @JsonProperty("Data")
    private String data;

    @JsonProperty("Velocidade")
    private String velocidade;

    @JsonProperty("Satelite")
    private String satelite;

    @JsonProperty("Ignicao")
    private String ignicao;

    @JsonProperty("Direcao")
    private String direcao;

    @JsonProperty("UF")
    private String uf;

    @JsonProperty("Cidade")
    private String cidade;

    @JsonProperty("Bairro")
    private String bairro;

    @JsonProperty("Endereco")
    private String endereco;

    @JsonProperty("Numero")
    private String numero;

    @JsonProperty("CEP")
    private String cep;

    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("idEquipamento")
    private String idEquipamento;

    @JsonProperty("idVeiculo")
    private String idVeiculo;

    @JsonProperty("Bloqueio")
    private String bloqueio;

    @JsonProperty("BatBackup")
    private String batBackup;

    @JsonProperty("Odometro")
    private String odometro;

    @JsonProperty("Hourmeter")
    private String hourmeter;

    private String local = null;

    // Construtor padrão
    public Posicao() {
    }

    // Getters e Setters
    public String getIdPosicao() {
        return idPosicao;
    }

    public void setIdPosicao(String idPosicao) {
        this.idPosicao = idPosicao;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getSatelite() {
        return satelite;
    }

    public void setSatelite(String satelite) {
        this.satelite = satelite;
    }

    public String getIgnicao() {
        return ignicao;
    }

    public void setIgnicao(String ignicao) {
        this.ignicao = ignicao;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(String idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(String idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(String bloqueio) {
        this.bloqueio = bloqueio;
    }

    public String getBatBackup() {
        return batBackup;
    }

    public void setBatBackup(String batBackup) {
        this.batBackup = batBackup;
    }

    public String getOdometro() {
        return odometro;
    }

    public void setOdometro(String odometro) {
        this.odometro = odometro;
    }

    public String getHourmeter() {
        return hourmeter;
    }

    public void setHourmeter(String hourmeter) {
        this.hourmeter = hourmeter;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

