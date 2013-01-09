package model;

public class Couple<X, Y> {
    private X x;
    private Y y;

    public Couple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
    
    public X getX() {
    	return x;
    }
    
    public Y getY() {
    	return y;
    }
}