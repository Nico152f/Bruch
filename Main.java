/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bruch;

/**
 *
 * @author bekns
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bruch a = new Bruch(1,4);
       Bruch b = new Bruch (2,4);
       
       Bruch c = new Bruch(0,0);
       
       c = a.sub(b);
       
       System.out.println(c);
    }
    
}
