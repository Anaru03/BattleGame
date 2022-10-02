public class specialHability {

    private String name;
    private int cure;
    private int damageLife;


    /**
     *
     * @param name
     * @param cure
     * @param damageLife
     */
    public specialHability (String name, int cure, int damageLife){
        this.name = name;
        this.cure = cure;
        this.damageLife = damageLife;

    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getCure() {
        return cure;
    }

    /**
     *
     * @param cure
     */
    public void setCure(int cure) {
        this.cure = cure;
    }

    /**
     *
     * @return
     */
    public int getDamageLife() {
        return damageLife;
    }

    /**
     *
     * @param damageLife
     */
    public void setDamageLife(int damageLife) {
        this.damageLife = damageLife;
    }
}
