
public class Point {
	int x,y;
	public Point()
	{
		System.out.println("welcome");
		x=100;
		y=200;
}
	
	public Point(int x1, int y1)
	{
		System.out.println("welcome to constructor");
		x=x1;
		y=y1;
	}
	public String toString()
	{
		return "x="+x+" "+"y="+y;
	}
	

}
