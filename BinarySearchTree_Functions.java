package com.BinarySearchTree_DS;

public class BinarySearchTree_Functions {
	
	Node Root;
	
	
public void PrintOrder() {
	Inorder(Root);
}

	public Node insertElements(Node Root,int Data) {
		
	if(Root== null)	{
		Node newnode = new Node(Data);
		Root = newnode;	
		return Root;
		
	}Node newnode = new Node(Data);
	if (newnode.compareTo(Root)>0) {
		Root.RightNode=insertElements(Root.RightNode, Data);
	}else 
		if(newnode.compareTo(Root)<0) {
			Root.LeftNode=insertElements(Root.LeftNode, Data);
		}
	this.Root=Root;
	return Root;
		
	}
	
	public void Inorder(Node node) {
		if (node==null) {
			return;
		}
		Inorder(node.RightNode);
		System.out.println(node.Data);
		Inorder(node.LeftNode);
		
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree_Functions newlist = new BinarySearchTree_Functions();
		Node Root = newlist.insertElements(null, 56); 
		Node secondnode = newlist.insertElements(Root, 30);
	    Node thirdnode = newlist.insertElements(secondnode, 70);
	    
		System.out.println();
		newlist.PrintOrder();
	}
	

}
