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
 * <p>jobStatusOutput complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="jobStatusOutput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apiResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobSpec_all" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jobSpec_executed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jobSpec_not_executed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobStatusOutput", propOrder = {
    "apiResult",
    "jobSpecAll",
    "jobSpecExecuted",
    "jobSpecNotExecuted"
})
public class JobStatusOutput {

    protected String apiResult;
    @XmlElement(name = "jobSpec_all")
    protected int jobSpecAll;
    @XmlElement(name = "jobSpec_executed")
    protected int jobSpecExecuted;
    @XmlElement(name = "jobSpec_not_executed")
    protected int jobSpecNotExecuted;

    /**
     * apiResultプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiResult() {
        return apiResult;
    }

    /**
     * apiResultプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiResult(String value) {
        this.apiResult = value;
    }

    /**
     * jobSpecAllプロパティの値を取得します。
     * 
     */
    public int getJobSpecAll() {
        return jobSpecAll;
    }

    /**
     * jobSpecAllプロパティの値を設定します。
     * 
     */
    public void setJobSpecAll(int value) {
        this.jobSpecAll = value;
    }

    /**
     * jobSpecExecutedプロパティの値を取得します。
     * 
     */
    public int getJobSpecExecuted() {
        return jobSpecExecuted;
    }

    /**
     * jobSpecExecutedプロパティの値を設定します。
     * 
     */
    public void setJobSpecExecuted(int value) {
        this.jobSpecExecuted = value;
    }

    /**
     * jobSpecNotExecutedプロパティの値を取得します。
     * 
     */
    public int getJobSpecNotExecuted() {
        return jobSpecNotExecuted;
    }

    /**
     * jobSpecNotExecutedプロパティの値を設定します。
     * 
     */
    public void setJobSpecNotExecuted(int value) {
        this.jobSpecNotExecuted = value;
    }

}
