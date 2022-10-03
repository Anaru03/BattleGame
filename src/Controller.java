/**
 * @author Ruth Anaí de León Morataya
 */

import javax.swing.plaf.PanelUI;

import java.util.ArrayList;

public class Controller {


    static ArrayList<items> arrayItems = new ArrayList();
    static ArrayList<Enemy> arrayEnemy = new ArrayList();
    static ArrayList<Player> arrayPlayer = new ArrayList();


    static int numPlayer = 0;

    static int numEnemy = 0;

    static int numTurn = 1;

    static int k;

    /**
     * @param args clase Main que tiene desarrollo en los turnos de los participantes
     */
    public static void main(String[] args) {
        newEnemy();
        selectorItems();
        UI.UIPlayer();


        for(k = 0; k<50; k++){
            if ((arrayEnemy.get(numEnemy).getPointsLife()>0)&&(arrayPlayer.get(numPlayer).getPointsLife()>0)){
                if (k % 2 == 0){
                    UIturnoPlayer(arrayEnemy.get(numEnemy), arrayPlayer.get(numPlayer));
                }

                if(k % 2 != 0){
                    UIturnoEnemy(arrayEnemy.get(numEnemy), arrayPlayer.get(numPlayer));
                }
            }
            else {
                numEnemy++;
                UI.UIFirstBattle(numEnemy);

            }
        }
    }

    /**
     * La clase newPlayer hace las acciones del jugador, y muestra los puntos de vida y ataque que tiene
     * Tiene la capacidad de elegir entre los dos tipos de juagdores que hay: guerrero o explorador
     * @param name nombre del jugador
     * @param type tipo de juagados: guerrero o explorador
     * @param itemDelUsuario habilidades desarrolladas del jugador
     */
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

    /**
     *La clase newEnemy divide los tipos de enemigos que hay; gladiador, bloomer y EnemyBoss.
     * Realiza las acciones según el tipo de enemigo escogido al azar
     * Cada enemigo posee su cantidad de vida y daño
     */
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

    /**
     *Se genera la clase de UIturnoPlayer para otorgar la oportunidad de turnos en el jugador
     * @param enemy enemigo usado para que tenga su turno
     * @param player jugador usado para que tenga su turno
     */
    public static void UIturnoPlayer(Enemy enemy, Player player){
        int battle = UI.UIturnoPlayer(player);
        if(battle == 1){
            enemy.setPointsLife(enemy.getPointsLife()-player.getPowerAttack());
        }
        else{
            enemy.setPointsLife(enemy.getPointsLife()-player.getHabilidades().getAttack());
            player.setPointsLife(player.getPointsLife()-player.getHabilidades().getMoreLife());
            if(player.getHabilidades().getName().equals("Turno doble")){
                k ++;
                numTurn++;
            }
        }
        UI.typeOfState(enemy);
    }

    /**
     *Se genera la clase de UIturnoEnemy para otorgar la oportunidad de turnos en el enemigo del jugador
     * @param enemy enemigo usado para que tenga su turno
     * @param player jugador usado para que tenga su turno
     */
    public static void UIturnoEnemy(Enemy enemy, Player player){
        UI.UIturnoEnemy(numTurn, enemy);
        if (numTurn% 5 == 0){
            player.setPointsLife(player.getPointsLife() - enemy.getHability().getDamageLife());
            enemy.setPointsLife(enemy.getPointsLife() + enemy.getHability().getCure());
        }
        else{
            player.setPointsLife(player.getPointsLife() - enemy.getPowerAttack());
        }
        UI.typeOfState(player);

        numTurn++;
    }


    /**
     *Se desarrolla la clase con el fin de generar los Items que podrá escoger el jugador
     * Se proyectará una lista de tres opcciones con sus respectivas careterísticas para que el jugador conozca sus ventajas y desventajas.
     * @return regresará un ArrayList de tipo items
     */
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