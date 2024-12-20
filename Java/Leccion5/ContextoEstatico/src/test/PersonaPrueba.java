
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //no se puede referenciar desde un contexto estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
        
    }
    public static void imprimir(Persona persona){ //esto trabaja de manera dinamica. void es el typo de retorno
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){ //creacion de un objeto para pasar a contexto dinamico que puede entrer al estatico
        imprimir(new Persona("Liliana"));
        return this.contador;
        
    }
    
}
