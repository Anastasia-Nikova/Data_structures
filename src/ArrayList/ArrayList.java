package ArrayList;

public class ArrayList<T> implements List 
{
	private Object[] arr;
	private int count;
	
	public ArrayList()
	{
		arr = new Object[10];
		this.count = 0;
	}
	@Override
	public boolean isEmpty() 
	{
		return count == 0;
	}

	@Override
	public boolean contains(Object item) 
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == item)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public void add(Object item) 
	{
		arrLengthIncrease();
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == null)
			{
				arr[i] = item;
				this.count++;
				break;
			}
		}
		
	}

	@Override
	public void insertAt(Object item, int index) 
	{
		indexException(index);
		
		if(arr[index] == null)
		{
			arr[index] = item;
		}
		for(int i = count; i > index; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[index] = item;
		this.count++;
	}

	@Override
	public void removeFrom(int index) 
	{
		indexException(index);
		arr[index] = null;
		this.count--;
	}

	@Override
	public void remove(Object item) 
	{
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] == item)
			{
				arr[i] = null;
				count--;
			}
		}
	}

	@Override
	public Object get(int index) 
	{
		indexException(index);
		return arr[index];
	}

	@Override
	public void clear() 
	{
		this.count = 0;
	}
	
	private void arrLengthIncrease()
	{	
		if (count == arr.length)
		{
			Object[] clone = arr.clone();
			arr = new Object[count*2];
			for(int i = 0; i < clone.length; i++)
			{
				arr[i] = clone[i];
			}
			
		}
	}
	
	private void indexException(int index)
	{
		if(index < 0 || index > arr.length)
		{
			throw new RuntimeException("Invalid index");
		}
	}
}
