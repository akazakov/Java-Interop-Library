
package com.microsoft.hpc.soadiagservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-01T14:39:07.709+08:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "SessionFault", targetNamespace = "http://hpc.microsoft.com/session/")
public class ISoaDiagServiceQueryForRequestSessionFaultFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20120801143907L;
    
    private com.microsoft.hpc.session.SessionFault sessionFault;

    public ISoaDiagServiceQueryForRequestSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ISoaDiagServiceQueryForRequestSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ISoaDiagServiceQueryForRequestSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ISoaDiagServiceQueryForRequestSessionFaultFaultFaultMessage(String message, com.microsoft.hpc.session.SessionFault sessionFault) {
        super(message);
        this.sessionFault = sessionFault;
    }

    public ISoaDiagServiceQueryForRequestSessionFaultFaultFaultMessage(String message, com.microsoft.hpc.session.SessionFault sessionFault, Throwable cause) {
        super(message, cause);
        this.sessionFault = sessionFault;
    }

    public com.microsoft.hpc.session.SessionFault getFaultInfo() {
        return this.sessionFault;
    }
}
