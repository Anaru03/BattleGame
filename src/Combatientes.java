public class Combatientes {

    private String name;
    private int pointsLife;
    private int powerAttack;
    private items habilidades;

    /**
     * @return regresa una variable de tipo name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name nombre del combatiente
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return regresa una variable de tipo pointsLife
     */
    public int getPointsLife() {
        return pointsLife;
    }

    /**
     *
     * @param pointsLife número de puntos de vida de los combatientes
     */
    public void setPointsLife(int pointsLife) {
        this.pointsLife = pointsLife;
    }

    /**
     *
     * @return regresa una variable de tipo powerAttack
     */
    public int getPowerAttack() {
        return powerAttack;
    }

    /**
     *
     * @param powerAttack número de ataque en los combatientes
     */
    public void setPowerAttack(int powerAttack) {
        this.powerAttack = powerAttack;
    }

    /**
     *
     * @return regresa una variable de tipo habilidades
     */
    public items getHabilidades() {
        return habilidades;
    }

    /**
     *
     * @param habilidades habilidades de los combatientes
     */
    public void setHabilidades(items habilidades) {
        this.habilidades = habilidades;
    }
}
