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
 * <p>getStatusResponse complex type��Java�N���X�B
 * 
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
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
     * return�v���p�e�B�̒l���擾���܂��B
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
     * return�v���p�e�B�̒l��ݒ肵�܂��B
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
