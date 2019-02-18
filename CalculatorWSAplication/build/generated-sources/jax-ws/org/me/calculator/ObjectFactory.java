
package org.me.calculator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.calculator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Addition_QNAME = new QName("http://calculator.me.org/", "addition");
    private final static QName _MoyenneResponse_QNAME = new QName("http://calculator.me.org/", "MoyenneResponse");
    private final static QName _Hello_QNAME = new QName("http://calculator.me.org/", "hello");
    private final static QName _SoustrationResponse_QNAME = new QName("http://calculator.me.org/", "soustrationResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://calculator.me.org/", "helloResponse");
    private final static QName _Soustration_QNAME = new QName("http://calculator.me.org/", "soustration");
    private final static QName _Moyenne_QNAME = new QName("http://calculator.me.org/", "Moyenne");
    private final static QName _AdditionResponse_QNAME = new QName("http://calculator.me.org/", "additionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.calculator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Moyenne }
     * 
     */
    public Moyenne createMoyenne() {
        return new Moyenne();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Soustration }
     * 
     */
    public Soustration createSoustration() {
        return new Soustration();
    }

    /**
     * Create an instance of {@link SoustrationResponse }
     * 
     */
    public SoustrationResponse createSoustrationResponse() {
        return new SoustrationResponse();
    }

    /**
     * Create an instance of {@link MoyenneResponse }
     * 
     */
    public MoyenneResponse createMoyenneResponse() {
        return new MoyenneResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoyenneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "MoyenneResponse")
    public JAXBElement<MoyenneResponse> createMoyenneResponse(MoyenneResponse value) {
        return new JAXBElement<MoyenneResponse>(_MoyenneResponse_QNAME, MoyenneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "soustrationResponse")
    public JAXBElement<SoustrationResponse> createSoustrationResponse(SoustrationResponse value) {
        return new JAXBElement<SoustrationResponse>(_SoustrationResponse_QNAME, SoustrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "soustration")
    public JAXBElement<Soustration> createSoustration(Soustration value) {
        return new JAXBElement<Soustration>(_Soustration_QNAME, Soustration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Moyenne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "Moyenne")
    public JAXBElement<Moyenne> createMoyenne(Moyenne value) {
        return new JAXBElement<Moyenne>(_Moyenne_QNAME, Moyenne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculator.me.org/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

}
