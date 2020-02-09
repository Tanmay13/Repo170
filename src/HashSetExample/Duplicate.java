package HashSetExample;

import java.util.HashSet;

public class Duplicate {
	public static void main(String[] args) {
		
		int [] x={1,2,4,3,4,5,6,7,8,11,5,11};
		HashSet<Integer>hs=new HashSet<Integer>();
		for(Integer XX:x)
		{
			if(hs.add(XX))
			{
				continue;
				
			}
			else
			{
				
				System.out.println("Duplicate number is"+XX);
			}
			
			
			
		}
		
		
	}

}
