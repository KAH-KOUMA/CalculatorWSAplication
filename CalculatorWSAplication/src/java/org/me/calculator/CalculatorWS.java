/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Muhamedhine
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod (operationName = "addition" )
    public int addition(@WebParam(name = "e1") int a,@WebParam(name = "e2") int b){
        return a+b;
    }
    @WebMethod (operationName = "soustration" )
    public int soustration(@WebParam(name = "e1") int a,@WebParam(name = "e2") int b){
        return a-b;
    }
    
    @WebMethod (operationName = "Moyenne" )
    public float Moyenne (@WebParam(name = "e1") float a,@WebParam(name = "e2") float b, @WebParam(name = "e3") float c ) {
        return (a+(2*b)+c)/4;
    }
    
}
