public class LinkedList {
 
 public static void main(String[] args){
	List lista = new List();
	lista.add(4);
	lista.add(45);
	lista.add(29);
	 List2 list = new List2();
	 List2 list2 = new List2();
	 int x=1;
	 while (x<5){
		 list.add(x);
		 
		 x++;	 
	 }
	 while (x<10){
		 list2.add(x);
		 x++;
	 }
	 
	 
	 

 long startTime = System.nanoTime();
  List2 lista3 = list.TurboMerge(list, list2);
 long endTime = System.nanoTime();
 long duration = (endTime - startTime); 
 lista3.print();
 
	list.print();
	list2.print();

 System.out.println(duration/1000000 + " milliseconds");
 
 }
}