/**
 * @author Ruth Anaí de León Morataya
 */
public class Enemy extends Combatientes{

    private String printMessage;
    private specialHability hability;


    /**
     *
     * @return regresa una variable de tipo printMessage
     */
    public String getPrintMessage() {
        return printMessage;
    }

    /**
     *
     * @param printMessage imprimé un mensaje a través de la batalla
     */
    public void setPrintMessage(String printMessage) {
        this.printMessage = printMessage;
    }

    /**
     *
     * @return regresa una variable de tipo hability
     */
    public specialHability getHability() {
        return hability;
    }

    /**
     *
     * @param hability habilidad del Enemy
     */
    public void setHability(specialHability hability) {
        this.hability = hability;
    }
}
