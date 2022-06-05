package StudentPackage;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Science Student Information===============");
		
	    System.out.println("Enter name");
	    String name=sc.next();
	    
	    System.out.println("Enter Address");
	    String address=sc.next();
	    
	    /// Object down casting 
	    
	    System.out.println("Enter Marks of Physics");
	    int phy=sc.nextInt();
	    
	    System.out.println("EEnter Marks of Math");
	    int math=sc.nextInt();
	    
	    System.out.println("Enter Marks of Chemistory");
	    int che=sc.nextInt();
	    
	    ScienceStudent scst= new ScienceStudent(name,address,phy,math,che);
        double percentage= scst.getPercentage();
        
        System.out.println("Name: "+scst.getName());
        System.out.println("Address: "+scst.getAddress());
    	System.out.println("Math marks: "+scst.getMathsMarks());
		System.out.println("Chemistory marks: "+scst.getChemistryMarks());
		System.out.println("Physics: "+scst.getPhisicsMarks());
        System.out.println("Percentage of Science Student: " +percentage);
       
       
       
        System.out.println("History Student Information===============");
       
        System.out.println("Enter name");
	    String name1=sc.next();
	    
	    System.out.println("Enter Address");
	    String address1=sc.next();
	    
	    System.out.println("Enter Marks of History");
	    int history=sc.nextInt();
	    
	    System.out.println("EEnter Marks of Civics");
	    int civics=sc.nextInt();
	   
	    HistoryStudent hist=new HistoryStudent(name1,address1,history,civics);
	    System.out.println("Name: "+hist.getName());
        System.out.println("Address: "+hist.getAddress());
        
        System.out.println("History Marks: "+hist.getHistoryMarks());
        System.out.println("Civics marks: "+hist.getCivicsMarks());
        double percentage1= hist.getPercentage();
        System.out.println("Percentage of Science Student: " +percentage1);

	}

}
