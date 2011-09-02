/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.tempuri;

import java.io.*;
import java.net.InetAddress;
import org.datacontract.schemas._2004._07.echosvclib.StatisticInfo;

import com.microsoft.hpc.scheduler.session.DataClient;
import com.microsoft.hpc.scheduler.session.servicecontext.ServiceContext;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.3.3 2011-03-11T14:28:00.191+08:00
 * Generated source version: 2.3.3
 * 
 */

@javax.jws.WebService(
        serviceName = "EchoSvc",
        portName = "DefaultBinding_IEchoSvc",
        targetNamespace = "http://tempuri.org/",
        wsdlLocation = "file:tempuri.org.wsdl",
        endpointInterface = "org.tempuri.IEchoSvc")
public class IEchoSvcImpl implements IEchoSvc
{
    private static final int BufferSize = 64000;
    private static final Logger LOG = Logger.getLogger(IEchoSvcImpl.class.getName());

    /*
     * (non-Javadoc)
     * 
     * @see org.tempuri.IEchoSvc#echoData(java.lang.String dataClientId )*
     */
    public java.lang.Integer echoData(java.lang.String dataClientId)
    {
        ServiceContext.Logger.traceEvent(Level.INFO, "Executing operation echoData");
        ServiceContext.Logger.traceEvent(Level.ALL, dataClientId);
        try
        {
            DataClient client = ServiceContext.getDataClient(dataClientId);
            byte[] data = client.readRawBytesAll();
            return data.length;
        } catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tempuri.IEchoSvc#generateLoad(java.lang.Double runMilliSeconds
     * ,)byte[] dummyData ,)java.lang.String fileData )*
     */
    public StatisticInfo generateLoad(java.lang.Double runMilliSeconds, byte[] dummyData,
            java.lang.String fileData)
    {
        ServiceContext.Logger.traceEvent(Level.INFO, "Executing operation generateLoad");
        ServiceContext.Logger.traceEvent(Level.ALL, runMilliSeconds.toString());
        try
        {
            StatisticInfo info = new StatisticInfo();

            // Set start time to now.
            info.setStartTime(Utility.getXMLCurrentTime());

            if (!Utility.isNullOrEmpty(fileData))
            {
                byte[] buffer = new byte[BufferSize];
                int readed;
                InputStream file;
                try
                {
                    file = new FileInputStream(new File(fileData));
                }
                catch (FileNotFoundException e)
                {
                    throw new Exception("File not found", e);
                }

                do
                {
                    readed = file.read(buffer, 0, BufferSize);
                } while (readed != BufferSize);

                file.close();
            }

            GregorianCalendar target = new GregorianCalendar();
            target.add(GregorianCalendar.MILLISECOND, runMilliSeconds.intValue());
            String dummy = System.getenv("CCP_TASKINSTANCEID");
            if (!Utility.isNullOrEmpty(dummy)) {
                try {
                    info.setTaskId(Integer.parseInt(dummy));
                } catch (NumberFormatException e) {
                    // taskid to default (0)
                    info.setTaskId(0);
                }
            }
            
            while (GregorianCalendar.getInstance().before(target))
            {
                // busy wait
            }
            
            info.setEndTime(Utility.getXMLCurrentTime());

            return info;
        } catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.tempuri.IEchoSvc#echo(java.lang.String input )*
     */
    public java.lang.String echo(java.lang.String input)
    {
        ServiceContext.Logger.traceEvent(Level.INFO, "Executing operation echo");
        ServiceContext.Logger.traceEvent(Level.ALL, input);
        try
        {
            String computername = InetAddress.getLocalHost().getHostName();
            return computername + ":" + input;
        } catch (java.lang.Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}