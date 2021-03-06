
package org.tempuri;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-09-18T10:11:49.003+08:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "OutOfMemoryException", targetNamespace = "http://schemas.datacontract.org/2004/07/System")
public class ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20120918101149L;
    
    private org.datacontract.schemas._2004._07.system.OutOfMemoryException outOfMemoryException;

    public ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage() {
        super();
    }
    
    public ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.system.OutOfMemoryException outOfMemoryException) {
        super(message);
        this.outOfMemoryException = outOfMemoryException;
    }

    public ITestServiceTraceOutOfMemoryExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.system.OutOfMemoryException outOfMemoryException, Throwable cause) {
        super(message, cause);
        this.outOfMemoryException = outOfMemoryException;
    }

    public org.datacontract.schemas._2004._07.system.OutOfMemoryException getFaultInfo() {
        return this.outOfMemoryException;
    }
}
