
package xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadialBasisFunctionNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadialBasisFunctionNetwork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hiddenNeurons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="outputLayerActivation">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Linear"/>
 *               &lt;enumeration value="Ramp"/>
 *               &lt;enumeration value="Step"/>
 *               &lt;enumeration value="Sigmoid"/>
 *               &lt;enumeration value="Tanh"/>
 *               &lt;enumeration value="Gaussian"/>
 *               &lt;enumeration value="Trapezoid"/>
 *               &lt;enumeration value="Sgn"/>
 *               &lt;enumeration value="Sin"/>
 *               &lt;enumeration value="Log"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="momentum" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="epochs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="learningRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadialBasisFunctionNetwork", propOrder = {
    "hiddenNeurons",
    "outputLayerActivation",
    "momentum",
    "epochs",
    "learningRate"
})
public class RadialBasisFunctionNetwork {

    protected int hiddenNeurons;
    @XmlElement(required = true)
    protected String outputLayerActivation;
    @XmlElement(required = true)
    protected BigDecimal momentum;
    protected int epochs;
    @XmlElement(required = true)
    protected BigDecimal learningRate;

    /**
     * Gets the value of the hiddenNeurons property.
     * 
     */
    public int getHiddenNeurons() {
        return hiddenNeurons;
    }

    /**
     * Sets the value of the hiddenNeurons property.
     * 
     */
    public void setHiddenNeurons(int value) {
        this.hiddenNeurons = value;
    }

    /**
     * Gets the value of the outputLayerActivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputLayerActivation() {
        return outputLayerActivation;
    }

    /**
     * Sets the value of the outputLayerActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputLayerActivation(String value) {
        this.outputLayerActivation = value;
    }

    /**
     * Gets the value of the momentum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMomentum() {
        return momentum;
    }

    /**
     * Sets the value of the momentum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMomentum(BigDecimal value) {
        this.momentum = value;
    }

    /**
     * Gets the value of the epochs property.
     * 
     */
    public int getEpochs() {
        return epochs;
    }

    /**
     * Sets the value of the epochs property.
     * 
     */
    public void setEpochs(int value) {
        this.epochs = value;
    }

    /**
     * Gets the value of the learningRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLearningRate() {
        return learningRate;
    }

    /**
     * Sets the value of the learningRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLearningRate(BigDecimal value) {
        this.learningRate = value;
    }

}
