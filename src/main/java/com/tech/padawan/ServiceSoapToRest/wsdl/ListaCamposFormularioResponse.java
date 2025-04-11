
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
 *         &lt;element name="ListaCamposFormularioResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "listaCamposFormularioResult"
})
@XmlRootElement(name = "ListaCamposFormularioResponse")
public class ListaCamposFormularioResponse {

    @XmlElement(name = "ListaCamposFormularioResult")
    protected String listaCamposFormularioResult;

    /**
     * Obtém o valor da propriedade listaCamposFormularioResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaCamposFormularioResult() {
        return listaCamposFormularioResult;
    }

    /**
     * Define o valor da propriedade listaCamposFormularioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaCamposFormularioResult(String value) {
        this.listaCamposFormularioResult = value;
    }

}
