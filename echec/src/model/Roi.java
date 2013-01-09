package model;

public class Roi extends Piece{
	public Roi(int x, int y, String color) {
		super(x,y,color);
	}
	
	@Override
	public void addRules() {
		m_rules.put("1h", m_allRules.getValueDeplacement("1h"));
		m_rules.put("1b", m_allRules.getValueDeplacement("1b"));
		m_rules.put("1d", m_allRules.getValueDeplacement("1d"));
		m_rules.put("1g", m_allRules.getValueDeplacement("1g"));
		m_rules.put("1D1", m_allRules.getValueDeplacement("1D1"));
		m_rules.put("1d1", m_allRules.getValueDeplacement("1d1"));
		m_rules.put("1D2", m_allRules.getValueDeplacement("1D2"));
		m_rules.put("1d2", m_allRules.getValueDeplacement("1d2"));
	}
}
