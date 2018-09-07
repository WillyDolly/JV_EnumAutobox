/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
@interface MyAnno{
    double d = 78;
    String str();
    int val();
}
public class AnnotationDemo {
    public static void main(String[] args) {
        show();
    }
    
    @MyAnno(str="hi",val=67)
    public static void show(){
        System.out.println("anno Demo");
    }
}
