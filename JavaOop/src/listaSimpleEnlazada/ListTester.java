package listaSimpleEnlazada;

public class ListTester {

	public static void main(String[] args) {
		
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(3); 
        sll.add(4); //ELIMINA
        sll.add(5); // ELIMINA
        sll.add(50);
        sll.add(4);
        sll.add(10); 
        sll.add(5); 
        sll.add(20);
        sll.add(15); // NO ELIMINA
        sll.add(2); //NO ELIMINA
        
        sll.remove();
        sll.remove();

        sll.printValues();
        

	}

}
