import java.util.HashMap;
import java.util.Map;

class LFUCache {
    
    // Node structure to represent a cache entry
    class Node {
        int key, value, freq;
        Node prev, next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1; // Newly inserted elements start with a frequency of 1
        }
    }
    
    // Doubly Linked List representation for keys sharing the same frequency
    class DoublyLinkedList {
        Node head, tail;
        int size;
        
        DoublyLinkedList() {
            head = new Node(-1, -1);
            tail = new Node(-1, -1);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
        
        // Add a node to the tail of the list (Most Recently Used position)
        void addNode(Node node) {
            Node tailPrev = tail.prev;
            tailPrev.next = node;
            node.prev = tailPrev;
            node.next = tail;
            tail.prev = node;
            size++;
        }
        
        // Remove an arbitrary node from the list
        void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }
        
        // Remove and return the oldest node from the head (Least Recently Used position)
        Node removeHead() {
            if (size == 0) return null;
            Node lruNode = head.next;
            removeNode(lruNode);
            return lruNode;
        }
    }

    private final int capacity;
    private int curSize;
    private int minFreq;
    private final Map<Integer, Node> cache;
    private final Map<Integer, DoublyLinkedList> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.curSize = 0;
        this.minFreq = 0;
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key);
        updateFrequency(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (capacity == 0) return;
        
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            // Evict if cache is at maximum capacity
            if (curSize == capacity) {
                DoublyLinkedList minFreqList = freqMap.get(minFreq);
               
