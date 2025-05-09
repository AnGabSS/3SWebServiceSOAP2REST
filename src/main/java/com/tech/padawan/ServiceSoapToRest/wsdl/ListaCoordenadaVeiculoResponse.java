
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
 *         &lt;element name="ListaCoordenadaVeiculoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "listaCoordenadaVeiculoResult"
})
@XmlRootElement(name = "ListaCoordenadaVeiculoResponse")
public class ListaCoordenadaVeiculoResponse {

    @XmlElement(name = "ListaCoordenadaVeiculoResult")
    protected String listaCoordenadaVeiculoResult;

    /**
     * Obtém o valor da propriedade listaCoordenadaVeiculoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaCoordenadaVeiculoResult() {
        return listaCoordenadaVeiculoResult;
    }

    /**
     * Define o valor da propriedade listaCoordenadaVeiculoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaCoordenadaVeiculoResult(String value) {
        this.listaCoordenadaVeiculoResult = value;
    }

}
