package model;

public class Cavalier extends Piece{
	
	
	public Cavalier(int x, int y, String color) {
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
	}

	@Override
	public boolean canMove(int sx, int sy, int ds, int dy) {
		// TODO Auto-generated method stub
		return false;
	}
}
