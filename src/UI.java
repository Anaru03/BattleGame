/**
 * @author Ruth Anaí de León Morataya
 */
import com.sun.tools.javac.Main;

import java.util.Scanner;


public class UI {

    /**
     *Clase llaamda lector que permite obtener la entrada de datos primitivos.
     */
    static Scanner lector = new Scanner(System.in);


    /**
     *Se desarrolla la clase UIPlayer para conocer los datos del jugador como: nombre, tipo de juador (explorador o guerrero)
     * Se concatenaron dos entradas para descrbir al player las funciones de las habilidades de los ítems
     */
    public static void UIPlayer() {
        System.out.println("Ingrese su nombre");
        String name;

        name = lector.next();


        System.out.println(name + " "  + "¿Deseas ser ser guerrero, explorador o cazador?");
        String type;

        type = lector.next();


        for (int i = 0; i < Controller.arrayItems.size(); i++) {
            System.out.println("No. " + i);
            System.out.println("Nombre: " + Controller.arrayItems.get(i).getName());
            System.out.println("Ataque: " + Controller.arrayItems.get(i).getAttack());
            System.out.println("Más vidas: " + Controller.arrayItems.get(i).getMoreLife());
        }
        System.out.println("Ingrese el ítems que desea ejecutar");


        int itemDelUsuario;
        itemDelUsuario = lector.nextInt();
        Controller.newPlayer(name, type, itemDelUsuario);

    }


    /**
     *Se da el inicio de la batalla y se le comunica al Player su tipo de rival.
     * @param numEnemy manda a llamar a la clase Contrller para iniciar desde 0
     */
    public static void UIFirstBattle(int numEnemy){
        System.out.println(" -_- START THE BATTLE -_- ");
        System.out.println("Tendrás el honor de pelear con... ");
        System.out.println(Controller.arrayEnemy.get(numEnemy).getName());
        System.out.println("Tu enemigo te desea comunicar que:  = " + Controller.arrayEnemy.get(numEnemy).getPrintMessage());
    }

    /**
     *En esta clase de desarrolla la oportunidad de que el Player juegue
     * @param player turno del jugador en la batalla
     * @return regresa un tipo de variable battle.
     */
    public static int UIturnoPlayer(Player player){
        System.out.println(" -_- Es tu turno Player -_- ");
        System.out.println("Escriba el no. de la opcción seleccioanda");
        System.out.println("1 Hacer uso de la habilidad especial \n2 Atacar al oponente" );
        int battle = lector.nextInt();
        if(battle == 1){
            System.out.println("The Player: " + " " +  player.getName() + " " + "invocó el ataque, ocasioanando: " + player.getPowerAttack() + " " + "puntos de daño");
        }
        else {
            System.out.println("The Player" + " " + player.getName() + " " + "ha invocando su ítem: " + player.getHabilidades().getName() + " " +  ", ocasioanado: ");
            System.out.println("Un daño de: " + player.getHabilidades().getAttack());
            System.out.println("Una curación de: " + player.getHabilidades().getMoreLife());
        }

        return battle;
    }


    /**
     * *En esta clase de desarrolla la oportunidad de que el Enemy juegue
     * @param numTurn número de turno del Enemy en la batalla
     * @param enemy acciones del enemy degún su tipo de habilidad
     */
    public static void UIturnoEnemy(int numTurn, Enemy enemy){
        System.out.println(" B) Es el turno de tu enemigo B) ");
        if (numTurn% 5 == 0){
            System.out.println("Hoy si vas a valer");
            System.out.println("Tu enemigo: " + enemy.getName() + "usará la super habilidad: " + enemy.getHability().getName() + "Así que producirá: ");
            System.out.println("Daño ocasioando: " + enemy.getHability().getDamageLife());
            System.out.println("Curación: " + enemy.getPowerAttack());
            System.out.println("La suerte ya no esta contigo :)");
        }
        else {
            System.out.println("Tu enemigo: " + enemy.getName() + " " +  "te ha golpeado");
            System.out.println("Daño ocasioando: " + enemy.getPowerAttack());
        }
    }

    /**
     *Clase que muestra el tipo de estado en el que se encuentre los combatienes
     * @param combatientes estado del combatiente
     */
    public static void typeOfState(Combatientes combatientes){
        System.out.println("El combatiente: " + combatientes.getName() + " " + "obtiene: ");
        System.out.println("Vida: " + combatientes.getPointsLife());
    }
}




