package oop_practical;
class Boxnew{
	double width;
	double height;
	double depth;
	
	Boxnew(){
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	double volume () {
		return width * height * depth;
		
	}
}
public class DefaultConstructor {
public static void main(String args[]) {
	Boxnew mybox1 = new Boxnew();
	Boxnew mybox2 = new Boxnew();
	double vol;
	
	vol = mybox1.volume();
	System.out.println("Volume is " + vol);
	
	vol = mybox2.volume();
	System.out.println("Volume is " + vol);
}
}
