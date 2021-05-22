/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;



/**
 *
 * @author Copy Center
 */
public class OnlineStore {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         /* BMW */
         Car bmw=new Car();
         bmw.CarType="BMW 3";
         bmw.Model=2010;
         bmw.speed=300;
         bmw.getHowMuchYear(bmw.Model);
         /* BMW */
         
         /*KIA*/
         Car kia=new Car();
         kia.CarType="Manual";
         kia.Model=2020;
         kia.speed=200;
         kia.getHowMuchYear(kia.Model);
         
         
         /*KIA*/
         System.out.println("BMW speed is "+bmw.speed);
         System.out.println("Kia speed is "+kia.speed);
    }
    
    
    
}
