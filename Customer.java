package Assignment6;

public class Customer {
String name;
boolean member=false;
String memberType;

public Customer() {
	// TODO Auto-generated constructor stub
}
public Customer(String name) {
	this.name=name;
}

public boolean isMember() {
	if(memberType.equals("Premium")) {
		member=true;
	}
	else if(memberType.equals("Gold")) {
		member=true;
	}
	else if(memberType.equals("Silver")) {
		member=true;
	}
	return member;
}
public String toString() {
	String str="Name:" + name + "\n" +"MemberType:" + memberType;
	return str;
}
}
