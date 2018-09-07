/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
enum TrafficLightColor{
    GREEN(5000),YELLOW(2000),RED(5000);
    
    private int delay;
    TrafficLightColor(int delay){
        this.delay = delay;
    }
    
    public int getDelay(){
        return delay;
    }
}

public class AL_TrafficLight implements Runnable{
    Thread thr;
    TrafficLightColor tlc;
    boolean stop = false;
    boolean changed = false;
    
    AL_TrafficLight(TrafficLightColor tlc){
        this.tlc = tlc;
        thr = new Thread(this);
        thr.start();
    }
    AL_TrafficLight(){
        tlc = TrafficLightColor.RED;
        thr = new Thread(this);
        thr.start();
    }

    @Override
    public void run() {
        try{
            while(!stop){
                Thread.sleep(tlc.getDelay());
                changeColor();
            }
           
        }catch(InterruptedException exc){
            System.out.println(exc);
        }
    }
    
    synchronized public void changeColor(){
        switch(tlc){
            case GREEN: 
                tlc = TrafficLightColor.YELLOW; break;
            case YELLOW:
                tlc = TrafficLightColor.RED; break;
            case RED:
                tlc = TrafficLightColor.GREEN; break;
        }
        changed = true;
        notify();
    }
    
    synchronized public void waitForChange(){
        try{
            while(!changed){//avoid unusual wake-up
               System.out.println("waiting for change");
               wait();
            }
               changed = false;
        }catch(InterruptedException exc){
            System.out.println(exc);
        }
    }
    
    public TrafficLightColor getColor(){
        return tlc;
    }
    
    synchronized void cancel(){
        stop = true;
    }
}
