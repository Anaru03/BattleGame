public class specialHability {

    private String name;
    private int cure;
    private int damageLife;


    public specialHability (String name, int cure, int damageLife){
        this.name = name;
        this.cure = cure;
        this.damageLife = damageLife;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCure() {
        return cure;
    }

    public void setCure(int cure) {
        this.cure = cure;
    }

    public int getDamageLife() {
        return damageLife;
    }

    public void setDamageLife(int damageLife) {
        this.damageLife = damageLife;
    }
}
