package DataStructure.Lab7;

public class Test {
	public static void main(String[] args) {
		Polynomial poly1 = new Polynomial();
		poly1.add(new Node(3, 2));
		poly1.add(new Node(4, 3));
		poly1.add(new Node(0, 10));
		poly1.add(new Node(7, 5));
		poly1.add(new Node(5, -1));

		System.out.println("R1: " + poly1);
		Polynomial poly2 = new Polynomial();
		poly2.add(new Node(0, 2));
		poly2.add(new Node(2, 3));
		poly2.add(new Node(5, 1));
		System.out.println("R2: " + poly2);

		Polynomial poly3 = poly2.add(poly1);
		System.out.println("R3=R1+R2: " + poly3);

		Polynomial poly4 = poly1.subtract(poly2);
		System.out.println("R4=R1-R2: " + poly4);

		Polynomial poly5 = new Polynomial();
		poly5.add(new Node(0, 2));
		poly5.add(new Node(2, 3));
		System.out.println("R5: "+poly5);

		Polynomial poly6 = poly5.multiply(poly1);
		System.out.println("R6=R5*R1: " + poly6);
	}

}
