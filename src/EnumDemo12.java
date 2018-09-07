/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */

enum Transport{
    CAR,TRUCK,AIRPLANE,TRAIN,SHIP //every constant is a public static object using default constructor
}

public class EnumDemo12 {
    public static void main(String[] args) {
        Transport tp;
        tp = Transport.AIRPLANE;
        System.out.println("tp = "+tp);
        
        tp = Transport.CAR;
        if(tp == Transport.CAR)
            System.out.println("tp = "+tp);
        
        switch(tp){
            case CAR: System.out.println("race car"); break;
            case TRUCK: System.out.println("transformer"); break;
            case AIRPLANE: System.out.println("pilot"); break;
            case TRAIN: System.out.println("train brain"); break;
            case SHIP: System.out.println("titanic"); break;
        }
        
        System.out.println("All members of Transport");
        Transport allTransport[] =  Transport.values();
        for(Transport t : allTransport)
            System.out.println(t);
        
        tp = Transport.valueOf("TRUCK");
        System.out.println("tp = "+tp);
        
    }
}
