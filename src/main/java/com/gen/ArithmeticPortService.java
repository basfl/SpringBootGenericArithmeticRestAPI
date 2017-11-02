
package com.gen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "arithmeticPortService", targetNamespace = "http://spring.io/guides/gs-producing-web-service", wsdlLocation = "http://localhost:8080/ws/arithmetic.wsdl")
public class ArithmeticPortService
    extends Service
{

    private final static URL ARITHMETICPORTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.gen.ArithmeticPortService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.gen.ArithmeticPortService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/ws/arithmetic.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/ws/arithmetic.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ARITHMETICPORTSERVICE_WSDL_LOCATION = url;
    }

    public ArithmeticPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ArithmeticPortService() {
        super(ARITHMETICPORTSERVICE_WSDL_LOCATION, new QName("http://spring.io/guides/gs-producing-web-service", "arithmeticPortService"));
    }

    /**
     * 
     * @return
     *     returns ArithmeticPort
     */
    @WebEndpoint(name = "arithmeticPortSoap11")
    public ArithmeticPort getArithmeticPortSoap11() {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "arithmeticPortSoap11"), ArithmeticPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ArithmeticPort
     */
    @WebEndpoint(name = "arithmeticPortSoap11")
    public ArithmeticPort getArithmeticPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://spring.io/guides/gs-producing-web-service", "arithmeticPortSoap11"), ArithmeticPort.class, features);
    }

}
