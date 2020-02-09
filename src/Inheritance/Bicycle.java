package Inheritance;

public class Bicycle {
	int Gear;
	int Speed;
	public Bicycle(int Gear,int Speed)
	{
		this.Gear=Gear;
		this.Speed=Speed;
		
	}
	public void ApplyBreak(int Dec)
	{
		Speed-=Dec;
		
	}
	public void IncressSpeed(int Inc)
	{
		Speed+=Inc;
		
	}
	@Override
	public String toString()
	{
		return("No of gaits:"+Gear
				+"\n Spped is:"+Speed);
		
	}

}
