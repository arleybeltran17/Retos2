import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner (System.in);
        int numpart=0;

        System.out.println("Ingrese La Cantidad De Participantes");
        numpart=lectura.nextInt();
        
        String [] nombre= new String [numpart];
        double [] tiempo= new double [numpart];

        for(int i=0; i<numpart; i++){
            System.out.println(i+"");

            System.out.println("Ingrese El Nombre Del Participante");
            nombre[i]=lectura.next();

            System.out.println("Ingrese El Tiempo Del Participante");
            tiempo[i]=lectura.nextDouble();

            System.out.println("El Nombre Es: "+nombre[i]);
            System.out.println("El Tiempo Del Participante Es: "+tiempo[i]);

            if(tiempo[i]<1.30){
                System.out.println("Gana");

            }else{
                System.out.println("Pierde, Gracias Por Participar");
            }
            
        }

        lectura.close();
    }

    
}
