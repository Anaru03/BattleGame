/**
 * @author Ruth Anaí de León Morataya
 */
public class specialHability {

    private String name;
    private int cure;
    private int damageLife;


    /**
     * @param name nombre de la habilidad especial escogida por el Player
     * @param cure número de curación en los puntos de los jugadores
     * @param damageLife número de daño en los puntos de los jugadores
     */
    public specialHability (String name, int cure, int damageLife){
        this.name = name;
        this.cure = cure;
        this.damageLife = damageLife;

    }

    /**
     * @return regresa una variable de tipo name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name nombre de la variable especial
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return regresa una variable de tipo cure
     */
    public int getCure() {
        return cure;
    }

    /**
     * @param cure número de curación por la habilidad especial
     */
    public void setCure(int cure) {
        this.cure = cure;
    }

    /**
     *
     * @return regresa una variable de tipo damageLife
     */
    public int getDamageLife() {
        return damageLife;
    }

    /**
     *
     * @param damageLife número de daño ocasionado por la habilidad especial
     */
    public void setDamageLife(int damageLife) {
        this.damageLife = damageLife;
    }
}
