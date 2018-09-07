/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
enum Color{
    GREEN,BLUE,PURPLE
}
public class MethodsFromENUM {
    public static void main(String[] args) {
        for(Color c: Color.values())
            System.out.println(c+"'s position: "+c.ordinal());
        
        Color c,c2,c3,c4;
        c = Color.GREEN;
        c2 = Color.BLUE;
        c3 = Color.PURPLE;
        c4 = Color.BLUE;
        
        if(c.compareTo(c2)<0)
            System.out.println(c+" before "+c2);
        if(c3.compareTo(c2)>0)
            System.out.println(c3+" after "+c2);
        if(c4.compareTo(c2)==0)
            System.out.println(c4+" equal "+c2);
    }
}
