import java.util.ArrayList;

public class Controller {

    static ArrayList<items> arrayItems = new ArrayList();
    static ArrayList<Enemy> arrayEnemy = new ArrayList();
    static ArrayList<Player> arrayPlayer = new ArrayList();

    static int numPlayer = 0;

    static int numEnemy = 0;

    static int numTurn = 1;

    static int k;

    public static void main(String[] args) {
        newEnemy();
        selectorItems();
        UI.UIPlayer();


        for(k = 0; k<50; k++){
            if ((arrayEnemy.get(numEnemy).getPointsLife()>0)&&(arrayPlayer.get(numPlayer).getPointsLife()>0)){
                if (k % 2 == 0){
                    turnoPlayer(arrayEnemy.get(numEnemy), arrayPlayer.get(numPlayer));
                }

                if(k % 2 != 0){
                    turnoEnemy(arrayEnemy.get(numEnemy), arrayPlayer.get(numPlayer));
                }
            }
            else {
                numEnemy++;
                UI.UIFirstBattle(numEnemy);

            }
        }







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

    public static void newEnemy(){
        Enemy gladiador = new Enemy();
        Enemy bloomer = new Enemy();
        EnemyBoss TheSupremacyBoss = new EnemyBoss();

        gladiador.setName("Gladiador");
        gladiador.setName("Tus huesos serían buenas herramientas para mis lanzas");
        gladiador.setPowerAttack(3);
        gladiador.setPointsLife(10);
        gladiador.setHability(new specialHability("Lanzas de fuego", 10, 3));

        bloomer.setName("Bloomer");
        bloomer.setName("Te encerraré en una burbuja hasta que te quedes sin aire");
        bloomer.setPowerAttack(2);
        bloomer.setPointsLife(15);
        bloomer.setHability(new specialHability("Burbujas venenosas", 15, 2));

        TheSupremacyBoss.setName("The Supremacy Boss");
        TheSupremacyBoss.setName("¡El líder de este mundo está aquí!");
        TheSupremacyBoss.setPowerAttack(1);
        TheSupremacyBoss.setPointsLife(19);
        TheSupremacyBoss.setHability(new specialHability("Cuchillo infernal", 19, 1));

        arrayEnemy.add(gladiador);
        arrayEnemy.add(bloomer);
        arrayEnemy.add(TheSupremacyBoss);

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