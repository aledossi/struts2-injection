package actions.addElement;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import common.LinkedList;
import jbse.meta.Analysis;
import model.addElement.MyType;

public class AddElementAction extends ActionSupport implements Preparable {
	private static final long serialVersionUID = 1L;
	
	// oggetti istanziati tramite form
	private String formString;
	private int formInt;
	private int formA, formB, formC, formD, formE, formF, formG, formH;
	MyType obj;
	
	// struttura dati principale
	private List<MyType> dataStructure = new LinkedList<MyType>();
	
	// getters e setters per istanziare gli oggetti da inserire nell'arrayList	
	public String getFormString() {
		return formString;
	}

	public void setFormString(String formString) {
		this.formString = formString;
	}

	public int getFormInt() {
		return formInt;
	}

	public void setFormInt(int formInt) {
		this.formInt = formInt;
	}

	public int getFormA() {
		return formA;
	}

	public void setFormA(int formA) {
		this.formA = formA;
	}

	public int getFormB() {
		return formB;
	}

	public void setFormB(int formB) {
		this.formB = formB;
	}

	public int getFormC() {
		return formC;
	}

	public void setFormC(int formC) {
		this.formC = formC;
	}

	public int getFormD() {
		return formD;
	}

	public void setFormD(int formD) {
		this.formD = formD;
	}

	public int getFormE() {
		return formE;
	}

	public void setFormE(int formE) {
		this.formE = formE;
	}

	public int getFormF() {
		return formF;
	}

	public void setFormF(int formF) {
		this.formF = formF;
	}

	public int getFormG() {
		return formG;
	}

	public void setFormG(int formG) {
		this.formG = formG;
	}

	public int getFormH() {
		return formH;
	}

	public void setFormH(int formH) {
		this.formH = formH;
	}

	// verifica se una stringa contiene un'altra stringa passata come argomento
	public boolean containsIgnoreCase(String str, String searchStr)     {
	    if(str == null || searchStr == null) return false;

	    final int length = searchStr.length();
	    if (length == 0)
	        return true;

	    for (int i = str.length() - length; i >= 0; i--) {
	        if (str.regionMatches(true, i, searchStr, 0, length))
	            return true;
	    }
	    
	    return false;
	}
	
	// elimina alcune parole riservate SQL dalla stringa passata come argomento
	public String sanitize(String toCheck) {
		// evita il controllo del metodo -> analizzerebbe il bytecode di String
		Analysis.assume(false);
		
		String sanitized = toCheck;
		
		if (containsIgnoreCase(toCheck, "select"))
			sanitized = sanitized.replaceAll("(?i)select", "");
		if (containsIgnoreCase(toCheck, "drop")) 
			sanitized = sanitized.replaceAll("(?i)drop", "");
		if (containsIgnoreCase(toCheck, "alter"))
			sanitized = sanitized.replaceAll("(?i)alter", "");
		if (containsIgnoreCase(toCheck, "create"))
			sanitized = sanitized.replaceAll("(?i)create", "");
		if (containsIgnoreCase(toCheck, "delete"))
			sanitized = sanitized.replaceAll("(?i)delete", "");
		if (containsIgnoreCase(toCheck, "join"))
			sanitized = sanitized.replaceAll("(?i)join", "");
		if (containsIgnoreCase(toCheck, "insert"))
			sanitized = sanitized.replaceAll("(?i)insert", "");
		
		return sanitized;
	}
	
	public void execQuery(String query) {
		// evita controlli pesanti
		Analysis.ass3rt(false);
		
		// esecuzione della query contenuta in stringElement
		//System.out.println("\nQuery eseguita   -->  " + query);
	}

	@Override
	public void prepare() throws Exception {
		// istanzia un oggetto MyType e lo aggiunge nell'arrayList
		obj = new MyType(formString, formInt, 
				formA, formB, formC, formD, formE, formF, formG, formH);
		
		dataStructure.add(obj);
	}
	
	public String execute() {
		String stringElement = dataStructure.get(0).getStringElement();
		int intElement = dataStructure.get(0).getIntElement();
		int firstIntToCheck = dataStructure.get(0).getB1().getA1().getFirstInt();
		int secondIntToCheck = dataStructure.get(0).getB1().getA1().getSecondInt();
		int thirdIntToCheck = dataStructure.get(0).getB1().getA2().getFirstInt();
		int fourthIntToCheck = dataStructure.get(0).getB1().getA2().getSecondInt();
		int fifthIntToCheck = dataStructure.get(0).getB2().getA1().getFirstInt();
		int sixthIntToCheck = dataStructure.get(0).getB2().getA1().getSecondInt();
		int seventhIntToCheck = dataStructure.get(0).getB2().getA2().getFirstInt();
		int eigthIntToCheck = dataStructure.get(0).getB2().getA2().getSecondInt();
		String sanitizedString;
		
		// Control Flow
		if (firstIntToCheck == 0) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		if (secondIntToCheck == 1 && thirdIntToCheck == (fourthIntToCheck + fifthIntToCheck)) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		if (thirdIntToCheck >= intElement && ((secondIntToCheck + eigthIntToCheck - 2) <= eigthIntToCheck)) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		if ((intElement == 4 || sixthIntToCheck != seventhIntToCheck) && (firstIntToCheck == fourthIntToCheck - 2)) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		if ((fifthIntToCheck < 10 && intElement >= 10) || sixthIntToCheck == 2) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		if ((sixthIntToCheck + fourthIntToCheck) < (intElement + 2 + seventhIntToCheck)) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		if ((intElement + secondIntToCheck == firstIntToCheck + fourthIntToCheck) && (firstIntToCheck != sixthIntToCheck)) {
			sanitizedString = sanitize(stringElement);
			dataStructure.get(0).setStringElement(sanitizedString);
		}
		
		execQuery(dataStructure.get(0).getStringElement());
		return "success";
	}
}
