package LinkedList;

public class LinkedList<T> implements List<T>
{
	private Node<T> firstElement;
	private Node<T> lastElement;
	private int count; 
	
	public LinkedList()
	{
		
	}
	
	@Override
	public boolean isEmpty() 
	{
		return this.count == 0;
	}

	@Override
	public boolean contains(T item) 
	{
		Node<T> currentNode = firstElement;
		
		while (currentNode != null)
		{
			if (currentNode.getNodeValue().equals(item))
			{
				return true;
			}
			currentNode = currentNode.getNextNode();
		}
		return false;
	}

	@Override
	public void add(T item) 
	{
		Node<T> nextNode = new Node<T>(item);
		
		if (this.firstElement == null)
		{
			this.firstElement = nextNode;
			count++;
			this.lastElement = firstElement;
		}
		else 
		{
			lastElement.setNextNode(new Node<T>(item));
			lastElement = nextNode;
			count++;
		}		
	}

	@Override
	public void insertAt(T item, int index)
	{
		
	}

	@Override
	public void removeFrom(int index) 
	{
		
		
	}

	@Override
	public void remove(T item) 
	{

	}

	@Override
	public T get(int index) 
	{
		if (index >= count || index < 0)
		{
			throw new RuntimeException(" Invalid index ");
		}
		
		int currentIndex = 0;
		Node<T> currentNode = firstElement;
		
		while (currentIndex < count)
		{
			if (currentIndex == index)
			{
				return currentNode.getNodeValue();
			}
			currentIndex++;
			currentNode = currentNode.getNextNode();
		}
		return null;
	}
	
	@Override
	public void clear() 
	{
		this.count = 0;
		this.firstElement = null;
		this.lastElement = null;
	}
}
