import java.util.ArrayList;

public class Controller {

    static ArrayList<items> arrayItems = new ArrayList();

    public static void main(String[] args) {

    }
    public static void newPlayer(String name, String type){
        if(type.equalsIgnoreCase("guerrero")){
            Warrior warrior = new Warrior();
            warrior.setName(name);
            warrior.setPointsLife(20);
            warrior.setPowerAttack(5);
        }

        if(type.equalsIgnoreCase("explorador")){

        }

    }

    public static ArrayList selectorItems (){
        items cajaExplosiva = new items();
        cajaExplosiva.setName("Caja explosiva");
        cajaExplosiva.setAttack(5);
        cajaExplosiva.setMoreLife(0);

        items autoGenerador = new items();
        autoGenerador.setName("Autogenerador de puntos");
        autoGenerador.setAttack(0);
        autoGenerador.setMoreLife(3);

        items turnoDoble = new items();
        turnoDoble.setName("Turno doble");
        turnoDoble.setAttack(2);
        turnoDoble.setMoreLife(1);




        return arrayItems;

    }

}