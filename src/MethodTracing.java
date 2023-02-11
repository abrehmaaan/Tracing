
public class MethodTracing {

	public static void main(String[] args) {
			System.out.println("My first drawing JAVA program: ");
			drawLine();
			drawBody();
			drawLine();
	}
	public static void drawLine() {
		System.out.print("[");
		for(int i = 1; i<=8;i++) {
			System.out.print("5 ");
		}
		System.out.println("]");
	}
	public static void drawBody() {
		System.out.print("<");
		for(int i = 1; i<=8;i++) {
			System.out.print("? ");
		}
		System.out.println(">");
	}

}
