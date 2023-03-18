import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        String [][] teclado= {{"Esc"," ","F1","F2","F3","F4"," ", "F6","F7","F8"," ","F9","F10","F11","F12","Impr","Bloq despl","Pausa","","","",""},
    {"|","1","2","3","4","5","6","7","8","9","0","'","¿","Borrar","Borrar","Insert","Inicio","Av pag","Bloq num","/","*","-"},
    {"Tab","Q","W","E","R","T","Y","U","I","O","P","´","+","ENTER","ENTER","Suprimir","Fin","Re Pag","7","8","9","+"},
    {"Bloq Mayus","A","S","D","F","G","H","J","K","L","Ñ","{","}","ENTER","CANCELAR SONIDO","BAJAR VOLUMEN","SUBIR VOLUMEN","Suspender","4","5","6","+"},
    {"Shif","<>","Z","X","C","V","B","N","M",",",".","-","¿","Shif","Shif","Nada","Arriba","Nada","1","2","3","Enter"},
    {"Control","Windows","Alt","Espacio","Espacio","Espacio","Espacio","Espacio","Espacio","Espacio","Espacio","Espacio","Alt gr","Windows","Control","Izquierda","Abajo","Derecha","0","0","Suprimir","Enter"}
    };

    for(int fila=0;fila<6;fila++){

    for(int columna=0;columna<22;columna++){

    System.out.print(teclado[fila][columna]+"\t");
        
    }   
    System.out.println("");

}
lectura.close();

}

    
}
