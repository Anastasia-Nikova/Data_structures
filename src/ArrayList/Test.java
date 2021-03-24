package ArrayList;

public class Test 
{

	public static void main(String[] args) 
	{
		List arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(5);
		System.out.println(arr.isEmpty());
		System.out.println(arr.contains(10));
		arr.insertAt(10, 1);
		System.out.println(arr.contains(10));
		
	}

}
