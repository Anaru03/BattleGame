import java.util.ArrayList;

public class Controller {

    static ArrayList<items> arrayItems = new ArrayList();
    static ArrayList<Enemy> arrayEnemy = new ArrayList();
    static ArrayList<Player> arrayPlayer = new ArrayList();


    public static void main(String[] args) {
        selectorItems();
        UI.UIPlayer();

    }
    public static void newPlayer(String name, String type, int itemDelUsuario){
        if(type.equalsIgnoreCase("guerrero")){
            Warrior warrior = new Warrior();
            warrior.setName(name);
            warrior.setPointsLife(20);
            warrior.setPowerAttack(5);
            warrior.setHabilidades(arrayItems.get(itemDelUsuario));
            arrayPlayer.add(warrior);


        }

        if(type.equalsIgnoreCase("explorador")){
            Explorer explorer = new Explorer();
            explorer. setName(name);
            explorer.setPointsLife(10);
            explorer.setPowerAttack(5);
            explorer.setHabilidades(arrayItems.get(itemDelUsuario));
            arrayPlayer.add(explorer);

        }

    }

    public static ArrayList selectorItems (){
        items cajaExplosiva = new items();
        cajaExplosiva.setName("Caja explosiva");
        cajaExplosiva.setAttack(5);
        cajaExplosiva.setMoreLife(0);
        arrayItems.add(cajaExplosiva);


        items autoGenerador = new items();
        autoGenerador.setName("Autogenerador de puntos");
        autoGenerador.setAttack(0);
        autoGenerador.setMoreLife(3);
        arrayItems.add(autoGenerador);

        items turnoDoble = new items();
        turnoDoble.setName("Turno doble");
        turnoDoble.setAttack(2);
        turnoDoble.setMoreLife(1);
        arrayItems.add(turnoDoble);


        return arrayItems;


    }



}