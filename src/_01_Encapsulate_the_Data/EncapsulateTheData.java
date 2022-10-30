package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/*
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			this.itemsReceived = 0;
		} else {
			this.itemsReceived = itemsReceived;
		}
	}
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;

	public void setDegreesTurned(double degreesTurned) {
		if (degreesTurned < 0.0) {
			this.degreesTurned = 0.0;
		} else if (degreesTurned > 360) {
			this.degreesTurned = 360;
		} else {
			this.degreesTurned = degreesTurned;
		}
	}

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	public void setNomenclature(String nomenclature) {
		if (nomenclature.equals("")) {
			this.nomenclature = " ";
		} else {
			this.nomenclature = nomenclature;
		}
	}

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

private	Object memberObj;

public void setMemberObj(Object memberObj) {
boolean test = (memberObj instanceof String);
		if(test==true) {
			this.memberObj = new Object();
		}		else {
			this.memberObj = memberObj;
		}
	}


	 public Integer getItemsReceived() {
		// TODO Auto-generated method stub
		return itemsReceived;
	}

	public Double getDegreesTurned() {
		// TODO Auto-generated method stub
		return degreesTurned;
	}

	public Object getNomenclature() {
		// TODO Auto-generated method stub
		return nomenclature;
	}


	public Object getMemberObj() {
		// TODO Auto-generated method stub
		return memberObj;
	}

}
