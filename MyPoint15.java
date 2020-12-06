package abstractionAndEncapsulation15;

public class MyPoint15 {
	private double x = 0;
	private double y = 0;
	
	public MyPoint15() {
		setX(x);
		setY(y);
	}
	
	public MyPoint15(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(MyPoint15 n) {
		return this.distance(n.getX(), n.getY());
	}
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
	}
	public static double distance(MyPoint15 n, MyPoint15 m) {
		return n.distance(m.x, m.y);
	}
	
}