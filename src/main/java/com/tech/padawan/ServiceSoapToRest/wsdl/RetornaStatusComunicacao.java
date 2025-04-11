
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
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEquipamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QtdeRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "usuario",
    "senha",
    "idEquipamento",
    "tipoStatus",
    "qtdeRegistro"
})
@XmlRootElement(name = "RetornaStatusComunicacao")
public class RetornaStatusComunicacao {

    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "Senha")
    protected String senha;
    protected String idEquipamento;
    @XmlElement(name = "TipoStatus")
    protected String tipoStatus;
    @XmlElement(name = "QtdeRegistro")
    protected int qtdeRegistro;

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade idEquipamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEquipamento() {
        return idEquipamento;
    }

    /**
     * Define o valor da propriedade idEquipamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEquipamento(String value) {
        this.idEquipamento = value;
    }

    /**
     * Obtém o valor da propriedade tipoStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoStatus() {
        return tipoStatus;
    }

    /**
     * Define o valor da propriedade tipoStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoStatus(String value) {
        this.tipoStatus = value;
    }

    /**
     * Obtém o valor da propriedade qtdeRegistro.
     * 
     */
    public int getQtdeRegistro() {
        return qtdeRegistro;
    }

    /**
     * Define o valor da propriedade qtdeRegistro.
     * 
     */
    public void setQtdeRegistro(int value) {
        this.qtdeRegistro = value;
    }

}
