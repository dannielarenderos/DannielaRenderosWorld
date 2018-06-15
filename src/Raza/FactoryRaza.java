package Raza;


//
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//

/**
 *
 * @author Danniela Renderos
 */
public class FactoryRaza {
    public static Raza getRaza(int tipo){
        switch(tipo){
            case 1:
                return new Savages();
            case 2:
                return new Rebels();  
            case 3:
                return new Dauntless();
    }
        return null;
    }
    
}
