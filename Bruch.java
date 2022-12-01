/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bruch;

/**
 *
 * @author bekns
 */
public class Bruch {
    
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }
    
    public Bruch add(Bruch b)
    {
        Bruch c = new Bruch(0,0);
        
        if (this.nenner == b.nenner)
        {
            c.zaehler = this.zaehler + b.zaehler;
            c.nenner = this.nenner;
        }
        else
        {
            c.zaehler = this.zaehler * b.nenner + b.zaehler * this.nenner ;
            c.nenner = this.nenner * b.nenner;
        }
        
        return c;
    }
    
    public Bruch sub(Bruch b)
    {
        Bruch c = new Bruch(0,0);
        
        if (this.nenner == b.nenner)
        {
            c.zaehler = this.zaehler - b.zaehler;
            c.nenner = this.nenner;
        }
        else
        {
            c.zaehler = this.zaehler * b.nenner - b.zaehler * this.nenner ;
            c.nenner = this.nenner * b.nenner;
        }
        
        return c;
    }
    
    public Bruch mul(Bruch b)
    {
         Bruch c = new Bruch(0,0);
         
         c.zaehler = this.zaehler * b.zaehler;
         c.nenner = this.nenner * b.nenner;
               
         
         return c;
    }
    
    public Bruch div (Bruch b)
    {
         Bruch c = new Bruch(0,0);
         
         c.zaehler = this.zaehler * b.nenner;
         c.nenner = this.nenner * b.zaehler;
               
         
         return c;
    }
    
    
    @Override
    public String toString()
    {
        return this.zaehler + "/" + this.nenner;
    }
    
    
    
}
