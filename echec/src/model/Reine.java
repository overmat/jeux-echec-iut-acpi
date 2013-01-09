package model;

public class Reine extends Piece{
	public Reine(int x, int y, String color) {
		super(x,y,color);
	}
	
	@Override
	public void addRules() {
		m_rules.put("*D1", m_allRules.getValueDeplacement("*D1"));
		m_rules.put("*d1", m_allRules.getValueDeplacement("*d1"));
		m_rules.put("*D2", m_allRules.getValueDeplacement("*D2"));
		m_rules.put("*d2", m_allRules.getValueDeplacement("*d2"));
		m_rules.put("*h", m_allRules.getValueDeplacement("*h"));
		m_rules.put("*h", m_allRules.getValueDeplacement("*h"));
		m_rules.put("*h", m_allRules.getValueDeplacement("*h"));
		m_rules.put("*h", m_allRules.getValueDeplacement("*h"));

	}

	@Override
	public boolean canMove(int sx, int sy, int ds, int dy) {
		// TODO Auto-generated method stub
		return false;
	}
}
