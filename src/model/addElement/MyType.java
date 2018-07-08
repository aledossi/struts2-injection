package model.addElement;

public class MyType {
	private BType b1, b2;
	private String stringElement;
	private int intElement;
	
	public BType getB1() {
		return b1;
	}
	
	public void setB1(BType b1) {
		this.b1 = b1;
	}
	
	public BType getB2() {
		return b2;
	}
	
	public void setB2(BType b2) {
		this.b2 = b2;
	}
	
	public String getStringElement() {
		return stringElement;
	}
	
	public void setStringElement(String stringElement) {
		this.stringElement = stringElement;
	}
	
	public int getIntElement() {
		return intElement;
	}
	
	public void setIntElement(int intElement) {
		this.intElement = intElement;
	}
	
	public MyType(String stringElement, int intElement, 
			int a, int b, int c, int d, int e, int f, int g, int h) {
		super();
		this.stringElement = stringElement;
		this.intElement = intElement;
		b1 = new BType(a, b, c, d);
		b2 = new BType(e, f, g, h);
	}

	public MyType() {
		// TODO Auto-generated constructor stub
	}

}
