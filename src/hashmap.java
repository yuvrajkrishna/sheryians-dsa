public class hashmap{
    static void main() {
        hmap<String,Integer> map = new hmap<>();
        map.put("India",10);
        map.put("USA",20);
        map.put("China",30);
    }
}

class hmap<K,V>{
    private int N = 4;
    private int n = 0;
    LinkedList<K,V>[] buckets =  new LinkedList[N];
//    put
    private int hash(K key){
        return Math.floorMod(key.hashCode(), N);
    }
    private int searchinLL(int bi,K key){
        LinkedList<K,V> node = buckets[bi];
        if(node == null){
            return -1;
        }
        return node.get(key);
    }
    public void put(K key, V value){
        int bi = hash(key);
        int di = searchinLL(bi,key);
        if(di == -1){
            if (buckets[bi] == null) {
                buckets[bi] = new LinkedList<>();
            }

            buckets[bi].add(key, value);
            n++;
        }
        else{
            buckets[bi].update(key,value);
        }

    }
//    get
//    contains
}

class LinkedList<K,V>{
    Node<K,V> head;
    Node<K,V> tail;
    public LinkedList(){
        head = null;
        tail = null;
    }
    public void add(K key,V value){
        Node<K,V> newNode = new Node<>(key,value);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public int get(K key){
        Node<K,V> temp = head;
        int count = 1;
        while(temp != null){
            if(temp.key.equals(key)){
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    public void remove(K key){
        if(head == null){
            System.out.println("Nothing to remove");
            return;
        }
        else if(head.key.equals(key)){
            System.out.println(head.key +"is removed");
            head = head.next;
        }
        else{
            Node<K,V> temp = head.next;
            Node<K,V> prev = head;
            while(temp != null){
                if(temp.key.equals(key)){
                    System.out.println(temp.key +"is removed");
                    prev.next = temp.next;
                }
        }
            if(temp == null){
            System.out.println("Value does not exist");}
        }
    }

    public void print(){
        if(head == null){
            System.out.println("Nothing to print");
        }
        else {
            Node<K,V> temp = head;
            while(temp != null){
                System.out.print(temp.key+": "+temp.value+"\n");
                temp = temp.next;
            }
        }
    }

    public void update(K key,V value){
        Node<K,V> temp = head;
        while(temp != null){
            if(temp.key.equals(key)){
                temp.value=value;
                return;
            }
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Nothing to update");
        }
    }
}

class Node<K,V>{
    K key;
    V value;
    Node next;
    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}