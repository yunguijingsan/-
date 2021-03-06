
package com.yadong.sia.server.webservices;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-05-03T08:12:57.043+08:00
 * Generated source version: 3.0.4
 * 
 */
public final class IpAddressSearchWebServiceHttpGet_IpAddressSearchWebServiceHttpGet_Client {

    private static final QName SERVICE_NAME = new QName("http://WebXml.com.cn/", "IpAddressSearchWebService");

    private IpAddressSearchWebServiceHttpGet_IpAddressSearchWebServiceHttpGet_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IpAddressSearchWebService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IpAddressSearchWebService ss = new IpAddressSearchWebService(wsdlURL, SERVICE_NAME);
        IpAddressSearchWebServiceHttpGet port = ss.getIpAddressSearchWebServiceHttpGet();  
        
        {
        System.out.println("Invoking getCountryCityByIp...");
        java.lang.String _getCountryCityByIp_theIpAddress = "";
        ArrayOfString _getCountryCityByIp__return = port.getCountryCityByIp(_getCountryCityByIp_theIpAddress);
        System.out.println("getCountryCityByIp.result=" + _getCountryCityByIp__return);


        }
        {
        System.out.println("Invoking getVersionTime...");
        java.lang.String _getVersionTime__return = port.getVersionTime();
        System.out.println("getVersionTime.result=" + _getVersionTime__return);


        }
        {
        System.out.println("Invoking getGeoIPContext...");
        ArrayOfString _getGeoIPContext__return = port.getGeoIPContext();
        System.out.println("getGeoIPContext.result=" + _getGeoIPContext__return);


        }

        System.exit(0);
    }

}
