public class String_manip
{
public void manip(String s)
{ int chn=0;
    String w=" ";
    s=s.trim();
    
   s=s+" ";
    int l=s.length();
for(int i=0;i<l;i++)
{
    char ch=s.charAt(i);
    w=ch+w;
    if(ch==' ') 
    chn++;
    
}

String ls=s.toLowerCase();
String us=s.toUpperCase();
System.out.println("Reversed String: "+w);
System.out.println("No. of words in string: "+(chn));
System.out.println("In LowerCase: "+ls);
System.out.println("In UpperCase: "+us);
System.out.println("No. of characters in string: "+(l-1));
}
}  
     