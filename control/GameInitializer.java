/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.control;

import alpha.interfaces.IGameInitializer;
import alpha.model.Country;
import alpha.model.Drug;
import alpha.model.Stash;
import alpha.model.User;
import java.util.ArrayList;

/**
 *
 * @author RunEvil
 */
public class GameInitializer implements IGameInitializer {
    
    @Override
    public ArrayList<Drug> initializeDrugs() {
        ArrayList<Drug> startDrugs = new ArrayList<>();

        Drug cocaine = new Drug() {
            {
                name = "Cocaine";
                price = 1200.00;
                availability = 30;
            }
        };

        Drug heroin = new Drug() {
            {
                name = "Heroin";
                price = 1600.00;
                availability = 15;
            }
        };

        Drug amphetamine = new Drug() {
            {
                name = "Amphetamine";
                price = 200.00;
                availability = 50;
            }
        };

        Drug acid = new Drug() {
            {
                name = "Acid";
                price = 550.00;
                availability = 33;
            }
        };

        Drug angelDust = new Drug() {
            {
                name = "Angel Dust";
                price = 1200.00;
                availability = 30;
            }
        };

        Drug crystalMeth = new Drug() {
            {
                name = "Blue Sky";
                price = 800.00;
                availability = 38;
            }
        };

        // Add drugs to list
        startDrugs.add(cocaine);
        startDrugs.add(heroin);
        startDrugs.add(amphetamine);
        startDrugs.add(acid);
        startDrugs.add(angelDust);
        startDrugs.add(crystalMeth);
        
        return startDrugs;
    }
    
    public ArrayList<Country> initializeCountries(ArrayList<Drug> startDrugs) {
        ArrayList<Country> countries = new ArrayList<>();

        Country denmark = new Country() {
            {
                name = "Denmark";
                drugs = startDrugs;
            }
        };

        Country colombia = new Country() {
            {
                name = "Colombia";
                drugs = startDrugs;
            }
        };

        Country germany = new Country() {
            {
                name = "Germany";
                drugs = startDrugs;
            }
        };

        Country usa = new Country() {
            {
                name = "USA";
                drugs = startDrugs;
            }
        };

        Country france = new Country() {
            {
                name = "France";
                drugs = startDrugs;
            }
        };

        Country afghanistan = new Country() {
            {
                name = "Afghanistan";
                drugs = startDrugs;
            }
        };

        countries.add(denmark);
        countries.add(colombia);
        countries.add(germany);
        countries.add(usa);
        countries.add(france);
        countries.add(afghanistan);
        
        return countries;
    }
    
    public User initializeUser(String input) {
        return new User() {
            {
                name = input;
                stash = initializeStash();
            }
        };
    }
    
    //-----------------   PRIVATE METHODS ----------------------//
    private Stash initializeStash() {
        return new Stash();
    }
}
