/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sorwarhussian
 */
public class ProducteProva {
    public static void main(String[] args) {
        
       
        Producte p0= new  Producte (23,"Camisa",23.50,"Rosa",'S');
        Producte p1= new  Producte (1,"Pantalo",39.90,"Blau",'M');
        Producte p2= new  Producte (4,"Jersei",29.40,"Verd",'S');
        Producte p3= new  Producte (17,"Camisa",24.50,"Verd",'L');
        Producte p4= new  Producte (25,"Samarreta",8.90,"Blanca",'S');
        
        Producte [] array= new Producte [5];
        
        array[0]=p0;
        array[1]=p1;
        array[2]=p2;
        array[3]=p3;
        array[4]=p4;
        double preu=0;
        
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
            
            preu+=array[i].getPreu();
           
           
        }
        //a)preu total 
        System.out.println("\nPreu Total "+preu+" €\n");
        
        //b) comptar i mostrar quants productes hi ha de la talla ‘S’.
        System.out.println("Productes de Talla S: ");
        int cont=0;
         for (int i=0;i<array.length;i++){
            if (array[i].getTalla()=='S'){
                System.out.println(array[i]);
                cont++;
            
            }
            
        }
         System.out.println("\nEn total tenim " +cont +" productes de talla S \n");
         // c 
         
         //Busqueda y modificacio de jersei 
         
         for (int i=0; i<array.length;i++) {
         
             if (array[i].getDescripcio().equals("Camisa")) {
                 
                 array[i].setPreu(2500000.40);
                 
             
             }
             
             System.out.println(array[i]);
         }
         
         
        
         
         
        
        
    }
    
}
