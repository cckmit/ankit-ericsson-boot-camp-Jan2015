package org.csapi.wsdl.parlayx.payment.reserve_amount_charging.v2_1.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;
import org.csapi.wsdl.parlayx.payment.reserve_amount_charging.v2_1._interface.ReserveAmountCharging;

/**
 * This class was generated by Apache CXF 2.6.0.redhat-60024
 * 2014-03-19T15:42:32.270+07:00
 * Generated source version: 2.6.0.redhat-60024
 * 
 */
@WebServiceClient(name = "ReserveAmountChargingService", 
                  wsdlLocation = "file:/C:/git-sef-ws/SMFramework/sm-apis/charging-adapter-api/src/main/resources/charging-adapter-api/wsdl/parlayx_payment_reserve_amount_charging_service_2_1.wsdl",
                  targetNamespace = "http://www.csapi.org/wsdl/parlayx/payment/reserve_amount_charging/v2_1/service") 
public class ReserveAmountChargingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.csapi.org/wsdl/parlayx/payment/reserve_amount_charging/v2_1/service", "ReserveAmountChargingService");
    public final static QName ReserveAmountCharging = new QName("http://www.csapi.org/wsdl/parlayx/payment/reserve_amount_charging/v2_1/service", "ReserveAmountCharging");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/git-sef-ws/SMFramework/sm-apis/charging-adapter-api/src/main/resources/charging-adapter-api/wsdl/parlayx_payment_reserve_amount_charging_service_2_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReserveAmountChargingService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/git-sef-ws/SMFramework/sm-apis/charging-adapter-api/src/main/resources/charging-adapter-api/wsdl/parlayx_payment_reserve_amount_charging_service_2_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReserveAmountChargingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReserveAmountChargingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReserveAmountChargingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns ReserveAmountCharging
     */
    @WebEndpoint(name = "ReserveAmountCharging")
    public ReserveAmountCharging getReserveAmountCharging() {
        return super.getPort(ReserveAmountCharging, ReserveAmountCharging.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReserveAmountCharging
     */
    @WebEndpoint(name = "ReserveAmountCharging")
    public ReserveAmountCharging getReserveAmountCharging(WebServiceFeature... features) {
        return super.getPort(ReserveAmountCharging, ReserveAmountCharging.class, features);
    }

}