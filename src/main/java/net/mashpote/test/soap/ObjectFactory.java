//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.11によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2017.05.28 時間 10:12:42 PM JST 
//


package net.mashpote.test.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.mashpote.test.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStatus_QNAME = new QName("http://soap.test.mashpote.net/", "getStatus");
    private final static QName _GetStatusResponse_QNAME = new QName("http://soap.test.mashpote.net/", "getStatusResponse");
    private final static QName _JobCancel_QNAME = new QName("http://soap.test.mashpote.net/", "jobCancel");
    private final static QName _JobCancelResponse_QNAME = new QName("http://soap.test.mashpote.net/", "jobCancelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.mashpote.test.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link JobCancel }
     * 
     */
    public JobCancel createJobCancel() {
        return new JobCancel();
    }

    /**
     * Create an instance of {@link JobCancelResponse }
     * 
     */
    public JobCancelResponse createJobCancelResponse() {
        return new JobCancelResponse();
    }

    /**
     * Create an instance of {@link JobStatusInput }
     * 
     */
    public JobStatusInput createJobStatusInput() {
        return new JobStatusInput();
    }

    /**
     * Create an instance of {@link JobStatusOutput }
     * 
     */
    public JobStatusOutput createJobStatusOutput() {
        return new JobStatusOutput();
    }

    /**
     * Create an instance of {@link JobCancelInput }
     * 
     */
    public JobCancelInput createJobCancelInput() {
        return new JobCancelInput();
    }

    /**
     * Create an instance of {@link JobCancelOutput }
     * 
     */
    public JobCancelOutput createJobCancelOutput() {
        return new JobCancelOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.test.mashpote.net/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.test.mashpote.net/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobCancel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.test.mashpote.net/", name = "jobCancel")
    public JAXBElement<JobCancel> createJobCancel(JobCancel value) {
        return new JAXBElement<JobCancel>(_JobCancel_QNAME, JobCancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobCancelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.test.mashpote.net/", name = "jobCancelResponse")
    public JAXBElement<JobCancelResponse> createJobCancelResponse(JobCancelResponse value) {
        return new JAXBElement<JobCancelResponse>(_JobCancelResponse_QNAME, JobCancelResponse.class, null, value);
    }

}
