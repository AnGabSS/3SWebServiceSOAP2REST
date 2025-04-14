package com.tech.padawan.ServiceSoapToRest.Model;

import java.time.LocalDateTime;

public class Cerca {
    private String frota;
    private String placa;
    private String tempoNoStatus;
    private String status;
    private LocalDateTime dataAlteracaoStatus;
    private Double bateria;
    private String local;
    private LocalDateTime ultimaComunicacao;
    private String endereco;
    private Double frete;

    public Cerca() {
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

    public String getTempoNoStatus() {
        return tempoNoStatus;
    }

    public void setTempoNoStatus(String tempoNoStatus) {
        this.tempoNoStatus = tempoNoStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataAlteracaoStatus() {
        return dataAlteracaoStatus;
    }

    public void setDataAlteracaoStatus(LocalDateTime dataAlteracaoStatus) {
        this.dataAlteracaoStatus = dataAlteracaoStatus;
    }

    public Double getBateria() {
        return bateria;
    }

    public void setBateria(Double bateria) {
        this.bateria = bateria;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getUltimaComunicacao() {
        return ultimaComunicacao;
    }

    public void setUltimaComunicacao(LocalDateTime ultimaComunicacao) {
        this.ultimaComunicacao = ultimaComunicacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    @Override
    public String toString() {
        return "Cerca{" +
                "frota='" + frota + '\'' +
                ", placa='" + placa + '\'' +
                ", tempoNoStatus='" + tempoNoStatus + '\'' +
                ", status='" + status + '\'' +
                ", dataAlteracaoStatus=" + dataAlteracaoStatus +
                ", bateria=" + bateria +
                ", local='" + local + '\'' +
                ", ultimaComunicacao=" + ultimaComunicacao +
                ", endereco='" + endereco + '\'' +
                ", frete=" + frete +
                '}';
    }
}
