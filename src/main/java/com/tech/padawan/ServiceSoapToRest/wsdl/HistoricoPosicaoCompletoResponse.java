
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
 *         &lt;element name="HistoricoPosicaoCompletoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "historicoPosicaoCompletoResult"
})
@XmlRootElement(name = "HistoricoPosicaoCompletoResponse")
public class HistoricoPosicaoCompletoResponse {

    @XmlElement(name = "HistoricoPosicaoCompletoResult")
    protected String historicoPosicaoCompletoResult;

    /**
     * Obtém o valor da propriedade historicoPosicaoCompletoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricoPosicaoCompletoResult() {
        return historicoPosicaoCompletoResult;
    }

    /**
     * Define o valor da propriedade historicoPosicaoCompletoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricoPosicaoCompletoResult(String value) {
        this.historicoPosicaoCompletoResult = value;
    }

}
