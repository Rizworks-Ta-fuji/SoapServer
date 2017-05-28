//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.11によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2017.05.28 時間 10:12:42 PM JST 
//


package net.mashpote.test.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>jobCancel complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="jobCancel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://soap.test.mashpote.net/}jobCancelInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobCancel", propOrder = {
    "arg0"
})
public class JobCancel {

    protected JobCancelInput arg0;

    /**
     * arg0プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JobCancelInput }
     *     
     */
    public JobCancelInput getArg0() {
        return arg0;
    }

    /**
     * arg0プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JobCancelInput }
     *     
     */
    public void setArg0(JobCancelInput value) {
        this.arg0 = value;
    }

}
