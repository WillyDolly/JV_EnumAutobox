/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
enum Vehicle{
    CAR(54),TRUCK(34),TRAIN(100),PLANE(56);
    
    private int speed;
    Vehicle(int s){
        this.speed = s;
    }
//    Vehicle(int s,String t){            
//    }
    
    int getSpeed(){
        return speed;
    }
}
public class EnumConstant_Object {
    public static void main(String[] args) {
        System.out.println("car's velocity: "+Vehicle.TRUCK.getSpeed());//constructor called every time a constant is specialized
       
        System.out.println("show all vehicle and their speed: ");
        Vehicle vs[] = Vehicle.values();
        for(Vehicle vc : vs)
            System.out.println(vc+"'s velocity: "+vc.getSpeed());
    }
}
