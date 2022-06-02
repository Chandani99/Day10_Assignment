package HotelPackage;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if(amount>1000) {
		  Hotel taj=new TajHotel();	
		  return taj;
		}
		else if(amount >200 && amount <1000) {
			Hotel roadSideHotel= new RoadSideHotel();
			return roadSideHotel;
		}
		return null;
	}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter the amount");
	   int rs= sc.nextInt();
	   
	   Demo d=new Demo();
	   Hotel hotel=d.provideFood(rs);
	   
	   if(hotel!=null) {
		   hotel.chickenBiryani();
		   hotel.masalaDosa();
		   if(hotel instanceof TajHotel) {
			   TajHotel th=(TajHotel) hotel;
			   th.welcomeDrink();
		   }
	   }
	   else{
		   System.out.println("Please enter valid amount");
	   }
	   
	}

}
