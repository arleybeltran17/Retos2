import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        int Cantidad,Cantidad2,suma=0;

        System.out.println("Ingrese El Tamaño Del Tablero");
        Cantidad=lectura.nextInt();

        int [][] Sudoku= new int [Cantidad][Cantidad];

        for(int fila=0;fila<Cantidad;fila++){

            for(int columna=0;columna<Cantidad;columna++){
    
                System.out.print("Digite Los Numeros Del Sudoku");
                Sudoku[fila][columna]=lectura.nextInt();
    }
    
        }

        for(int fila=0;fila<Cantidad;fila++){

            for(int columna=0;columna<Cantidad;columna++){
    
                
                System.out.print(Sudoku[fila][columna]+"\t");

    }

System.out.println("");

    }
    System.out.println("Ingrese La Cantidad de Numeros A Sumar");
    Cantidad2=lectura.nextInt();

    int [] suma2 = new int[Cantidad2];

    for(int i=0;i<Cantidad2;i++){

    
            System.out.println("Ingrese El Valor"+i);
            suma2[i]=lectura.nextInt();

            suma=suma+suma2[i];
    }

    System.out.println("La Suma Es: "+suma);

    lectura.close();

 
    }   
}
