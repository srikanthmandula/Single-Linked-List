class Node
{
    private Object element;
    Node next=null;
    
    Node(Object element,Node next){
        this.element=element;
        this.next=next;
    }
    
    
    void setElement(Object element)
    {
        this.element=element;
    }
    
    void setNext(Node next)
    {
        this.next=next;
    }
    Object getElement(){
        return this.element;
    }
    
    Node getNext()
    {
        return this.next;
    }
}

public class SLL {

    
     private Node head;
    
    SLL()
    {
        head=null;
    }
    
    
     Node getHead()
    {
        
      return head;
        
    }
    void setHead(Node head)
    {
        
       this.head=head;
        
    }
    
    void print(){
        Node current=head;
        while(current !=null)
        {
            System.out.println(current.getElement());
            current=current.getNext();
        }
    }
    
    
    void add( Node next)
    {
        
        if(head==null)
            head=next;
        else
        {
            Node current=head;
            while(current.getNext() !=null)
            {
             current=current.getNext();   
            }
            
            current.setNext(next);
        }
        
    }
    
     void remove()
    {
         Node current=head;
         Node Currprev=null;
            while(current.getNext() !=null)
            {
                Currprev=current;
             current=current.getNext();   
            }
        Currprev.setNext(null);
    }
    
     
    void reverse()
    {
		int len=0;
		
		Node cur=head;
		while(cur !=null)
		{
			len++;
			cur=cur.next;
		}
		
		
		Node prev_items[]=new Node[len];
	
		
		
		Node current=head;
		int j=0;
		
		while(current!=null)
		{
			prev_items[j]=current;
			j++;
			current=current.getNext();
		}
	
		head=prev_items[len-1];
		head.next=prev_items[len-2];
		for(int i=len-2;i>=1;i--)
		{
			prev_items[i].next=prev_items[i-1];
			
		}
		prev_items[0].next=null;
		
		
    }
	
	void middleElement()
	{
		Node current=head;
		int n=0;
		while(current!=null)// To find the number of nodes in the list
		{
			n++;
			current=current.getNext();
		}
		
		if(n==0) // if list is empty
		{
			
			System.out.print("List is empty");
			
		}
		
		if(n%2!=0) // if list has odd number of nodes
		{
			n=(n+1)/2; //required nth node in the list
			current=head;
			int ret=0;
			while(current!=null)
			{
				ret++;
				if(n==ret)
				{
					System.out.print(current.getElement());
				}
				else
				{
				current=current.getNext();	
				}
			}
			
		}
		
		else // if list has even number of nodes
		{
			n=n/2; //the nrequried nth node in the list
			current=head;
			int ret=0;
			while(current!=null)
			{
				ret++;
				if(n==ret)
				{
					System.out.print(current.getElement());
				}
				else
				{
				current=current.getNext();	
				}
			}
			
		}
	
	}
    
    public static void main(String[] args) {
                
         Node a=new Node("abc", null);
         Node b=new Node(2, null);
         Node c=new Node(3, null);
         Node e=new Node(78,null);
         Node f=new Node(588,null);
		 Node g=new Node(8,null);
		 Node h=new Node(37,null);
             
             
             SLL s=new SLL();
             s.setHead(a);
             s.add(b);
             s.add(c);
             s.add(e);
             s.add(f);
			 s.add(g);
			 s.add(h);
           
             System.out.println(" List :");
			 s.print();
             
             s.remove();
             System.out.println(" List -After removing the last element :");
             s.print();
			 
			 s.remove();
             System.out.println(" List -After removing the last element :");
             s.print();
			 
			 s.remove();
             System.out.println(" List -After removing the last element :");
             s.print();
			 
			 System.out.println("Adding again the removed elements to list");
			 
             s.add(h);
             s.add(f);
			 s.add(g);
			 
			 System.out.println("List after adding back all the elements:");
			 s.print();
			 
			 System.out.println("List after reversing the elements:");
			 s.reverse();
			 s.print();
			 System.out.println("Middle element in the list is:");
			 s.middleElement();
						 
    }
    
}
