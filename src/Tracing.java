class Vector {
	public int x, y;
	public Vector(int a, int b) {
		x = a; y = b;
	}
	public static Vector Sum(Vector V1, Vector V2) {
		return new Vector(V1.x+V2.x,V1.y+V2.y);
	}
	public void DisplayVector() {
		System.out.println("x = "+x+",y ="+y);
	}
}
public class Tracing{
	public static void main(String[] args) {
		Vector V1 = new Vector(3,1);
		Vector V2 = new Vector(2,6);
		Vector SV = Vector.Sum(V1,V2);
		V1.DisplayVector();
		V2.DisplayVector();
		SV.DisplayVector();
	}
}