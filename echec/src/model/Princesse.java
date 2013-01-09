package model;

public class Princesse extends Piece{
	
	
	public Princesse(int x, int y, String color) {
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
		m_rules.put("*D1", m_allRules.getValueDeplacement("*D1"));
		m_rules.put("*d1", m_allRules.getValueDeplacement("*d1"));
		m_rules.put("*D2", m_allRules.getValueDeplacement("*D2"));
		m_rules.put("*d2", m_allRules.getValueDeplacement("*d2"));
	}


}
