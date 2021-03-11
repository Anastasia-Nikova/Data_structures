package LinkedList;

public class Node<T> 
{
	private Node<T> nextNode;
	private T value;
	
	public Node()
	{
		this.setNextNode(null);
		this.setNodeValue(null);
	}
	
	public Node(T value)
	{
		this.setNodeValue(value);
	}
	
	public Node(T value, Node <T> nextNode) 
	{
		this.setNextNode(nextNode);
		this.setNodeValue(value);
	}
	
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode = nextNode;
	}
	
	public void setNodeValue(T value)
	{
		this.value = value;
	}
	
	public Node<T> getNextNode()
	{
		return this.nextNode;
	}
	
	public T getNodeValue()
	{
		return this.value;
	}
}
