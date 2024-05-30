import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Dioses> dioses = new ArrayList<>();
        //creo un arrayList donde meto ambos, aunque podría hacer 2 diferentes para cada clase. No sé muy bien cual era la idea.
        //ArrayList <DiosesDelOlimpo> diosesOlimpo = new ArrayList<>();
        //ArrayList <DiosesModernos> diosesModernos = new ArrayList<>();
        System.out.println("\n--------------------------");
        System.out.println("GUERRA DE DIOSES");
        System.out.println("--------------------------\n");

        //INSTANCIAMOS DIOS OLIMPO
        System.out.println("Introduce el nombre de un Dios del Olimpo");
        String nombreDO = teclado.nextLine();
        System.out.println("Introduce su edad");
        int edadDO = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce su grado de fuerza de 1-10 (puede contener decimales)");
        double fuerzaDO = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduce su Característica (Ej: dios del mar, amor...)");
        String caracDO = teclado.nextLine();
        dioses.add(new DiosesDelOlimpo(nombreDO, edadDO, fuerzaDO, caracDO));
        System.out.println("\n\n");
        
        //INSTANCIAMOS DIOS MODERNO
        System.out.println("Introduce el nombre de un Dios Moderno");
        String nombreDM = teclado.nextLine();
        System.out.println("Introduce su edad");
        int edadDM = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce su grado de fuerza de 1-10 (puede contener decimales)");
        double fuerzaDM = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introduce su plataforma de impacto (TV, tiktok...)");
        String platafDM= teclado.nextLine();
        dioses.add(new DiosesModernos(nombreDM, edadDM, fuerzaDM, platafDM));
        System.out.println("\n--------------------------");
        System.out.println("EMPIEZA LA BATALLA");
        System.out.println("--------------------------\n");
        teclado.close();

        //MOSTRAMOS AMBOS Y SUS CARACTERÍSTICAS EN LINEAS DIFERENTES
        for(int i=0; i<dioses.size(); i++)
        {
            System.out.println("-> " + dioses.get(i).toString() + "\n");

        }
        System.out.println("\n--------------------------");
        System.out.println("RESULTADO BATALLA");
        System.out.println("--------------------------");

        if(dioses.get(0).getGradoFuerza()>dioses.get(1).getGradoFuerza()){
        System.out.println(dioses.get(0).getNombre() + " gana a " + dioses.get(1).getNombre() + " por " + (float) (dioses.get(0).getGradoFuerza()-dioses.get(1).getGradoFuerza()) + " puntos.");
        } else {
        System.out.println(dioses.get(1).getNombre() + " gana a " + dioses.get(0).getNombre() + " por " + (float) (dioses.get(1).getGradoFuerza()-dioses.get(0).getGradoFuerza()) + " puntos.");

        }

 



    }
}
