
package org.me.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Moyenne complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Moyenne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="e1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="e2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="e3" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Moyenne", propOrder = {
    "e1",
    "e2",
    "e3"
})
public class Moyenne {

    protected float e1;
    protected float e2;
    protected float e3;

    /**
     * Obtient la valeur de la propriété e1.
     * 
     */
    public float getE1() {
        return e1;
    }

    /**
     * Définit la valeur de la propriété e1.
     * 
     */
    public void setE1(float value) {
        this.e1 = value;
    }

    /**
     * Obtient la valeur de la propriété e2.
     * 
     */
    public float getE2() {
        return e2;
    }

    /**
     * Définit la valeur de la propriété e2.
     * 
     */
    public void setE2(float value) {
        this.e2 = value;
    }

    /**
     * Obtient la valeur de la propriété e3.
     * 
     */
    public float getE3() {
        return e3;
    }

    /**
     * Définit la valeur de la propriété e3.
     * 
     */
    public void setE3(float value) {
        this.e3 = value;
    }

}
