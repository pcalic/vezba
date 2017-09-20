
public class List {
	public Node head;
	public Node temp; 
	public int size = 0; 
public void add(int data)
	{
		Node temp = new Node(data);
		Node pomocni = head;
		if (head == null){ 
				head = temp;}
		else{
			while(pomocni.next != null) {
			pomocni=pomocni.next; 
			}
			pomocni.next=temp;
		}
		 size++;
			} 

public void remove(int pozicija){
	if (size<=pozicija || pozicija<0){
	System.out.println("Pozicija nije odgovarajuca");
}	else{
	if (pozicija == 0){
		Node n = head;
		head=head.next;
		n.next=null;
}	else{
	Node prethodni = head;
	int brojac = 1;
	while(brojac<pozicija){
		prethodni=prethodni.next;
		brojac++;
}
	Node pomocni = prethodni.next;
	prethodni.next=pomocni.next;
	pomocni.next=null;
	}
		size--;
			}
		}	

public void print(){
	System.out.println("Printing list:Start");
	Node pomocni = head;
	while (pomocni != null){
		System.out.println(pomocni.data);
		pomocni = pomocni.next;	
		}
		System.out.println("Printing list:End");
	}

 
public void add2(int data, int pozicija){
	Node noviNod = new Node(data);
	if (pozicija == 0){
		noviNod.next=head;
		head=noviNod;

}	else {
	Node prethodni = head;
	int brojac = 1;
	while (brojac < pozicija){
		prethodni = prethodni.next;
		brojac++;
}
	Node pomocni=prethodni.next;
	noviNod.next=pomocni;
	prethodni.next=noviNod;

}




}




}




/*public void search(int broj)
{
    Node temp = head;
    for(int t=0; t<size; t++)
    {
        if( temp.data != broj)
        {
            temp = temp.next;
        
        }else{
            a=t;
            break;
        }
           
    }
   
}*/