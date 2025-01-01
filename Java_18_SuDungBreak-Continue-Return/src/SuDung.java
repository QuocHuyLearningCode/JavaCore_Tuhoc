
public class SuDung {
//	public static void main(String[] args) {
//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10) {
//					break;
//				}
//			}
//			System.out.println("Ben trong vong lap: out= " + out + ", in = " + in);
//		}
//		System.out.println("Ben ngoai vong lap: out= " + out + ", in = " + in);
//	}
	
//	public static void main(String[] args) {
//		int out, in = 0;
//		outer: for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10) {
//					break outer;
//				}
//			}
//			System.out.println("Ben trong vong lap: out= " + out + ", in = " + in);
//		}
//		System.out.println("Ben ngoai vong lap: out= " + out + ", in = " + in);
//	}
	
//	public static void main(String[] args) {
//		StringBuffer searchMe = new StringBuffer("Hello world pppp");
//		int max = searchMe.length();
//		int numPs = 0;
//		System.out.println(searchMe);
//		
//		for(int i =0;i<max;i++) {
//			// interested only in p's
//			if(searchMe.charAt(i)!='p') {
//				continue;
//			}
//			// process p's
//			numPs++;
//			searchMe.setCharAt(i, 'P');
//		}
//		System.out.println("Found "+ numPs + " p's in the string.");
//		System.out.println(searchMe);
//	}
	
//	public static void main(String[] args) {
//		int max = 100;
//		for(int i=0;i<max;i++) {
//			if(i<50)
//				continue;
//			System.out.println(i);
//		}
//	}
	
//	public static void main(String[] args) {
//		int max = 9;
//		outer: for(int i=2;i<=max;i++) { 
//			for(int j=1;j<max+1;j++) {
//				if(j>5)
//					continue outer;
//				System.out.println(i+" x "+j+ " = "+(i*j));
//		}
//		System.out.println("Ket thuc!");
//	}}
	
	public static void main(String[] args) {
		int max = 9;
		for(int i=2;i<=max;i++) { 
			for(int j=1;j<max+1;j++) {
				if(j>5)
					return;
				System.out.println(i+" x "+j+ " = "+(i*j));
		}
		System.out.println("Ket thuc!");
	}}
}
