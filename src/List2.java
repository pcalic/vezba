
public class List2 extends List{
	public int minimum = 0;
	public void add(int data){
		Node temp = new Node(data);
		Node pomocni = head;
		 size++;
		if (head==null) {
			head = temp;
			minimum = temp.data;
		}else {
			if (minimum>temp.data){
				minimum=temp.data;
				head=temp;
				head.next=pomocni;
				
			}else {
				Node prethodni=head;
				Node sledeci = head.next; 
				if (sledeci != null){
				while (temp.data>sledeci.data){
					sledeci=sledeci.next;
					prethodni=prethodni.next;
					if (sledeci==null){
						break;
					}
				}
				temp.next=sledeci;
				prethodni.next=temp;
				}else {
				temp.next=sledeci;
				prethodni.next=temp;
				}
			}
			
			
		}
	
		}
public List2 merge(List2 lista){
 
	while (lista.head != null){
		add(lista.head.data);
		lista.head = lista.head.next;
		
		
	}		
return lista; 
} 


public List2 merge2 (List2 lista1, List2 lista2){
	 Node temp = lista1.head;
	 Node r = lista2.head;
	 List2 rez = new List2();
 
		 if (rez.head == null){
			 rez.head = new Node(1);
	 if (temp.data<r.data){
		 rez.head.data = temp.data;
	temp = temp.next; 
	}
	else{
		rez.head.data= r.data;
		r = r.next;
		
	} 
	 
	 } 
		 while (temp.next != null){
	 rez.add(temp.data);
	 	temp=temp.next;}
		 
		 while (r.next != null){
	 rez.add(r.data);
		r=r.next;		 }
		 
		 if (temp  != null)
				rez.add(temp.data);
			if (r != null)
				rez.add(r.data);
 		
			 
	 	return rez;
	}

public List2 TurboMerge (List2 lista1, List2 lista2){
	if (lista1.head == null)
		 return lista2;
	if (lista2.head == null)
		return lista1;
	Node l = lista1.head;
	Node r = lista2.head;
	List2 rez = new List2();
	 
	if (rez.head == null){
		 if (l.data<r.data){
			 rez.head = new Node(l.data);
			 l = l.next;
		 }else
		 		{
			 rez.head = new Node(r.data);
			r = r.next;
		 	}
	 	}
	 
	rez.temp=rez.head; 
	 while (l != null && r != null)
	 { 
		 if(l.data<r.data){
		 rez.temp.next = new Node(l.data);
	 	rez.temp = rez.temp.next;
	 	l = l.next; 
	}
else{
		rez.temp.next = new Node(r.data);
		rez.temp = rez.temp.next;
		r = r.next;
	}
		 if (l == null){
				while(r != null){
					rez.temp.next = new Node(r.data);
					rez.temp = rez.temp.next;
					r = r.next;
				} 
		 }
		 if (r == null){
			 while (l != null){
					rez.temp.next = new Node(l.data);
				 	rez.temp = rez.temp.next;
				 	l = l.next; 
				}
		 }
	 } 
	return rez;
}














}






/*




public List2 TurboMerge (List2 lista1, List2 lista2){
	 if (lista1.head == null)
		 return lista2;
	if (lista2.head == null)
		return lista1;
	Node temp = lista1.head;
	Node r = lista2.head;
	List2 rez = new List2();
	 
	if (rez.head == null){
		 if (temp.data<r.data){
			 rez.head = new Node(temp.data);
			 temp = temp.next;
		 }else
		 		{
			 rez.head = new Node(r.data);
			r = r.next;
		 	}
	 	}
	 
	rez.tail=rez.head; 
	while (temp != null){
		rez.tail.next = new Node(temp.data);
	 	rez.tail = rez.tail.next;
	 	temp = temp.next; 
	}
	while(r != null){
		rez.tail.next = new Node(r.data);
		rez.tail = rez.tail.next;
		r = r.next;
	}

	 
	return rez;
}


*/

/*public List2 merge3 (List2 lista1, List2 lista2){
	 Node temp = lista1.head;
	 Node r = lista2.head;
	 List2 rez = new List2();

		 if (rez.head == null){
			 rez.head = new Node(1);
	 if (temp.data<r.data){
		 rez.head.data = temp.data;
	temp = temp.next; 
	}
	else{
		rez.head.data= r.data;
		r = r.next;
		
	} 
	 
	 } 
		 Node l = rez.head;
		 while (temp.next != null){ 	
				l.next = temp;
				l = l.next;	
				temp = temp.next; 
				}
		 if (temp != null){
			 l.next = temp;
				l = l.next;	
				temp = temp.next;
		 }
		while (r.next != null){
	 
					l.next = r;
					l = l.next;
					r = r.next;
					
				} 

		  
	 	return rez;
}*/

	
/*
}
	 Node l = rez.head;
	 Node pre = rez.head;
	 while (temp.next != null && r.next != null){
	 if (temp.data<r.data){
		  	
			l.next = temp;
			l = pre.next;
			temp = temp.next; 
			}
			else{
 
				l.next = r;
				l = pre.next;
				r = r.next;
				
			} 
	 
	 
	 
	 
	 
	 
}
	 
}	*/ 
















/*public List2 merge2(List2 lista1, List2 lista2){
 
	List2 rez = new List2();
	 if (lista1.head == null)
		 return lista2;
	if (lista2.head == null)
		return lista1;
	
	while (lista1.head != null && lista2.head != null){
	if (rez.head == null){
		 
	if (lista1.head.data>lista2.head.data) {
		 rez.add(lista2.head.data);
		 lista2.head = lista2.head.next;
	 } else {
		 rez.add(lista1.head.data);
		 lista1.head = lista1.head.next; 
	 }

}else{
	 
	if (lista1.head.data>lista2.head.data){
		rez.add(lista2.head.data);
		lista2.head = lista2.head.next;
		
	}else {
		
		rez.add(lista1.head.data);
		lista1.head = lista1.head.next;
	}
	
} }
	if (lista1.head != null)
		rez.add(lista1.head.data);
	if (lista2.head != null)
		rez.add(lista2.head.data);
return rez; */
	
	
	
	
	
	
	
	
	
	
	
	 			
			
/*public void sort() {
int minimum = 0, pozicija = 0, brojac;
Node pointer = head;
Node temp = head;
 
if (head==null) {           
	System.out.println("Lista je prazna");
} 
else { 
	for (int i = 1; i <size;i++) {
		

		minimum = pointer.data;

		while (pointer.next != null) {
			pointer = pointer.next;
			if (pointer.data < minimum) {
				minimum = pointer.data;
				
			}
		}
		System.out.println(minimum);
		search(minimum);
		remove(a);						
		add2(minimum, pozicija);		
		pozicija++;
		 
		pointer=temp;
		 
	}

	System.out.println("Lista je sortirana!");
}
}	*/

	
	
	
	
	
	
	
	
	/*public void sort(){
		 Node sledeci = head;
		 Node prethodni = head.next;
		  while(sledeci.next != null) {
	            while(prethodni.next != null) {
	                if(sledeci.data > prethodni.data) {
	                	temp=sledeci;
	                	sledeci.next = prethodni.next;
	                	prethodni.next=temp;
	                	head=prethodni; 
	                }
	                prethodni= prethodni.next;                		
	}
 sledeci = sledeci.next;
}
		  }*/
	 
 