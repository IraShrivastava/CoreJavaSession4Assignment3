package assignment4;	//package declaration
class Figure
{
    final int length = 5;	//final integer variable length whose value cannot be changed
    final int breadth = 4;	//final integer variable breadth whose value cannot be changed
    final void area()		// final method which can't be overridden
    {
        int a = length * breadth;
        System.out.println("Area:"+a);
    }
}
class Rectangle extends Figure
{
    final void rect()		//final method which cannot be overridden
    {
        System.out.println("This is rectangle");
    }
}
final public class Assignment4_3 extends Rectangle 	//final class that cannot be inherited
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_3 obj = new Assignment4_3();	//reference and object of Assignment4_3 class
        obj.rect();		//invoking rect method of class Rectangle
        obj.area();		//invoking area method of class Figure
	}

}
