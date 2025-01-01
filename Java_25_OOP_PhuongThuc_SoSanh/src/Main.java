
public class Main {
	public static void main(String[] args) {
		MyDate md = new MyDate(32,1,2024);
		MyDate md1 = new MyDate(32,1,2024);
		md.getDay();
		System.out.println(md.getDay());
		md.setDay(35);
		System.out.println(md.getDay());
		System.out.println(md);
		
		System.out.println("So sanh: "+ md.equals(md1));
		System.out.println("Hashcode: "+ md.hashCode());
		System.out.println("Hashcode: "+ md1.hashCode());
	}
}
