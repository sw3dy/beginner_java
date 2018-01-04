import java.io.*;
class employee
{
String name, gen, post;
double sal;
void assign_data(String n, String g, String p, double s)
{
name=n;
gen=g;
post=p;
sal=s;
}
void out_data()
{
System.out.println("Name = "+name+“\nGender= "+gen);
System.out.println("Post = "+post+“\nSalary= "+sal);
}
public static void main(String args[]) throws IOException
{
DataInputStreamin=new DataInputStream(System.in);
System.out.print("Enter number of employees ?");
intne=Integer.parseInt(in.readLine());
employee emp[ ]=new employee[ne];
for(inti=0;i<ne;i++)
{
// reading data in main() method
System.out.print("Enter name....");
String name=in.readLine();
System.out.print("Enter gender....");
String gen=in.readLine();
System.out.print("Enter post....");
String post=in.readLine();
System.out.print("Enter salary....");
double sal=Double.parseDouble(in.readLine());
employee obj= new employee();
obj.assign_data(name, gen, post, sal);
emp[i]=obj;
}
System.out.println("All "+ne+" employee details");
for(inti=0;i<ne;i++)
emp[i].out_data();
}
}
}