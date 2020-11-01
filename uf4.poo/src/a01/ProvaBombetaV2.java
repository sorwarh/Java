/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01;

/**
 *
 * @author sorwarhussian
 */
public class ProvaBombetaV2 {
    public static void main(String[] args) {
        
        BombetaV2 [] bombetes= new BombetaV2[6];
        
        //crear las 6 bombetes
        for (int i = 0; i < bombetes.length; i++) {
                bombetes[i]= new BombetaV2();
        }
        
        
        for (int i = 0; i < bombetes.length; i++) {
            bombetes[i].encendre();
            
            for (int j = i; j < bombetes.length; j++) {
                int n= (int) (Math.random()*7); 
               bombetes[j].incrementarIntensitat(n);
            }
        }
       
        
        
        
         mostrarEstat(bombetes);
         
         System.out.println(" totalBombetes = " +BombetaV2.totalBombetes);
         System.out.println(" bombetesEnces = " +BombetaV2.bombetesEnces);
         System.out.println(" bombetesApagades = " +BombetaV2.bombetesApagades);
         System.out.println(" bombetesFos = " +BombetaV2.bombetesFos);
         
         System.out.println("Bombetes foses");
         
         for (int i = 0; i < bombetes.length; i++) {
           
             if (bombetes[i].estaFosa) {
                 System.out.println("Bombeta num "+i);
             } 
            
        }
         

    }
    
    private static void mostrarEstat(BombetaV2 [] bombetes){
    
        for (BombetaV2 b : bombetes) {
            System.out.println(b);
            
        }
    }
    
}
