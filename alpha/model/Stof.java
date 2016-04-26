

package alpha.model;

import java.util.Random;


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
    
    public void Reberegn_stof()
    {
        Random randomizer;
        randomizer = new Random();
 
        int priceChance = randomizer.nextInt(100);
        if (priceChance < 65) {
            this.pris = calculateNewPrice(this.pris);
        }
        
        int availabilityChance = randomizer.nextInt(100);
        if (availabilityChance < 65) {
            this.tilgængelighed = calculateNewAvailability(this.tilgængelighed);
        }

        
    }
    
    private int calculateNewPrice(double currentPrice) {
        Random randomizer;
        randomizer = new Random();
       
        int upOrDown = randomizer.nextInt(2);
        int changePercentage = randomizer.nextInt(85) + 1;
        double newPrice;

        if (upOrDown == 0) {
            newPrice = currentPrice - (currentPrice * changePercentage / 100);
        } else {
            newPrice = currentPrice + (currentPrice * changePercentage / 100);
        }

        return (int) newPrice;
    }
    
    private int calculateNewAvailability(int availability) {
        Random randomizer;
        randomizer = new Random();
        
        int upOrDown = randomizer.nextInt(2);
        int changePercentage = randomizer.nextInt(40) + 16;
        int newAvailability;

        if (upOrDown == 0) {
            newAvailability = (int) Math.floor(availability - (availability * changePercentage / 100));
        } else {
            newAvailability = (int) Math.floor(availability + (availability * changePercentage / 100));
        }

        return newAvailability;
    }    
   
    
}//slut
