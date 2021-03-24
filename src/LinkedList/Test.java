package LinkedList;

public class Test 
{

	public static void main(String[] args) 
	{
		List arr = new LinkedList<Integer>(); 
		arr.add(2);
		arr.add(4);
		arr.add(6);
		System.out.println(arr.isEmpty());
		arr.removeFrom(0);
		System.out.println(arr.contains(2));
		System.out.println(arr.isEmpty());
		System.out.println(arr.get(0));
	}

}
