/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operador;

import java.util.StringTokenizer;

/**
 *
 * @author rafael
 */
public class operar {
    
    public String add(String path){
    
        StringTokenizer tokens= new StringTokenizer(path,"/");
        int Result=0;
        
        while(tokens.hasMoreTokens()){
           int x= Integer.parseInt(tokens.nextToken());
           Result = x+Result;
   
        }
        
        return Result+"";
    }
    
    
    public String sub(String path){
        StringTokenizer tokens= new StringTokenizer(path,"/");
        int Result=0;
        
         while(tokens.hasMoreTokens()){
           int x= Integer.parseInt(tokens.nextToken());
           if(x>0){
           Result = x-Result;
           }else {
           Result = Result-x;
           }
      }
         return Result+"";
    
    }
    
    
    public String mult(String path){
        StringTokenizer tokens= new StringTokenizer(path,"/");
        float Result=1;
        
        while(tokens.hasMoreTokens()){
           int x= Integer.parseInt(tokens.nextToken());
           Result = x*Result;
        }
   
        return Result+"";
    }
    public String div(String path){
        StringTokenizer tokens= new StringTokenizer(path,"/");
        float Result=1;
        
        while(tokens.hasMoreTokens()){
           int x= Integer.parseInt(tokens.nextToken());
           Result = x/Result;
   
        }
        
        return Result+"";
    }
    
}
