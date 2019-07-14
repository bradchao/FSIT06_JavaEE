package tw.brad.beans;

public class BradAPIsV2 {
	public static String createLottery() {
		int rand = (int)(Math.random()*49+1);
		return rand+"";
	}
	public static String sayYa(String name) {
		return "Ya! " + name; 
	}
	public static String toIntString(double v) {
		Double d = v;
		return d.intValue() + "";
	}
}
