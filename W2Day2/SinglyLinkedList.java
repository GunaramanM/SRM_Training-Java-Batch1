public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; // Can be a generic type
		private ListNode next; // Reference to next ListNode in list

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
    public void display(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
	}



	public boolean find(ListNode head,int searchKey) {
		if(head == null) {
			return false;
		}

		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	

	public static void main(String[] args) {
        
		ListNode head = new ListNode(17);
		ListNode second = new ListNode(42);
		ListNode third = new ListNode(66);
		ListNode fourth = new ListNode(13);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
        SinglyLinkedList A = new SinglyLinkedList();
        A.display(head);

		

        if (A.find(head, 66)) 
        {
            System.out.println("SearchKey found");
        }
        else {
            System.out.println("SearchKey Not found");
        }


    }

}
