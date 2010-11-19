package org.xtext.workshop.arithmetics.metamodel;

/**
 * A convenience "in-between" class which has all features common to the binary
 * operation meta model classes "Pulled-Up".
 * 
 * @author Meinte Boersma
 */
public abstract class BinaryOperation implements Expression {

	private Expression left;
	private Expression right;

	public Expression getLeft() {
		return left;
	}
	public void setLeft(Expression left) {
		this.left = left;
	}
	public Expression getRight() {
		return right;
	}
	public void setRight(Expression right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "(" + left.toString() + getOperator() + right.toString() + ")";
	}

	abstract char getOperator();

}
