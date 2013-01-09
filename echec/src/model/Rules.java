package model;

import java.util.HashMap;
import java.util.Map;


public class Rules {

	private static Map<String,Couple<Movement,Boolean>> rules;
	
    public static Rules getInstance() {
        if (null == instance) {
            instance = new Rules();
        }
        return instance;
    }

    private Rules() {
    	rules = new HashMap<String,Couple<Movement,Boolean>>();
    	createAllRules();
    }
    
    //mouvement vers le haut : 1h
  	//mouvement vers le bas : 1b
  	//mouvement vers la droite : 1d
  	//mouvement vers la gauche : 1g
  	//mouvement diagonale en haut ˆ droite : D1 
  	//mouvement diagonale en bas ˆ gauche : d1
  	//mouvement diagonale en bas ˆ droite : D2
  	//mouvement diagonale en haut ˆ gauche : d2
  	
    public static void createAllRules()
    {
    
    	rules.put("1h", new Couple(new Movement(new Integer(0),new Integer(1),new Integer(0),new Integer(0)),false));
    	rules.put("2h", new Couple(new Movement(new Integer(0),new Integer(2),new Integer(0),new Integer(0)),false));
    	rules.put("1D1", new Couple(new Movement(new Integer(1),new Integer(1),new Integer(0),new Integer(0)),false));
    	
    	rules.put("1d2h", new Couple(new Movement(new Integer(1),new Integer(2),new Integer(0),new Integer(0)),true));
    	rules.put("1d2b", new Couple(new Movement(new Integer(1),new Integer(-2),new Integer(0),new Integer(0)),true));
    	rules.put("1g2h", new Couple(new Movement(new Integer(-1),new Integer(2),new Integer(0),new Integer(0)),true));
    	rules.put("1g2b", new Couple(new Movement(new Integer(-1),new Integer(-2),new Integer(0),new Integer(0)),true));
    	rules.put("2d1h", new Couple(new Movement(new Integer(2),new Integer(1),new Integer(0),new Integer(0)),true));
    	rules.put("2d1b", new Couple(new Movement(new Integer(2),new Integer(-1),new Integer(0),new Integer(0)),true));
    	rules.put("2g1h", new Couple(new Movement(new Integer(-2),new Integer(1),new Integer(0),new Integer(0)),true));
    	rules.put("2g1b", new Couple(new Movement(new Integer(-2),new Integer(-1),new Integer(0),new Integer(0)),true));
    	
    	rules.put("*h", new Couple(new Movement(new Integer(0),new Integer(7),new Integer(0),new Integer(0)),false));
    	rules.put("*b", new Couple(new Movement(new Integer(0),new Integer(-7),new Integer(0),new Integer(0)),false));
    	rules.put("*d", new Couple(new Movement(new Integer(7),new Integer(0),new Integer(0),new Integer(0)),false));
    	rules.put("*g", new Couple(new Movement(new Integer(-7),new Integer(0),new Integer(0),new Integer(0)),false));
    	
    	rules.put("*D1", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(7),new Integer(0)),false));
    	rules.put("*d1", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(7)),false));
    	rules.put("*D2", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(-7),new Integer(0)),false));
    	rules.put("*d2", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-7)),false));
    	    	
    	rules.put("1b", new Couple(new Movement(new Integer(0),new Integer(-1),new Integer(0),new Integer(0)),false));
    	rules.put("1d", new Couple(new Movement(new Integer(1),new Integer(0),new Integer(0),new Integer(0)),false));
    	rules.put("1g", new Couple(new Movement(new Integer(-1),new Integer(0),new Integer(0),new Integer(0)),false));
    	rules.put("1D1", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(1),new Integer(0)),false));
    	rules.put("1d1", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(-1),new Integer(0)),false));
    	rules.put("1D2", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(1)),false));
    	rules.put("1d2", new Couple(new Movement(new Integer(0),new Integer(0),new Integer(0),new Integer(-1)),false));
    	
    }
    
    private static Rules instance;
    
    public Couple<Movement,Boolean> getValueDeplacement(String key)
    {
    	
    	return rules.get(key);
    }
    
}
