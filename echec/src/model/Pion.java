package model;

import java.util.Iterator;
import java.util.Set;

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
	@Override
	public boolean canMove(int sx, int sy, int ds, int dy) {
		Set cles = m_rules.keySet();
		Iterator it = cles.iterator();
		while (it.hasNext()){
		   Object cle = it.next();
		   System.out.println(m_rules.size());
		   Object valeur = m_rules.get(cle);
		}
		return true;
	}
}
