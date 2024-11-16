package DataStructure.Lab7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
	private LinkedList<Node> expression = new LinkedList<Node>();

	public Polynomial() {

	}

	public Polynomial(LinkedList<Node> expression) {
		for (Node node : expression) {
			this.expression.add(new Node(node));
		}
	}

//Task 1. add a node to the polynomial expression
	public void add(Node node) {
		ListIterator<Node> iterator = expression.listIterator();
        while(iterator.hasNext()){
			Node next = iterator.next();
			if(next.isSameExponent(node)){
				next.updateCoefficient(node, Node.ADD);
                return;
			} else if(next.lessThanExponent(node)){
				iterator.previous();
				iterator.add(node);
                return;
			}
        }
		iterator.add(node);
	}

//Task 2. perform the subtraction operator between the polynomial expression and a given node
	public void subtract(Node node) {
		ListIterator<Node> iterator = expression.listIterator();
        while(iterator.hasNext()){
			Node next = iterator.next();
			if(next.isSameExponent(node)){
				next.updateCoefficient(node, Node.SUBTRACT);
                return;
			} else if(next.lessThanExponent(node)){
				iterator.previous();
				iterator.add(node);
                return;
			}
        }
		iterator.add(node);
	}

//Task 3. perform the addition operator between the current polynomial expression and other
	public Polynomial add(Polynomial other) {
		Polynomial result = new Polynomial(this.expression);
		for (Node node : other.expression){
			result.add(node);
		}
		return result;
	}

// Task 4. perform the subtraction operator between the current polynomial expression and other
	public Polynomial subtract(Polynomial other) {
		Polynomial result = new Polynomial(this.expression);
		for (Node node : other.expression){
			result.subtract(node);
		}
		return result;
	}

// Task 5. perform the multiplication operator between the current polynomial expression and other
	public Polynomial multiply(Polynomial other) {
		Polynomial result = new Polynomial();
		for (Node node : this.expression){
			for (Node node2 : other.expression){
				int exponent = node.getExponent() + node2.getExponent();
				int coefficient = node.getCoefficient() * node2.getCoefficient();
				result.add(new Node(exponent, coefficient));
			}
		}
		return result;
	}

//display the polynomial expression
	public String toString() {
		String re = "";
		for (Node node : expression) {
			if (node.getExponent() != 0)
				re += node.getCoefficient() + "x^" + node.getExponent() + " + ";
			else
				re += node.getCoefficient();
		}
		return re;
	}
}
