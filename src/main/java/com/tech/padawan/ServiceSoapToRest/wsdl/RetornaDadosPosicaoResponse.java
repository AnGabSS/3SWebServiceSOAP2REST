
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
 *         &lt;element name="RetornaDadosPosicaoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "retornaDadosPosicaoResult"
})
@XmlRootElement(name = "RetornaDadosPosicaoResponse")
public class RetornaDadosPosicaoResponse {

    @XmlElement(name = "RetornaDadosPosicaoResult")
    protected String retornaDadosPosicaoResult;

    /**
     * Obtém o valor da propriedade retornaDadosPosicaoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornaDadosPosicaoResult() {
        return retornaDadosPosicaoResult;
    }

    /**
     * Define o valor da propriedade retornaDadosPosicaoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornaDadosPosicaoResult(String value) {
        this.retornaDadosPosicaoResult = value;
    }

}
