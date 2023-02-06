package Juego;

public class Enemigo extends Entidad {
    //Atributos propios de la clase.
    private int dificultad;

    //--------------------------------------------------------------------//
    //Constructor vacío.
    public Enemigo(){

    }
    //Constructor parametrizado que hereda de la clase padre Entidad.
    public Enemigo (String nombre, int vida, int ataque, int defensa,int dificultad){
        super(nombre, vida, ataque, defensa);
        this.dificultad=dificultad;
    }

    //------------------------------------------------------------------------//

    @Override
    public int turno(int accion){
        switch (accion){
            case 0:
                System.out.println(accion=dificultad+getAtaque());
                break;
            case 1:
                System.out.println(accion=dificultad+getDefensa());
                break;
            case 2:
                System.out.println(accion=dificultad+getAtaque()+getDefensa());
                break;
            default:
                System.out.println("No se contempla esa acción, por favor introduce un numero del 0 al 2");
        }

        return accion;
    }




}
