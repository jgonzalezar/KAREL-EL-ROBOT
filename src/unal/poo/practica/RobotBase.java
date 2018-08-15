package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
        public static void GiraALaDerecha(){
            for(int j=0;j<3;j=j+1){
            estudiante.turnLeft();
            }
        }
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
            
            estudiante.move();
            boolean puedeTomar = estudiante.canPickThing();
            for(int i=0;i<2;i++){
            if(puedeTomar==true)
                estudiante.pickThing();
            }
            
            estudiante.turnLeft();
            int numeroThings = estudiante.countThingsInBackpack();
            for (int i=0;i<2;i++){
            estudiante.move();
            estudiante.putThing();
            }
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            estudiante.move();
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
}

