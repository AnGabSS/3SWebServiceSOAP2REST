
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
 *         &lt;element name="RetornaDistanciaVeiculosResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "retornaDistanciaVeiculosResult"
})
@XmlRootElement(name = "RetornaDistanciaVeiculosResponse")
public class RetornaDistanciaVeiculosResponse {

    @XmlElement(name = "RetornaDistanciaVeiculosResult")
    protected String retornaDistanciaVeiculosResult;

    /**
     * Obtém o valor da propriedade retornaDistanciaVeiculosResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornaDistanciaVeiculosResult() {
        return retornaDistanciaVeiculosResult;
    }

    /**
     * Define o valor da propriedade retornaDistanciaVeiculosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornaDistanciaVeiculosResult(String value) {
        this.retornaDistanciaVeiculosResult = value;
    }

}
