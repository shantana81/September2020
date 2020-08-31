package exam;

public class TestPhone {
	public static void main (String[]args) {
IPhone1 myobj=new IPhone1 ();
AppleWatch myobj1=new AppleWatch(){
	
	
	@Override
	public void AppleWatchInfo() {
		
	}
};

myobj.regularClassInfo();
myobj.battery();
myobj.call();
myobj.camera();
myobj.message();
myobj.wireless();
myobj1.AppleWatchInfo();


myobj.setprice(750);
myobj.setuser('F');
myobj.setinfo("I bought this phone in 2000");
myobj.setmadeinusa(false);

System.out.println(myobj.getinfo()+", the price was "+myobj.getprice()+" user's sex:"+myobj.getuser()+" and boolean value for made in USA is :"+myobj.getmadeinusa());


Iphone2 myobj3=new Iphone2 ();
Iphone3 myobj4=new Iphone3();
Iphone4 myobj5=new Iphone4();
Iphone5 myobj7=new Iphone5();
Iphone6 myobj6=new Iphone6();
myobj3.camera();
myobj4.map();
myobj5.photos();
myobj7.youtube();
myobj6.facetime();

myobj6.materials(100,200);
myobj6.materials("computer", 300, 400 );

ConfiguredIPhone6 myobj11=new ConfiguredIPhone6();
myobj11.materials(400,500);
myobj11.materials("laptop",600,700);

myobj3.Iphone2info();



































}

	
	
	
}