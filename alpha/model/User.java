package alpha.model;

import java.util.ArrayList;

public class User {
    
    private int[] beholdning;
    private int penge;
    private int besogt;
    
    
    public User()
    {
      this.beholdning = new int[6];
      this.penge = 5000;
      this.besogt = 0;
      
      this.beholdning[0] = 0;
      this.beholdning[1] = 0;
      this.beholdning[2] = 0;
      this.beholdning[3] = 0;
      this.beholdning[4] = 0;
      this.beholdning[5] = 0;     
    }
    
    public void Buy(int antal0, int antal1, int antal2,
                    int antal3, int antal4, int antal5,
                    int pris)
    {
        this.beholdning[0] += antal0; 
        this.beholdning[1] += antal1; 
        this.beholdning[2] += antal2; 
        this.beholdning[3] += antal3; 
        this.beholdning[4] += antal4; 
        this.beholdning[5] += antal5; 
        
        this.penge -= pris;
    }
    
    public void Sell(int antal0, int antal1, int antal2,
                     int antal3, int antal4, int antal5,
                     int pris)
    {
        this.beholdning[0] -= antal0; 
        this.beholdning[1] -= antal1; 
        this.beholdning[2] -= antal2; 
        this.beholdning[3] -= antal3; 
        this.beholdning[4] -= antal4; 
        this.beholdning[5] -= antal5; 
        
        this.penge += pris;
    }
    

    public int getPenge()
    {
        return this.penge;
    }
    
    public int getBeholdning(int stofnr)
    {
        return this.beholdning[stofnr];
    }
    
    public void Go()
    {
       this.besogt ++;
    }
    
    public int getBesogt()
    {
        return this.besogt;
    }
     
    
}//slut

