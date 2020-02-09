package Inheritance;

public class MountainBike extends Bicycle {
	int SeatHight;
	public MountainBike(int Gear,int Speed,int SeatHight)
	{
		super(Gear,Speed);
		this.SeatHight=SeatHight;
		
	}
	public void SeatHight(int newValue)
	{
		SeatHight=newValue;
		
	}
	
	@Override
	public String toString()
	{
		return (super.toString()+ 
                "\nseat height is "+SeatHight); 
		
	}

}
