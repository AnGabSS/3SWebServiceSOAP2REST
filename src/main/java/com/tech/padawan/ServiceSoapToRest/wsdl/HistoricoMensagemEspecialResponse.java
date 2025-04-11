
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
 *         &lt;element name="HistoricoMensagemEspecialResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "historicoMensagemEspecialResult"
})
@XmlRootElement(name = "HistoricoMensagemEspecialResponse")
public class HistoricoMensagemEspecialResponse {

    @XmlElement(name = "HistoricoMensagemEspecialResult")
    protected String historicoMensagemEspecialResult;

    /**
     * Obtém o valor da propriedade historicoMensagemEspecialResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricoMensagemEspecialResult() {
        return historicoMensagemEspecialResult;
    }

    /**
     * Define o valor da propriedade historicoMensagemEspecialResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricoMensagemEspecialResult(String value) {
        this.historicoMensagemEspecialResult = value;
    }

}
