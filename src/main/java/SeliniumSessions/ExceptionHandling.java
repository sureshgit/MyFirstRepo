package SeliniumSessions;

public class ExceptionHandling {

String name;
String address;
int number;


public ExceptionHandling()
{

}


@Override
public String toString() {
	return "ExceptionHandling [name=" + name + ", address=" + address + ", number=" + number + "]";
}


public ExceptionHandling(String name, String address, int number) {
	super();
	this.name = name;
	this.address = address;
	this.number = number;
}
public static  void main(String[]args)
{
	ExceptionHandling e=new ExceptionHandling("maveen" ,"java", 10);
	//System.out.println(e.toString());
	System.out.println(e.name);
}


}
