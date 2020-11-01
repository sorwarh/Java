/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes.poo;

/**
 *
 * @author sorwarhussian
 */
public class MyClassMain {

    public static void main(String[] args) {
        //Utilizar la clase MyClass y crear un nuevo objeto
        MyClass persona = new MyClass("Ferttt", 16);

        //Se puede crear x objetos 
        MyClass persona100 = new MyClass("Juan", 14);

        //Mostrar los datos de un objeto se tiene que usar la funcion toString() , tiene que estar creada en la clase MyClass
        
        System.out.println(persona.toString());
        
        //para mostrar todos los objetos de la clase  que esta en un array se usa for each
        
        MyClass [] array= new MyClass[2];
        
        array[0]= new MyClass("Jorge",11);
        array[1]=persona100;
        System.out.println("Array de MyClass");
        for (MyClass i : array) {
            
            System.out.println(i);
            
        }
            // llamar a un metodo creado un la clase. MyClass.nombreMetodo
        MyClass.myMethod();
        
        String retornoMetodo=MyClass.mayorEdad(persona.getEdad());
        System.out.println("El alumno "+persona.getNombre()+" es "+retornoMetodo);
       
    }

}
