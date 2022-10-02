import com.sun.tools.javac.Main;

import java.util.Scanner;

public class UI {
static Scanner lector = new Scanner(System.in);
    public static void UIPlayer() {
        System.out.println("Ingrese su nombre");
        String name;

        name = lector.next();


        System.out.println(name + " "  + "¿Deseas ser ser guerrero o explorador?");
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

    public static void UIFirstBattle(int numEnemy){
        System.out.println(" -_- START THE BATTLE -_- ");
        System.out.println("Tendrás el honor de pelear con... ");
        System.out.println(Controller.arrayEnemy.get(numEnemy).getName());
        System.out.println("Tu enemigo te desea comunicar que:  = " + Controller.arrayEnemy.get(numEnemy).getPrintMessage());
    }

    public static int UIturnoPlayer(Player player){
        System.out.println(" -_- Es tu turno Player -_- ");
        System.out.println("Escriba el no. de la opcción seleccioanda");
        System.out.println("1 Hacer uso de la habilidad especial \n2 Atacar al oPONENTE" );
        int battle = lector.nextInt();
        if(battle == 1){
            System.out.println("The Player: " + player.getName() + "invocó el ataque, ocasioanando: " + player.getPowerAttack() + "puntos de daño");
        }
        else {
            System.out.println("The Player" + player.getName() + "ha invocando su ítem: " + player.getHabilidades().getName() + "ocasioanado: ");
            System.out.println("Daño ocasioando: " + player.getHabilidades().getAttack());
            System.out.println("Curación: " + player.getHabilidades().getMoreLife());
        }

        return battle;
    }

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
            System.out.println("Tu enemigo: " + enemy.getName() + "te ha golpeado");
            System.out.println("Daño ocasioando: " + enemy.getPowerAttack());
        }
    }

    public static void typeOfState(Combatientes combatientes){
        System.out.println("El combatiente: " + combatientes.getName() + "obtiene: ");
        System.out.println("Tiene vidad: " + combatientes.getPointsLife());
    }
}




