package model;

import java.util.Iterator;
import java.util.Set;

public class Pion extends Piece {
	
	public boolean alwaysTrue;
	public Pion(int x, int y, String color){
		super(x, y, color);
		this.type = "Pion";
		//rules.add();
		
	}
	@Override
	public void addRules() {
		
		m_rules.put("1h", m_allRules.getValueDeplacement("1h"));
		m_rules.put("2h", m_allRules.getValueDeplacement("2h"));
		m_rules.put("1D1", m_allRules.getValueDeplacement("1D1"));
		m_rules.put("1d2", m_allRules.getValueDeplacement("1d2"));

	}
	
	
}
