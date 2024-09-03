// Estás en un restaurante con buffet libre y vas pidiendo platos.

// Escribes lo que se ha pedido cada vez.

// Ejemplo: qué quieres comer? Respuesta: lentejas. En terminal: “Has pedido lentejas”. Que se vaya viendo todo lo que se va pidiendo.

// - Si pide fabada, decirle “yo de ti no haria eso, forastero”

// - Cuando lleves 5 platos, tiene que dar el mensaje “vas a reventar!”

// Escribir ‘salir’ para salir.

// Cuando salgas, decir la cantidad total de platos que has comido: “has pedido 7 platos. Que aproveche!”


import java.util.ArrayList;
import java.util.Scanner;

public class buffetLibre{
    public static void main(String[] args) throws Exception {
        
        ArrayList <String> platosBuffetLibre = new ArrayList <String> ();
        Scanner sc = new Scanner(System.in);
        String platosBuffet;
        int platosContador = 0;

        System.out.println("Bienvenido al buffet libre de platos japoneses.");

        do {

            System.out.println("¿Que quieres comer? Escribe 'salir' si quieres dejar de pedir platos");
            platosBuffet = sc.nextLine();

            if (platosBuffet.equalsIgnoreCase("fabada")){
                System.out.println("Yo de ti no haría eso, forastero");
            } else if (!platosBuffet.equalsIgnoreCase("salir")){
                platosBuffetLibre.add(platosBuffet);
                System.out.println("Has pedido " + platosBuffet);
                platosContador++;

                if (platosContador == 5){
                    System.out.println("¡Vas a reventar!");
                }

            }
            
        } while (!platosBuffet.equalsIgnoreCase("salir"));
     

        System.out.println("Has pedido " + platosContador + " platos. Que aproveche!");
       
        sc.close();
    }

}