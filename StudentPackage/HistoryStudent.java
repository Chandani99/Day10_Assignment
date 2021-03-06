package StudentPackage;

public class HistoryStudent extends Student{
	
	int historyMarks;
	int civicsMarks;
	
	

	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}
	
	@Override
	double getPercentage() {
		int obtainedMarks=getCivicsMarks()+getHistoryMarks();
		double per= (obtainedMarks*100)/200;
		return per;
	}


}
