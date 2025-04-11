
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
 *         &lt;element name="ListaFormulariosGrupoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "listaFormulariosGrupoResult"
})
@XmlRootElement(name = "ListaFormulariosGrupoResponse")
public class ListaFormulariosGrupoResponse {

    @XmlElement(name = "ListaFormulariosGrupoResult")
    protected String listaFormulariosGrupoResult;

    /**
     * Obtém o valor da propriedade listaFormulariosGrupoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaFormulariosGrupoResult() {
        return listaFormulariosGrupoResult;
    }

    /**
     * Define o valor da propriedade listaFormulariosGrupoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaFormulariosGrupoResult(String value) {
        this.listaFormulariosGrupoResult = value;
    }

}
