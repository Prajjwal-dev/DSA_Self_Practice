/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //Base case
        if(head == null) {
            return null;
        }

        //Edge case
        Map<Node, Node> map = new HashMap<>();
        //Step 1: creating new nodes
        Node curr = head;
        while(curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        //Step 2: Assigning next and random pointers
        curr = head;
        while(curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random); 
            curr = curr.next;
        }

        return map.get(head);
    }
}