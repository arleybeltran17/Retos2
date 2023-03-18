import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
    
    Scanner lectura =new Scanner(System.in);

   int Valor,suma=0;

   System.out.println("Ingrese La Cantidad De Notas");
   Valor= lectura.nextInt();

        
        int[] notas= new int[Valor];

        for(int i=0;i<Valor;i++){

            System.out.println("Ingrese la nota"+i);
            notas[i]=lectura.nextInt();
            
            System.out.println(notas[i]);

            suma=suma+notas[i];    
        }

        float promedio = suma/notas.length;

        System.out.println("La Suma Es: "+suma+"y El Promedio Es: "+promedio);

        if(promedio<=3){
            System.out.println("Reprobo");
        }else if((promedio<4)&&(promedio>3)){
            System.out.println("Pasa Raspando");
        }else if(promedio>=4){
            System.out.println("Aprobo");
        }else{
            System.out.println("Error");   
        }
        lectura.close();
    }  
}
