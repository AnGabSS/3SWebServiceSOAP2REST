
package com.tech.padawan.ServiceSoapToRest.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEquipamento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idPosicao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idSensor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idMensagem" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idTelemetria" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAlertaVelocidade" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAlertaSensor" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAlertaTemperatura" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAlertaTempoOperacaoContinua" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAlertaJornadaDiaria" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idAlertaMovimentacaoindevida" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCercaAlvo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCercaCheckPoint" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCercaLogradouro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCercaPoligonal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCercaRota" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuario",
    "senha",
    "idEquipamento",
    "idPosicao",
    "idSensor",
    "idMensagem",
    "idTelemetria",
    "idAlertaVelocidade",
    "idAlertaSensor",
    "idAlertaTemperatura",
    "idAlertaTempoOperacaoContinua",
    "idAlertaJornadaDiaria",
    "idAlertaMovimentacaoindevida",
    "idCercaAlvo",
    "idCercaCheckPoint",
    "idCercaLogradouro",
    "idCercaPoligonal",
    "idCercaRota"
})
@XmlRootElement(name = "RetornaDados")
public class RetornaDados {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Senha")
    protected String senha;
    protected long idEquipamento;
    protected long idPosicao;
    protected long idSensor;
    protected long idMensagem;
    protected long idTelemetria;
    protected long idAlertaVelocidade;
    protected long idAlertaSensor;
    protected long idAlertaTemperatura;
    protected long idAlertaTempoOperacaoContinua;
    protected long idAlertaJornadaDiaria;
    protected long idAlertaMovimentacaoindevida;
    protected long idCercaAlvo;
    protected long idCercaCheckPoint;
    protected long idCercaLogradouro;
    protected long idCercaPoligonal;
    protected long idCercaRota;

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade idEquipamento.
     * 
     */
    public long getIdEquipamento() {
        return idEquipamento;
    }

    /**
     * Define o valor da propriedade idEquipamento.
     * 
     */
    public void setIdEquipamento(long value) {
        this.idEquipamento = value;
    }

    /**
     * Obtém o valor da propriedade idPosicao.
     * 
     */
    public long getIdPosicao() {
        return idPosicao;
    }

    /**
     * Define o valor da propriedade idPosicao.
     * 
     */
    public void setIdPosicao(long value) {
        this.idPosicao = value;
    }

    /**
     * Obtém o valor da propriedade idSensor.
     * 
     */
    public long getIdSensor() {
        return idSensor;
    }

    /**
     * Define o valor da propriedade idSensor.
     * 
     */
    public void setIdSensor(long value) {
        this.idSensor = value;
    }

    /**
     * Obtém o valor da propriedade idMensagem.
     * 
     */
    public long getIdMensagem() {
        return idMensagem;
    }

    /**
     * Define o valor da propriedade idMensagem.
     * 
     */
    public void setIdMensagem(long value) {
        this.idMensagem = value;
    }

    /**
     * Obtém o valor da propriedade idTelemetria.
     * 
     */
    public long getIdTelemetria() {
        return idTelemetria;
    }

    /**
     * Define o valor da propriedade idTelemetria.
     * 
     */
    public void setIdTelemetria(long value) {
        this.idTelemetria = value;
    }

    /**
     * Obtém o valor da propriedade idAlertaVelocidade.
     * 
     */
    public long getIdAlertaVelocidade() {
        return idAlertaVelocidade;
    }

    /**
     * Define o valor da propriedade idAlertaVelocidade.
     * 
     */
    public void setIdAlertaVelocidade(long value) {
        this.idAlertaVelocidade = value;
    }

    /**
     * Obtém o valor da propriedade idAlertaSensor.
     * 
     */
    public long getIdAlertaSensor() {
        return idAlertaSensor;
    }

    /**
     * Define o valor da propriedade idAlertaSensor.
     * 
     */
    public void setIdAlertaSensor(long value) {
        this.idAlertaSensor = value;
    }

    /**
     * Obtém o valor da propriedade idAlertaTemperatura.
     * 
     */
    public long getIdAlertaTemperatura() {
        return idAlertaTemperatura;
    }

    /**
     * Define o valor da propriedade idAlertaTemperatura.
     * 
     */
    public void setIdAlertaTemperatura(long value) {
        this.idAlertaTemperatura = value;
    }

    /**
     * Obtém o valor da propriedade idAlertaTempoOperacaoContinua.
     * 
     */
    public long getIdAlertaTempoOperacaoContinua() {
        return idAlertaTempoOperacaoContinua;
    }

    /**
     * Define o valor da propriedade idAlertaTempoOperacaoContinua.
     * 
     */
    public void setIdAlertaTempoOperacaoContinua(long value) {
        this.idAlertaTempoOperacaoContinua = value;
    }

    /**
     * Obtém o valor da propriedade idAlertaJornadaDiaria.
     * 
     */
    public long getIdAlertaJornadaDiaria() {
        return idAlertaJornadaDiaria;
    }

    /**
     * Define o valor da propriedade idAlertaJornadaDiaria.
     * 
     */
    public void setIdAlertaJornadaDiaria(long value) {
        this.idAlertaJornadaDiaria = value;
    }

    /**
     * Obtém o valor da propriedade idAlertaMovimentacaoindevida.
     * 
     */
    public long getIdAlertaMovimentacaoindevida() {
        return idAlertaMovimentacaoindevida;
    }

    /**
     * Define o valor da propriedade idAlertaMovimentacaoindevida.
     * 
     */
    public void setIdAlertaMovimentacaoindevida(long value) {
        this.idAlertaMovimentacaoindevida = value;
    }

    /**
     * Obtém o valor da propriedade idCercaAlvo.
     * 
     */
    public long getIdCercaAlvo() {
        return idCercaAlvo;
    }

    /**
     * Define o valor da propriedade idCercaAlvo.
     * 
     */
    public void setIdCercaAlvo(long value) {
        this.idCercaAlvo = value;
    }

    /**
     * Obtém o valor da propriedade idCercaCheckPoint.
     * 
     */
    public long getIdCercaCheckPoint() {
        return idCercaCheckPoint;
    }

    /**
     * Define o valor da propriedade idCercaCheckPoint.
     * 
     */
    public void setIdCercaCheckPoint(long value) {
        this.idCercaCheckPoint = value;
    }

    /**
     * Obtém o valor da propriedade idCercaLogradouro.
     * 
     */
    public long getIdCercaLogradouro() {
        return idCercaLogradouro;
    }

    /**
     * Define o valor da propriedade idCercaLogradouro.
     * 
     */
    public void setIdCercaLogradouro(long value) {
        this.idCercaLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade idCercaPoligonal.
     * 
     */
    public long getIdCercaPoligonal() {
        return idCercaPoligonal;
    }

    /**
     * Define o valor da propriedade idCercaPoligonal.
     * 
     */
    public void setIdCercaPoligonal(long value) {
        this.idCercaPoligonal = value;
    }

    /**
     * Obtém o valor da propriedade idCercaRota.
     * 
     */
    public long getIdCercaRota() {
        return idCercaRota;
    }

    /**
     * Define o valor da propriedade idCercaRota.
     * 
     */
    public void setIdCercaRota(long value) {
        this.idCercaRota = value;
    }

}
