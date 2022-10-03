/**
 * @author Ruth Anaí de León Morataya
 */
public class Enemy extends Combatientes{

    private String printMessage;
    private specialHability hability;


    /**
     *
     * @return
     */
    public String getPrintMessage() {
        return printMessage;
    }

    /**
     *
     * @param printMessage
     */
    public void setPrintMessage(String printMessage) {
        this.printMessage = printMessage;
    }

    /**
     *
     * @return
     */
    public specialHability getHability() {
        return hability;
    }

    /**
     *
     * @param hability
     */
    public void setHability(specialHability hability) {
        this.hability = hability;
    }
}
