package StudentPackage;

public class ScienceStudent extends Student {
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	
	
	public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super(name, address);
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}


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
	
		double per=(obtainedMarks*100)/300;
		return per;
	}

 
}
