package DataStructure.Lab7;

public class Node {
	public static final int ADD = 1;
	public static final int SUBTRACT = 2;
	public static final int MULTIPLY = 3;

	private int exponent;
	private int coefficient;

	public Node(int exponent, int coefficient) {
		super();
		this.exponent = exponent;
		this.coefficient = coefficient;
	}

	public Node(Node node) {
		this.exponent = node.exponent;
		this.coefficient = node.coefficient;
	}

//whether 2 nodes have the same exponent value
	public boolean isSameExponent(Node n) {
		return this.exponent == n.exponent;
	}

	public int getExponent() {
		return exponent;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

	public boolean lessThanExponent(Node node) {
		return this.exponent < node.exponent;
	}

//update coefficient based on a given operator and other node
	// assumed two nodes have the same exponent
	public void updateCoefficient(Node node, int op) {
		if (op == ADD)
			this.coefficient += node.getCoefficient();
		else if (op == SUBTRACT)
			this.coefficient -= node.getCoefficient();
		else if (op == MULTIPLY)
			this.coefficient *= node.getCoefficient();
		else
			throw new IllegalArgumentException("Operator is not supported.");
	}

//whether a node has zero coefficient (i.e., 0x^3)
	public boolean isZeroCoefficient() {
		return this.coefficient == 0;
	}
}

