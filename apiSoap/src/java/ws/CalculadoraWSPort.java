/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author rafael
 */
@Path("calculadorawsport")
public class CalculadoraWSPort {

    private ws_client.CalculadoraWS port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculadoraWSPort
     */
    public CalculadoraWSPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method hello
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("hello/")
    public String getHello(@QueryParam("name") String name) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.hello(name);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method sumar
     * @param a resource URI parameter
     * @param b resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("sumar/")
    public String getSumar(@QueryParam("a")
            @DefaultValue("0") int a, @QueryParam("b")
            @DefaultValue("0") int b) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.sumar(a, b);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method restar
     * @param a resource URI parameter
     * @param b resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("restar/")
    public String getRestar(@QueryParam("a")
            @DefaultValue("0") int a, @QueryParam("b")
            @DefaultValue("0") int b) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.restar(a, b);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private ws_client.CalculadoraWS getPort() {
        try {
            // Call Web Service Operation
            ws_client.CalculadoraWS_Service service = new ws_client.CalculadoraWS_Service();
            ws_client.CalculadoraWS p = service.getCalculadoraWSPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
