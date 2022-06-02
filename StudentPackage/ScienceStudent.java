package StudentPackage;

public class ScienceStudent extends Student {
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public int getPhisicsMarks() {
		return phisicsMarks;
	}

	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
	@Override
	double getPercentage() {
		int obtainedMarks=getMathsMarks()+getChemistryMarks()+getPhisicsMarks();
		System.out.println("Obtained marks: "+obtainedMarks);
		System.out.println("Math marks: "+getMathsMarks());
		System.out.println("Chemistory marks: "+getChemistryMarks());
		System.out.println("Physics"+getPhisicsMarks());
		double per=(obtainedMarks*100)/300;
		return per;
	}

 
}
