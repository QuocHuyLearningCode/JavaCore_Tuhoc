
public class Main {
	public static void main(String[] args) {
		MyDate md = new MyDate(32,1,2024);
		md.getDay();
		System.out.println(md.getDay());
		md.setDay(35);
		System.out.println(md.getDay());
	}
}
