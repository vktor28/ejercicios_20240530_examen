import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numDeseos=0;
        ArrayList <String> deseos = new ArrayList<>();
        System.out.println("\n-------");
        System.out.println("LAMPARA ALADINO");
        System.out.println("-------\n");
        System.out.println("||GENIO|| --> Pide un deseo?");
        deseos.add(teclado.nextLine());
        numDeseos=numDeseos+1;
        System.out.println("\n-------");
        boolean pedirDeseo=true;
        while (pedirDeseo) {
            System.out.println("||GENIO|| --> Quieres pedir otro deseo? (SI/NO)");
            if(teclado.nextLine().equalsIgnoreCase("SI")){
            System.out.println("||GENIO|| --> Qué deseo quieres pedir?");
            deseos.add(teclado.nextLine());
            System.out.println("\n-------");
            numDeseos=numDeseos+1;
            }
            else {pedirDeseo=false;}
        }
        teclado.close();
        System.out.println("\n--------------");
        System.out.println("--------------\n");
        
       System.out.println("||GENIO|| --> Has pedido " + numDeseos + " deseos y se te ha concedido...");
        int deseoConcedido=0;
        Random dRandom = new Random();
        deseoConcedido = dRandom.nextInt((numDeseos-1)+1);
        System.out.print("El deseo número "+deseoConcedido + ": ");
        System.out.println(deseos.get(deseoConcedido-1).toUpperCase());
        System.out.println("\n--------------");
        System.out.println("--------------\n");
        }

        



}
