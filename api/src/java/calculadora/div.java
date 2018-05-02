/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.StringTokenizer;
import  Operador.operar;
/**
 *
 * @author rafael
 */
@Path("div")
public class div {

   
     

    @GET @Path("{path:.*}")
    @Produces({"text/html"})
    public String operar(@PathParam("path") String path){
    
        StringTokenizer tokens= new StringTokenizer(path,"/");
        operar o= new operar();
        String resp=o.div(path);
        return resp;
    }
    
}
