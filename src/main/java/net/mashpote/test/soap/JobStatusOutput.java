//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.11�ɂ���Đ�������܂��� 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă������� 
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B 
// ������: 2017.05.28 ���� 10:12:42 PM JST 
//


package net.mashpote.test.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>jobStatusOutput complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
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
     * apiResult�v���p�e�B�̒l���擾���܂��B
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
     * apiResult�v���p�e�B�̒l��ݒ肵�܂��B
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
     * jobSpecAll�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public int getJobSpecAll() {
        return jobSpecAll;
    }

    /**
     * jobSpecAll�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setJobSpecAll(int value) {
        this.jobSpecAll = value;
    }

    /**
     * jobSpecExecuted�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public int getJobSpecExecuted() {
        return jobSpecExecuted;
    }

    /**
     * jobSpecExecuted�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setJobSpecExecuted(int value) {
        this.jobSpecExecuted = value;
    }

    /**
     * jobSpecNotExecuted�v���p�e�B�̒l���擾���܂��B
     * 
     */
    public int getJobSpecNotExecuted() {
        return jobSpecNotExecuted;
    }

    /**
     * jobSpecNotExecuted�v���p�e�B�̒l��ݒ肵�܂��B
     * 
     */
    public void setJobSpecNotExecuted(int value) {
        this.jobSpecNotExecuted = value;
    }

}
