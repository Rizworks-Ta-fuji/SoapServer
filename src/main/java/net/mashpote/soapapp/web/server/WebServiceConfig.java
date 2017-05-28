package net.mashpote.soapapp.web.server;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/sws/*");
	}

	// XSD�t�@�C�����p
	// http://localhost:port/sws/MashpoteSoapService.wsdl
	@Bean(name = "MashpoteSoapService")
	public Wsdl11Definition getJobAdministrationService() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("MashpoteSoapService.xsd"));
        return wsdl11Definition;
	}

//	@Bean
//	public XsdSchema JobAdministrationServiceSchema() {
//		return new SimpleXsdSchema(new ClassPathResource("JobAdministrationService.xsd"));
//	}

	// WSDL�t�@�C�����p
	// http://localhost:port/sws/MashpoteSoapServiceWSDL.wsdl
	@Bean(name = "MashpoteSoapServiceWSDL")
    public Wsdl11Definition defaultWsdl11Definition() {
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("MashpoteSoapService.wsdl"));
        return wsdl11Definition;
    }
}
