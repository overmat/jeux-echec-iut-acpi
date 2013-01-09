package model;

import java.util.HashMap;

public class Movement {

	Integer m_x;
	

	Integer m_y;
	Integer m_z1;
	Integer m_z2;
	
	Movement(int m_x, int m_y, int m_z1, int m_z2){
		this.m_x = m_x; 	//axe horizontal : _
		this.m_y = m_y; 	//axe vertical  :  |
		this.m_z1 = m_z1; 	//diagonale 1   :  /
		this.m_z2 = m_z2; 	//diagonale 2   :  \
	}
	
	public Integer getM_x() {
		return m_x;
	}

	public void setM_x(Integer m_x) {
		this.m_x = m_x;
	}

	public Integer getM_y() {
		return m_y;
	}

	public void setM_y(Integer m_y) {
		this.m_y = m_y;
	}

	public Integer getM_z1() {
		return m_z1;
	}

	public void setM_z1(Integer m_z1) {
		this.m_z1 = m_z1;
	}

	public Integer getM_z2() {
		return m_z2;
	}

	public void setM_z2(Integer m_z2) {
		this.m_z2 = m_z2;
	}
	
	
}
