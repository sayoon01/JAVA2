
public class Car {
	String color;
	int gear, speed;
	
	/*Car() {
		color = "null";
		speed = 10;
		gear = 1;
	}*/

	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	void changeGear(int g) 
	{
		gear = g;
	}
	
	void speedUp()
	{
		speed += 10;
	}
	void speedDown()
	{
		speed -= 10;
	}
}
