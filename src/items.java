/**
 * @author Ruth Anaí de León Morataya
 */
public class items {

    private String name;
    private int moreLife;
    private int attack;

    /**
     * regreesa una variable de tipo name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name nombre de las habilidades para el player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * regresa una variable de tipo moreLife
     * @return
     */
    public int getMoreLife() {
        return moreLife;
    }

    /**
     * @param moreLife vidas extras que se les dará al Player
     */
    public void setMoreLife(int moreLife) {
        this.moreLife = moreLife;
    }

    /**
     * @return regresa una variable de tipo attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     *
     * @param attack ataque manejado por el Player
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }
}
