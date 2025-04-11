
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
 *         &lt;element name="RetornaUtilizacaoVeiculoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "retornaUtilizacaoVeiculoResult"
})
@XmlRootElement(name = "RetornaUtilizacaoVeiculoResponse")
public class RetornaUtilizacaoVeiculoResponse {

    @XmlElement(name = "RetornaUtilizacaoVeiculoResult")
    protected String retornaUtilizacaoVeiculoResult;

    /**
     * Obtém o valor da propriedade retornaUtilizacaoVeiculoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetornaUtilizacaoVeiculoResult() {
        return retornaUtilizacaoVeiculoResult;
    }

    /**
     * Define o valor da propriedade retornaUtilizacaoVeiculoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetornaUtilizacaoVeiculoResult(String value) {
        this.retornaUtilizacaoVeiculoResult = value;
    }

}
