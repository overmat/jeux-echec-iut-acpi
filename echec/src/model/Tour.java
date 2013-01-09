package model;

public class Tour extends Piece{
	public Tour(int x, int y, String color) {
		super(x,y,color);
	}

	@Override
	public void addRules() {
		m_rules.put("*h", m_allRules.getValueDeplacement("*h"));
		m_rules.put("*b", m_allRules.getValueDeplacement("*b"));
		m_rules.put("*d", m_allRules.getValueDeplacement("*d"));
		m_rules.put("*g", m_allRules.getValueDeplacement("*g"));
	}
}
