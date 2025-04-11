
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
 *         &lt;element name="HistoricoOcorrenciaVelocidadeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "historicoOcorrenciaVelocidadeResult"
})
@XmlRootElement(name = "HistoricoOcorrenciaVelocidadeResponse")
public class HistoricoOcorrenciaVelocidadeResponse {

    @XmlElement(name = "HistoricoOcorrenciaVelocidadeResult")
    protected String historicoOcorrenciaVelocidadeResult;

    /**
     * Obtém o valor da propriedade historicoOcorrenciaVelocidadeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricoOcorrenciaVelocidadeResult() {
        return historicoOcorrenciaVelocidadeResult;
    }

    /**
     * Define o valor da propriedade historicoOcorrenciaVelocidadeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricoOcorrenciaVelocidadeResult(String value) {
        this.historicoOcorrenciaVelocidadeResult = value;
    }

}
