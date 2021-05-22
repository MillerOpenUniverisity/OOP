/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Date;

/**
 *
 * @author Copy Center
 */
public class Car{
   
    
    
    
    
    public Car()
    {
    
    }
    
    public Car( String color, int birthdate,String type,double speed)
    {
        
        color=color;
        birthdate=birthdate;
        type=type;
        speed=speed;
    }
    
    

    
    
   
    
    private int doors;
    String color;
    int birthdate;
    String type;
    double speed;
    
    
    Date d=new Date();  
    int year=d.getYear()+1900;
        
    
    
    int getBirthdate(){
        return birthdate;
    }


    public void setDoors(int doors)
    {
    
        this.doors=doors;
        
    }
    
    public int getDoors(){
        return doors;
    }
    

    
    String getColor(){
        return color;
    }
    String getType(){
        return type;
    }
    
    int getAge(int birthdate){
        return year-birthdate;
    }


    double getSpeed(){
        return speed;
    }
}
