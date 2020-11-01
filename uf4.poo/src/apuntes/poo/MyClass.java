package apuntes.poo;

public class MyClass { //clase de poo

    //atributos de una clase
    private String nombre;
    private int edad;

    //constructor para que se pueda crear el objeto, el constructor puede tener todos o algunos de los atributos de la clase.
    public MyClass(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() { // sirve para mostrar en el main el objeto creado
        return "MyClass{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    public int getEdad() {
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    
    
    
    static void myMethod(){
        
        System.out.println("Hola ");
    
    }
    
    static String mayorEdad(int edad){
        
        String msg="Menor de edad";
        
        if (edad>=18){
            msg="Mayor de edad"; 
        }
    
        return msg;
    }

}
