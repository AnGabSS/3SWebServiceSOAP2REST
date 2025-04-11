
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
 *         &lt;element name="ListaClientesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "listaClientesResult"
})
@XmlRootElement(name = "ListaClientesResponse")
public class ListaClientesResponse {

    @XmlElement(name = "ListaClientesResult")
    protected String listaClientesResult;

    /**
     * Obtém o valor da propriedade listaClientesResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaClientesResult() {
        return listaClientesResult;
    }

    /**
     * Define o valor da propriedade listaClientesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaClientesResult(String value) {
        this.listaClientesResult = value;
    }

}
