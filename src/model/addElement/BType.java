package model.addElement;

public class BType {
	AType a1, a2;
	
	public AType getA1() {
		return a1;
	}

	public void setA1(AType a1) {
		this.a1 = a1;
	}

	public AType getA2() {
		return a2;
	}

	public void setA2(AType a2) {
		this.a2 = a2;
	}

	public BType(int first, int second, int third, int fourth) {
		super();
		a1 = new AType(first, second);
		a2 = new AType(third, fourth);
	}
}
