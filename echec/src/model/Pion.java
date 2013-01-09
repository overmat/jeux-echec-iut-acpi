package model;

public class Pion extends Piece {
	
	public Pion(int x, int y, String color){
		super(x, y, color);
		//rules.add();
		
	}
	@Override
	public void addRules() {
		m_rules.put("1h", m_allRules.getValueDeplacement("1h"));
		m_rules.put("2h", m_allRules.getValueDeplacement("2h"));
		m_rules.put("1D1", m_allRules.getValueDeplacement("1D1"));

	}
}
