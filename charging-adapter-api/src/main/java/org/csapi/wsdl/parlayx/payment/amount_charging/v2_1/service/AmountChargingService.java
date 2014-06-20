package org.csapi.wsdl.parlayx.payment.amount_charging.v2_1.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import org.csapi.wsdl.parlayx.payment.amount_charging.v2_1._interface.AmountCharging;

/**
 * This class was generated by Apache CXF 2.6.0.redhat-60024
 * 2014-03-19T15:42:31.058+07:00
 * Generated source version: 2.6.0.redhat-60024
 * 
 */
@WebServiceClient(name = "AmountChargingService", 
                  wsdlLocation = "file:/C:/git-sef-ws/SMFramework/sm-apis/charging-adapter-api/src/main/resources/charging-adapter-api/wsdl/parlayx_payment_amount_charging_service_2_1.wsdl",
                  targetNamespace = "http://www.csapi.org/wsdl/parlayx/payment/amount_charging/v2_1/service") 
public class AmountChargingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.csapi.org/wsdl/parlayx/payment/amount_charging/v2_1/service", "AmountChargingService");
    public final static QName AmountCharging = new QName("http://www.csapi.org/wsdl/parlayx/payment/amount_charging/v2_1/service", "AmountCharging");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/git-sef-ws/SMFramework/sm-apis/charging-adapter-api/src/main/resources/charging-adapter-api/wsdl/parlayx_payment_amount_charging_service_2_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AmountChargingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/git-sef-ws/SMFramework/sm-apis/charging-adapter-api/src/main/resources/charging-adapter-api/wsdl/parlayx_payment_amount_charging_service_2_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AmountChargingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AmountChargingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AmountChargingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AmountCharging
     */
    @WebEndpoint(name = "AmountCharging")
    public AmountCharging getAmountCharging() {
        return super.getPort(AmountCharging, AmountCharging.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AmountCharging
     */
    @WebEndpoint(name = "AmountCharging")
    public AmountCharging getAmountCharging(WebServiceFeature... features) {
        return super.getPort(AmountCharging, AmountCharging.class, features);
    }

}
