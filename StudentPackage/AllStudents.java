package StudentPackage;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Student st= new ScienceStudent();
		System.out.println("Science Student Information===============");
		
	    System.out.println("Enter name");
	    String name=sc.next();
	    
	    st.name=name;
	    
	    System.out.println("Enter Address");
	    String address=sc.next();
	    
	    st.address=address;
	    
	    ScienceStudent scst=(ScienceStudent)st; /// Object down casting 
	    
	    System.out.println("Enter Marks of Physics");
	    int phy=sc.nextInt();
	    scst.setPhisicsMarks(phy);
	    
	    System.out.println("EEnter Marks of Math");
	    int math=sc.nextInt();
	    scst.setMathsMarks(math);
	    
	    System.out.println("Enter Marks of Chemistory");
	    int che=sc.nextInt();
	    scst.setChemistryMarks(che);
	    
       double percentage= scst.getPercentage();
       System.out.println("Percentage of Science Student: " +percentage);
       
       
       
       System.out.println("History Student Information===============");
       
       Student st1=new HistoryStudent();
       System.out.println("Enter name");
	    String name1=sc.next();
	    
	    st1.name=name1;
	    
	    System.out.println("Enter Address");
	    String address1=sc.next();
	    
	    st1.address=address1;
	    
	    HistoryStudent hist=(HistoryStudent)st1; /// Object down casting 
	    
	    System.out.println("Enter Marks of History");
	    int history=sc.nextInt();
	    hist.setHistoryMarks(history);
	    
	    System.out.println("EEnter Marks of Civics");
	    int civics=sc.nextInt();
	    hist.setCivicsMarks(civics);
	   
	    
      double percentage1= hist.getPercentage();
      System.out.println("Percentage of Science Student: " +percentage1);

	}

}
