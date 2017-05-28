//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.11によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2017.05.28 時間 10:12:42 PM JST 
//


package net.mashpote.test.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getStatusResponse complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="getStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap.test.mashpote.net/}jobStatusOutput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatusResponse", propOrder = {
    "_return"
})
public class GetStatusResponse {

    @XmlElement(name = "return")
    protected JobStatusOutput _return;

    /**
     * returnプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JobStatusOutput }
     *     
     */
    public JobStatusOutput getReturn() {
        return _return;
    }

    /**
     * returnプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatusOutput }
     *     
     */
    public void setReturn(JobStatusOutput value) {
        this._return = value;
    }

}
