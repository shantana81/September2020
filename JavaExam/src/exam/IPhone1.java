package exam;

public class IPhone1 implements phone {
	public void regularClassInfo() {
		System.out.println("everything in java is associated with classes");
		System.out.println("a class is a blue for creating an object and an abstract class can not be instantiated and an interface is a type of an abstract class");
		
	}

	@Override
	public void interfaceinfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wireless() {
		// TODO Auto-generated method stub
		
	}
AppleWatch myobj=new AppleWatch () {
	
	
	@Override
	public void AppleWatchInfo() {
		
	}
};
private int price;
private String info;
private char user;
private boolean madeinusa;
public int getprice() {
	return price;
	
}
public void setprice(int tax) {
this.price=tax	;
}
	public String getinfo() {
	return info;
		
	}
public void setinfo(String country) {	
	this.info=country;
}
public char getuser() {
	return user;
}
public void setuser(char info) {
	this.user=info;
}
public boolean  getmadeinusa() {
	return madeinusa;
}
public void setmadeinusa(boolean x) {
	this.madeinusa=x;
}	
public IPhone1() {

}
public IPhone1(int tax, String country, char gender, boolean x) {
	price=tax;
	info=country;
	user=gender;
	madeinusa=x;
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	






	}


