package Juego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner memoria = new Scanner(System.in);

        //--------------------------------------------------------------------//
        //Creaccion de objetos de las dos clases, (Jugador y Enemigo).

        Jugador Ryu = new Jugador("Ryu",1000,7,8,20,3);
        Enemigo Ken = new Enemigo("Ken",1200,10,6,12);

        //--------------------------------------------------------------------//
        //Creación del array y listado de los objetos previamente creados dentro del array.

        Entidad miArray [] = new Entidad[2];
        miArray[0]= Ryu;
        miArray[1]= Ken;

        //Recorremos el array mediante un bucle for para que se nos muestren los datos de cada objeto.

       for(int i=0; i< miArray.length;i++){
            System.out.println("Numero de objeto: "+i);
            System.out.println("Nombre del personaje:" + miArray[i].getNombre());
            System.out.println("Puntos de vida: "+ miArray[i].getVida());
            System.out.println("Puntos de ataque: " + miArray[i].getAtaque());
            System.out.println("Puntos de defensa: " + miArray[i].getDefensa());
            System.out.println("El ataque seleccionado inflinge: " + miArray[i].turno(2)+" de daño al oponente.");
            System.out.println("--------------------------------------------------");
        }


    }
}