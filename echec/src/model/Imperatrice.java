package model;

import java.util.Map;

public class Imperatrice extends Piece{
	
	
	public Imperatrice(int x, int y, String color) {
		super(x,y,color);
	}

	@Override
	public void addRules() {
		m_rules.put("1d2h", m_allRules.getValueDeplacement("1d2h"));
		m_rules.put("1d2b", m_allRules.getValueDeplacement("1d2b"));
		m_rules.put("1g2h", m_allRules.getValueDeplacement("1g2h"));
		m_rules.put("1g2b", m_allRules.getValueDeplacement("1g2b"));
		m_rules.put("2d1h", m_allRules.getValueDeplacement("2d1h"));
		m_rules.put("2d1b", m_allRules.getValueDeplacement("2d1b"));
		m_rules.put("2g1h", m_allRules.getValueDeplacement("2g1h"));
		m_rules.put("2g1b", m_allRules.getValueDeplacement("2g1b"));
		m_rules.put("*h", m_allRules.getValueDeplacement("*h"));
		m_rules.put("*b", m_allRules.getValueDeplacement("*b"));
		m_rules.put("*d", m_allRules.getValueDeplacement("*d"));
		m_rules.put("*g", m_allRules.getValueDeplacement("*g"));
	}

	@Override
	public void deleteRuleAfterFirstMvt() {
		// TODO Auto-generated method stub
		
	}


}
