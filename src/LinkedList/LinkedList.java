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
		this.Exception(index);
		
		Node<T> newNode = new Node<T>(item);
		
		if (count == index + 1)
		{
			lastElement.setNextNode(newNode);
			lastElement = newNode;
			count++;
		}
		if (index == 0)
		{
			newNode.setNextNode(firstElement);
			firstElement = newNode;
			count++;
		}
		else
		{
			int currentIndex = 0;
			Node<T>previousNode = firstElement;
			while( currentIndex < index)
			{
				if(index - 1 == currentIndex)
				{
					Node<T>nextNode = previousNode.getNextNode();
					previousNode.setNextNode(newNode);
					newNode.setNextNode(nextNode);
					count++;
				}
				previousNode = previousNode.getNextNode();
				currentIndex++;
			}
		}
	}

	@Override
	public void removeFrom(int index) 
	{
		this.Exception(index);
		if (index == 0)
		{
			firstElement = firstElement.getNextNode();
			this.count--;
		}
		else
		{
			Node<T> current = firstElement;
			int i = 0 ;
			while( i < index - 1)
			{
				current = current.getNextNode();
				i++;
			}
			Node<T> previous = current;
			current = current.getNextNode();
			previous.setNextNode(current);
			this.count--;
		}
		
	}

	@Override
	public void remove(T item) 
	{
		Node<T> current = firstElement;
		if (firstElement.getNodeValue() == item)
		{
			firstElement = firstElement.getNextNode();
			this.count--;
		}
		while(current.getNextNode() != null)
		{
			Node<T> next = current.getNextNode();
			if(next.getNodeValue().equals(item))
			{
				current.setNextNode(next.getNextNode());
				count--;
			}
		}
	}

	@Override
	public T get(int index) 
	{

		this.Exception(index);
		
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
	
	private void Exception(int index)
	{
		if (index >= count || index < 0)
		{
			throw new RuntimeException(" Invalid index ");
		}
	}
}
