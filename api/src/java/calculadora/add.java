/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Operador.operar;
import java.util.StringTokenizer;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author rafael
 */
@Path("add")
public class add {
    
    @GET @Path("{path:.*}")
    @Produces({"text/html"})
    public String operar(@PathParam("path") String path){
    
        StringTokenizer tokens= new StringTokenizer(path,"/");
        operar o= new operar();
        String resp=o.add(path);
        return resp;
    }
   
}
