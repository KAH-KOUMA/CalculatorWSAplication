
package org.me.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://calculator.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param e1
     * @param e2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addition", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.AdditionResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/additionRequest", output = "http://calculator.me.org/CalculatorWS/additionResponse")
    public int addition(
        @WebParam(name = "e1", targetNamespace = "")
        int e1,
        @WebParam(name = "e2", targetNamespace = "")
        int e2);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.HelloResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/helloRequest", output = "http://calculator.me.org/CalculatorWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param e1
     * @param e2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "soustration", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Soustration")
    @ResponseWrapper(localName = "soustrationResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.SoustrationResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/soustrationRequest", output = "http://calculator.me.org/CalculatorWS/soustrationResponse")
    public int soustration(
        @WebParam(name = "e1", targetNamespace = "")
        int e1,
        @WebParam(name = "e2", targetNamespace = "")
        int e2);

    /**
     * 
     * @param e1
     * @param e2
     * @param e3
     * @return
     *     returns float
     */
    @WebMethod(operationName = "Moyenne")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Moyenne", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Moyenne")
    @ResponseWrapper(localName = "MoyenneResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.MoyenneResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/MoyenneRequest", output = "http://calculator.me.org/CalculatorWS/MoyenneResponse")
    public float moyenne(
        @WebParam(name = "e1", targetNamespace = "")
        float e1,
        @WebParam(name = "e2", targetNamespace = "")
        float e2,
        @WebParam(name = "e3", targetNamespace = "")
        float e3);

}
