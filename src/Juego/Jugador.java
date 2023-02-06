package Juego;

public class Jugador extends Entidad{

    //Atributos exclusivos de la clase
    private int experiencia;
    private int nivel;

    //--------------------------------------------------------------------//
    //Constructor vacío
    public Jugador(){

    }

    //Constructor parametrizado que hereda de la clase padre Entidad.
    public Jugador(String nombre, int vida, int ataque, int defensa, int experiencia, int nivel){
        super(nombre, vida, ataque, defensa);
        this.experiencia=experiencia;
        this.nivel=nivel;
    }

    //--------------------------------------------------------------------//

    @Override
    public int turno(int accion){

        switch (accion){
            case 0:
                System.out.println(accion=nivel+getAtaque());
                break;
            case 1:
                System.out.println(accion=experiencia+getDefensa());
                break;
            case 2:
                System.out.println(accion=nivel+experiencia);
                break;
            default:
                System.out.println("No se contempla esa acción, por favor introduce un numero del 0 al 2");
        }

        return accion;
    }

}
