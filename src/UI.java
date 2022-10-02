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
}




