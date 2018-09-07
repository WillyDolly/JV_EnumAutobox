/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class AL_TrafficLightMain {
    public static void main(String[] args) {
        AL_TrafficLight tl = new AL_TrafficLight();
       
        for(int i=0;i<9;i++){
            System.out.println(tl.getColor());
            //Main Thread waits while AL_TrafficLight Thread is sleeping
            tl.waitForChange();//without it, color no change
        }
        tl.cancel();
    }
}
