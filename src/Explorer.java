/**
 * @author Ruth Anaí de León Morataya
 */

/**
 * Esta clase hereda las características de la clase Player
 */
public class Explorer extends Player{


    items items2;

    /**
     * @return regresa un items 2 de la clase items
     */
    public items getItems2() {
        return items2;
    }

    /**
     * @param items2 define la clase items en la clase Explorer para otorgarle las habilidades al Player
     */
    public void setItems2(items items2) {
        this.items2 = items2;
    }
}
