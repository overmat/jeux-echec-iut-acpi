package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pion extends Piece {
	
	public boolean alwaysTrue;
	public Pion(int x, int y, String color){
		super(x, y, color);
		
	}
	@Override
	public void addRules() {
		
		m_rules.put("1he", m_allRules.getValueDeplacement("1h"));
		m_rules.put("2h", m_allRules.getValueDeplacement("2h"));
		m_rules.put("1D1a", m_allRules.getValueDeplacement("1D1"));
		m_rules.put("1d2a", m_allRules.getValueDeplacement("1d2"));

	}
	@Override
	public void deleteRuleAfterFirstMvt() {
		// TODO Auto-generated method stub
		m_rules.remove("2h");
		
	}
	
	
}
