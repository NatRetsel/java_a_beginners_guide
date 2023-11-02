/*
 * In try This 13-1, you created a generic queue class. Can this class be used to store record object without any changes?
 * If so, demonstrate its use to strore the Item records used in the Item record examples
 */
record Item(String name, int itemNum, double price){}

class RecordQDemo {
    public static void main(String[] args) {
        // create a queue for Item records.
        Item[] items = new Item[4];
        // Initialize an empty queue of size items.
        GenQueue<Item> q = new GenQueue<Item>(items);

        // Populate items
        items[0] = new Item("Car", 11, 69.0);
        items[1] = new Item("Van", 12, 67.0);
        items[2] = new Item("Lorry", 13, 68.0);
        items[3] = new Item("Plane", 14, 66.0);

        // Add into queue
        try {
            for(int i=0; i<items.length; i++) {
                q.put(items[i]);
            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        // Retrieve
        try {
            Item r;
            for(int i=0; i<items.length; i++) {
                r = q.get();
                System.out.println(r.name() + ", Item number " + r.itemNum() + ", Price: " +r.price());
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();


    }
}