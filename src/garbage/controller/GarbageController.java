package garbage.controller;

public class GarbageController
{
	private String [] names = {"one", "Two", "Three"};
	private int [] ages;
	
	public GarbageController()
	{
		names = new String[5];
		ages = new int[5];
	}
	public void start()
	{
		System.out.println("This is a garbage project");
		System.out.println("such a waste");
		
		System.out.println(names);
		System.out.println(ages);
		
		names[0] = "My name";
		names[1] = "is Alan";
		names[2] = "Quayd";
		names[3] = "Burr";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		for (String current : names)
		{
			System.out.println(current);
		}
		
		for (int index = 0; index < ages.length; index += 1)
		{
			ages[index] = index + 1;
			
			System.out.println(ages[index]);
		}
		
		names = new String [] {"One", "Two", "Three", "Four", "Five"};
	}
}
