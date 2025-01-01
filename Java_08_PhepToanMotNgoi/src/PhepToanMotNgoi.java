
public class PhepToanMotNgoi {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		// phu dinh mot bieu thuc 
		System.out.println("- => gia tri: " + (-a));
		// bieu thi mot gia tri duong
		System.out.println("+ => gia tri: " + (+a));
		// toan tu phu dinh 
		System.out.println("! => gia tri: " + (!b));
		
		System.out.println("gia tri: " + a);
		// toan tu cong
		System.out.println("++a => gia tri: " + (++a)); // tang a truoc sysout
		System.out.println("a++ => gia tri: " + (a++)); // sysout truoc tang a
		System.out.println("gia tri: " + a);
		// toan tu tru 
		System.out.println("--a => gia tri: " + (--a)); // tru a truoc sysout
		System.out.println("a-- => gia tri: " + (a--)); // sysout truoc tru a 
		System.out.println("gia tri: " + a);
	}
}
