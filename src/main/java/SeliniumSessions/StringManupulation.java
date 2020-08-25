package SeliniumSessions;

public class StringManupulation {

	public static void main(String[] args) {
	
		String s="Iahmaha happy with selinium";
		System.out.println(s.length());
		System.out.println(s.charAt(11));
		//System.out.println(course.charAt(49));java.lang.StringIndexOutOfBoundsException
		System.out.println(s.indexOf("Iam"));
		//System.out.println(s.indexOf(""));
		
		String msg="welcome null"; //controll will search for admin ,but when admin is not there then index will be -1
		if(msg.indexOf("admin")>0)
		{
			System.out.println("is there");
		}
		else
		{
			System.out.println("not thre");
		}
		
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf("h", 3)); //2nd occurance of h
		System.out.println(s.indexOf("a")+4);
		System.out.println(s.charAt(4));
		
		String s1="suresh from selinium";
		String s2="Suresh from selinium";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//trim()
		String p="   hema sri  ";
		System.out.println(p.trim());//will remove the string from begining of the string endng of the string 
		
		System.out.println(p.trim().replace(" ", ""));//trim will remove the space first and last replace will remove the space between string like hema and sri 

String date="15/06/1990";
System.out.println(date.replace("/", "-"));

String test="This is selinium";
System.out.println(test.toLowerCase());
System.out.println(test.toUpperCase());

//Substring

String test1="suresh id is 293028302";
System.out.println(test1.substring(6));//id is 293028302
System.out.println(test1.substring(0, 21));//suresh id is 29302830

//split

String data="Tom;25;male;1000;USA";
String datavalue[]=data.split(";");
System.out.println(datavalue[0]);

for(int i=0;i<datavalue.length;i++)
{
	System.out.println(datavalue[i]);
}


				
		
	}

}
