public class initiativeList {
    private Node head, tail, current;
    private int nodeCount;

    // the list constructor
    public initiativeList() {
        head = null;
        tail = null;
        nodeCount = 0;
    }

    // returns the size of the list
    public int listSize() {
        return nodeCount;
    }

    // adds players in an unsorted list
    public void listAdd(Player player) {
        Node node = new Node(player);

        if (head == null) {
            head = node;
            tail = node;
            nodeCount++;
        } else {
            current = tail;
            current.next = node;
            node = tail;
            node.prev = current;
            nodeCount++;
        }
    }

    public void swap(Player player1, Player player2) {
        // If players are the same, change nothing
        if (player1 != player2) {
            Node cur = this.head;
            Node node1, node2, temp;
            for (int i = 0; i < this.nodeCount; i++) {
                if (cur.player == player1) {
                    node1 = cur;
                } else if (cur.player == player2) {
                    node2 = cur;
                }
                cur = cur.next;
            }
            temp = node1;
            node1.player = node2.player;
            node2.player = temp.player;
        }
    }

    // the node class
    private class Node {
        public Node next, prev;
        public Player player;
        public int index = 0;

        public Node(Player player) {
            this.player = player;
            next = null;
            prev = null;
        }
    }
}
