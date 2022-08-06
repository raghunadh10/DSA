package mywork;

import java.util.HashSet;

public class LinkedList {

	
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}

		
	}
	
	public void display() {
		ListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public void insertNodeAtBeginning() {
		ListNode newnode=new ListNode(100);
		newnode.next=head;
		head=newnode;
		
	}
	
	public void insertNodeAtLast() {
		ListNode temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		ListNode newnode= new ListNode(200);
		temp.next=newnode;
		
		
	}
	
	public void insertAtPosition(int position) {
		if(position==1) {
			ListNode newnode=new ListNode(500);
			newnode.next=head;
			head=newnode;
		}
		else {
			ListNode prevNode=head;
			int count=1;
			
			while(count!=position-1) {
				prevNode=prevNode.next;
				count+=1;
			}
			ListNode newnode=new ListNode(500);
			ListNode current=prevNode.next;
			prevNode.next=newnode;
			newnode.next=current;
		}
	}
	
	public void deleteFirstNode() {
		head=head.next;
	}
	
	public void deleteLastNode() {
		ListNode current=head;
		while(current!=null) {
			if(current.next.next==null) {
				current.next=null;
				break;
				
			}
			else {
			current=current.next;
			}
		}
		
		
	}
	public void deleteAtPosition(int position) {
		if(position==1) {
			head=head.next;
		}
		else {
			ListNode prevNode=head;
			int count=1;
			
			while(count!=position-1) {
				prevNode=prevNode.next;
				count+=1;
			}
			ListNode current=prevNode.next;
			prevNode.next=current.next;
		}
	}
	
	public void reverseLinkedList() {
		ListNode prevNode=null;
		ListNode current=head;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=prevNode;
			prevNode=current;
			current=next;
		}
		head=prevNode;
		
	}
	
	public int findMiddleNodeData() {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	public void removeDuplicateLinkedList() {
		ListNode prev=head;
		ListNode current=head.next;
		while(current!=null) {
			if (current.data!=prev.data) {
				prev.next=current;
				prev=prev.next;
				current=current.next;
			}
			else {
				current=current.next;
				
			}
			
		}
		prev.next=current;
	}
	public void sorted(LinkedList obj1) {
		ListNode prev1=null;
		ListNode current1=head;
		ListNode current2=obj1.head;
		ListNode future =null;
		while(current1!=null) {
			if(current1.data>current2.data) {
				prev1.next=current2;
				future=current2.next;
				current2.next=current1;
				current2=future;
			}
			else {
				prev1=current1;
				current1=current1.next;
			}
			
		}
		prev1.next=current2;
	}
	
	
	
	public void removeDuplicatesUnsorted() {
		HashSet<Integer> data = new HashSet<>();
		ListNode current=head;
		ListNode prev=null;
	
		while(current!=null) {
			if(data.contains(current.data)) {
				current=current.next;
				prev=current;
			}
			else {
				data.add(current.data);
				current=current.next;
				prev=current;
			}
			
		}
	}
	
	public void addTwoNumbers(LinkedList obj1) {
		ListNode node1=head;
		ListNode node2=obj1.head;
	
		ListNode dummy=new ListNode(0);
		ListNode node3=dummy;
		int sum;
		int extra=0;
		while(node1!=null) {
			sum=node1.data+node2.data+extra;
			//System.out.println(sum);
			if(sum>9) {
				
				extra=sum/10;
				sum=sum%10;
			}
			
			node3.next=new ListNode(sum);
			//System.out.println(node1.data+" "+node2.data);
			node1=node1.next;
			node2=node2.next;
			node3=node3.next;
			
			
		}
		dummy=dummy.next;
		while(dummy!=null) {
			System.out.println(dummy.data);
			dummy=dummy.next;
		}
		
	}
	public int length() {
		if(head==null) {
			return 0;
		}
		ListNode current=head;
		int count=0;
		while(current!=null) {
			count+=1;
			current=current.next;
		}
		return count;
	}
	public  static void main(String args[]) {
		LinkedList obj=new LinkedList();
		
		obj.head= new ListNode(1);
		ListNode first=new ListNode(2);
		ListNode second=new ListNode(9);
		ListNode third=new ListNode(7);
		ListNode fourth=new ListNode(5);
		
		obj.head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=null;
		
		LinkedList obj1=new LinkedList();
		
		obj1.head= new ListNode(2);
		ListNode first1=new ListNode(3);
		ListNode second1=new ListNode(1);
		ListNode third1=new ListNode(2);
		ListNode fourth1=new ListNode(3);
		
		obj1.head.next=first1;
		first1.next=second1;
		second1.next=third1;
		third1.next=fourth1;
		fourth1.next=null;
		
		obj.display();
		
		System.out.println("The length of the linked list is "+obj.length());
		System.out.println("Inserting node at the beginning: ");
		obj.insertNodeAtBeginning();
		obj.display();
		System.out.println("Inserting node at the last: ");
		obj.insertNodeAtLast();
		obj.display();
		System.out.println("Inserting node at given position: ");
		obj.insertAtPosition(5);
		obj.display();
		System.out.println("Deleting node at first position: ");
		obj.deleteFirstNode();
		obj.display();
		System.out.println("Deleting node at last position: ");
		obj.deleteLastNode();
		obj.display();
		System.out.println("Deleting node at given position: ");
		obj.deleteAtPosition(4);
		obj.display();
//		System.out.println("Reverse a linked list: ");
//		obj.reverseLinkedList();
//		obj.display();
		System.out.println("Data of middle node is "+obj.findMiddleNodeData());
		
		obj.removeDuplicateLinkedList();
		obj.display();
//		System.out.println("---------");
//		obj.sorted(obj1);
//		obj.display();
		System.out.println("---------");
		obj.removeDuplicatesUnsorted();
		obj.display();
		System.out.println("=========");
		obj.addTwoNumbers(obj1);
	}
	
	

}


