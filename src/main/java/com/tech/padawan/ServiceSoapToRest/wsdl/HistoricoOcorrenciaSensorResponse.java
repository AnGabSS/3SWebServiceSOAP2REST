
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
 *         &lt;element name="HistoricoOcorrenciaSensorResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "historicoOcorrenciaSensorResult"
})
@XmlRootElement(name = "HistoricoOcorrenciaSensorResponse")
public class HistoricoOcorrenciaSensorResponse {

    @XmlElement(name = "HistoricoOcorrenciaSensorResult")
    protected String historicoOcorrenciaSensorResult;

    /**
     * Obtém o valor da propriedade historicoOcorrenciaSensorResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricoOcorrenciaSensorResult() {
        return historicoOcorrenciaSensorResult;
    }

    /**
     * Define o valor da propriedade historicoOcorrenciaSensorResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricoOcorrenciaSensorResult(String value) {
        this.historicoOcorrenciaSensorResult = value;
    }

}
