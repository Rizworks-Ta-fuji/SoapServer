package net.mashpote.soapapp.web.server;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import net.mashpote.test.soap.GetStatus;
import net.mashpote.test.soap.GetStatusResponse;
import net.mashpote.test.soap.JobStatusOutput;

@Endpoint
public class JobManageService
{
	// ���K�[
	private static final Logger logger = LoggerFactory.getLogger(JobManageService.class);
	// WSDL��targetNamespace�ƍ��킹��
	private static final String NAMESPACE_URI = "http://soap.test.mashpote.net/";

	@PostConstruct
    public void postConstruct() {
        logger.info("JobManageService created.");
    }

	// getStatus�̕���-> �������啶����ʂ���̂Œ���
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStatus")
	@ResponsePayload
	public JAXBElement<GetStatusResponse> getStatus(@RequestPayload JAXBElement<GetStatus> request)
	{
		logger.info("getStatus : start");
		
		// ���̓p�����[�^
		GetStatus getStatus = request.getValue();
		
		QName q1 = request.getName();
		
		// ���X�|���X�I�u�W�F�N�g
		GetStatusResponse response = new GetStatusResponse();
		
		JobStatusOutput jobStatusOutput = new JobStatusOutput();
		jobStatusOutput.setApiResult("0");
		response.setReturn(jobStatusOutput);
		
		// getStatusResponse�̕���-> �������啶����ʂ���̂Œ���
		JAXBElement<GetStatusResponse> res =
			    new JAXBElement(new QName(q1.getNamespaceURI(), "getStatusResponse"), GetStatusResponse.class, response);

		logger.info("getStatus : end");
		
		return res;
	}
}
