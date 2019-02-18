
package org.me.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="e1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="e2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addition", propOrder = {
    "e1",
    "e2"
})
public class Addition {

    protected int e1;
    protected int e2;

    /**
     * Obtient la valeur de la propriété e1.
     * 
     */
    public int getE1() {
        return e1;
    }

    /**
     * Définit la valeur de la propriété e1.
     * 
     */
    public void setE1(int value) {
        this.e1 = value;
    }

    /**
     * Obtient la valeur de la propriété e2.
     * 
     */
    public int getE2() {
        return e2;
    }

    /**
     * Définit la valeur de la propriété e2.
     * 
     */
    public void setE2(int value) {
        this.e2 = value;
    }

}
