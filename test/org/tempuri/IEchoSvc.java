package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Tue Dec 28 11:00:17 GMT+08:00 2010
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://tempuri.org/", name = "IEchoSvc")
public interface IEchoSvc {

    @WebResult(name = "GenerateLoadResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IEchoSvc/GenerateLoad", output = "http://tempuri.org/IEchoSvc/GenerateLoadResponse")
    @RequestWrapper(localName = "GenerateLoad", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoad")
    @WebMethod(operationName = "GenerateLoad", action = "http://tempuri.org/IEchoSvc/GenerateLoad")
    @ResponseWrapper(localName = "GenerateLoadResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GenerateLoadResponse")
    public StatisticInfo generateLoad(
        @WebParam(name = "runMilliSeconds", targetNamespace = "http://tempuri.org/")
        java.lang.Double runMilliSeconds,
        @WebParam(name = "dummyData", targetNamespace = "http://tempuri.org/")
        byte[] dummyData,
        @WebParam(name = "fileData", targetNamespace = "http://tempuri.org/")
        java.lang.String fileData
    );

    @WebResult(name = "EchoResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IEchoSvc/Echo", output = "http://tempuri.org/IEchoSvc/EchoResponse")
    @RequestWrapper(localName = "Echo", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Echo")
    @WebMethod(operationName = "Echo", action = "http://tempuri.org/IEchoSvc/Echo")
    @ResponseWrapper(localName = "EchoResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EchoResponse")
    public java.lang.String echo(
        @WebParam(name = "input", targetNamespace = "http://tempuri.org/")
        java.lang.String input
    );
}