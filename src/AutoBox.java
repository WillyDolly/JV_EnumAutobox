/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class AutoBox {
    
    static void m1(Integer iOB){
        System.out.println("m1: "+iOB);
    }
    
    static Integer m2(){
        return 22;
    }
    
    static int m3(){
        return 33;
    }
    
    public static void main(String[] args) {
        //manual boxing/unboxing
        Integer iOB = new Integer("100");
        int i = iOB.intValue();// = Integer.parseInt("number-format string")
        System.out.println(i+" "+iOB);
        
        //automatic boxing/unboxing
        Integer iOB1 = 100;
        int i1 = iOB1;
        System.out.println(i1+" "+iOB1);
        
        //type wrapper used in method
        m1(11);
        int i2 = m2();
        System.out.println("i2: "+i2);
        Integer iOB3 = m3();
        System.out.println("iOB3: "+iOB3);
        
        //type wrapper in calculation
        Integer iOB4, iOB5;
        iOB4 = 44;
        ++iOB4;
        System.out.println("iOB4: "+iOB4);
        iOB5 = (iOB4+1)/2;//unbox-calculate-box
        System.out.println("iOB5: "+iOB5);
        int i3 = iOB4 + iOB5;//unbox-calculate
        System.out.println("i3: "+i3);
    }
}
