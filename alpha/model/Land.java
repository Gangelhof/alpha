package alpha.model;

import java.util.ArrayList;

public class Land {
    
    private ArrayList <Stof> stoffer;
    
    public Land ()
    {
       this.stoffer = new ArrayList();
       
       this.stoffer.add(new Stof("Cocaine      ",  1200,30));
       this.stoffer.add(new Stof("Heroin       ",  1600,15));
       this.stoffer.add(new Stof("Amphetamine  ",   200,50));
       this.stoffer.add(new Stof("Acid         ",   550,33));
       this.stoffer.add(new Stof("Angel dust   ",   400,60));
       this.stoffer.add(new Stof("Crystal Meth ",   800,38));
    }
    
    public void Buy(int antal0, int antal1, int antal2,
                    int antal3, int antal4, int antal5)
               
    {
       this.stoffer.get(0).changeTilgængelighed(-antal0); 
       this.stoffer.get(1).changeTilgængelighed(-antal1); 
       this.stoffer.get(2).changeTilgængelighed(-antal2); 
       this.stoffer.get(3).changeTilgængelighed(-antal3); 
       this.stoffer.get(4).changeTilgængelighed(-antal4); 
       this.stoffer.get(5).changeTilgængelighed(-antal5); 
    }
    
    public void Sell(int antal0, int antal1, int antal2,
                     int antal3, int antal4, int antal5)
               
    {
       this.stoffer.get(0).changeTilgængelighed(antal0); 
       this.stoffer.get(1).changeTilgængelighed(antal1); 
       this.stoffer.get(2).changeTilgængelighed(antal2); 
       this.stoffer.get(3).changeTilgængelighed(antal3); 
       this.stoffer.get(4).changeTilgængelighed(antal4); 
       this.stoffer.get(5).changeTilgængelighed(antal5); 
    
    }
   
    public String Stofdata(int stofnr)
    {
       return
       this.stoffer.get(stofnr).getNavn() + " " +
       this.stoffer.get(stofnr).getPris() + " " +
       this.stoffer.get(stofnr).getTilgængelighed();
    }
    
    public int getTilgængelighed(int stofnr)
    {
       return this.stoffer.get(stofnr).getTilgængelighed();
    }
    
    public int Regn_pris(int antal0, int antal1, 
                         int antal2, int antal3, 
                         int antal4, int antal5)
    {
       return
               antal0 * this.stoffer.get(0).getPris()+
               antal1 * this.stoffer.get(1).getPris()+
               antal2 * this.stoffer.get(2).getPris()+
               antal3 * this.stoffer.get(3).getPris()+
               antal4 * this.stoffer.get(4).getPris()+
               antal5 * this.stoffer.get(5).getPris();
    }
    
    public void Reberegn_stoffer()
    {
        this.stoffer.get(0).Reberegn_stof();
        this.stoffer.get(1).Reberegn_stof();
        this.stoffer.get(2).Reberegn_stof();
        this.stoffer.get(3).Reberegn_stof();
        this.stoffer.get(4).Reberegn_stof();
        this.stoffer.get(5).Reberegn_stof();
    }
    
    

}//slut
