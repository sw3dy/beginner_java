import java.util.*;
class q8a
{int regNumber,testMarks;
	void setRegTestMarks(int r,int t)
	{
		regNumber=r;
		testMarks=t;
	}
	void displayDetails(){System.out.println("Registration Number: "+regNumber);
    System.out.println("Test Marks :"+testMarks);
      
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int t=sc.nextInt();
		q8a ob=new q8a();
		ob.setRegTestMarks(r,t);
		ob.displayDetails();

	}
}