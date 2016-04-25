
package alpha.model;


public class Stof {
    
    private String navn;
    private int pris;
    private int tilgængelighed;
    
    public Stof(String navn, int pris, int tilgængelighed)
    {
       this.navn = navn;
       this.pris = pris;
       this.tilgængelighed = tilgængelighed;
    }
    
    public String getNavn()
    {
       return navn;
    }
    
    public int getPris()
    {
       return pris;
    }
    
    public int getTilgængelighed()
    {
       return tilgængelighed;
    }
    
    public void setNavn (String navn)
    {
      this.navn = navn;
    }
    
    public void setPris (int pris)
    {
      this.pris = pris;
    }
    
    public void setTilgængelighed (int antal)
    {
      this.tilgængelighed = antal;
    }
    
    public void changeTilgængelighed (int antal)
    {
       this.tilgængelighed += antal;
    }
    
}//slut
