package tw.brad.myjava;

public class Brad15 {
	private int x, y;
	private String op;
	public Brad15(String x, String y, String op) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		this.op = op;
	}
	public int add() {
		return x + y;
	}
	
	public double operation() {
		double ret = 0;
		switch(op) {
			case "1": ret = x + y; break;
			case "2": ret = x - y; break;
			case "3": ret = x * y;break;
			case "4": ret = x*1.0 / y; break;
		}
		return ret;
	}
	
}
