public class MergeTwoSortedListIterative {

         ListNodeIt mergeTwoLists(ListNodeIt l1, ListNodeIt l2) {
            ListNodeIt head = new ListNodeIt();
            ListNodeIt tail = head;

            while(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    tail.next = l1;
                    l1 = l1.next;
                } else {
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }
            tail.next = l1 == null ? l2 : l1;
            return head.next;
        }

}

class ListNodeIt {
    int val;
    ListNodeIt next;
    ListNodeIt() {}
    ListNodeIt(int val) { this.val = val; }
    ListNodeIt(int val, ListNodeIt next) { this.val = val; this.next = next; }
}

