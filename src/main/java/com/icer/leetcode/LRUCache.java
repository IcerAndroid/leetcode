package com.icer.leetcode;

import java.util.HashMap;

public class LRUCache {


    DoubleList doubleList;
    int cap;


    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).value;
        put(key, val);
        return val;
    }

    private HashMap<Integer, Node> map;

    public void put(int key, int value) {
        Node node = new Node(key, value);
        if (map.containsKey(key)) {
            doubleList.remove(node);
            doubleList.addFirst(node);
        } else {
            if (doubleList.size() == cap) {
                Node last = doubleList.removeLast();
                map.remove(last.key);
            } else {
                doubleList.addFirst(node);
                map.put(node.key, node);
            }
        }

    }

    class Node {
        Node pre;
        Node next;
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class DoubleList {
        private Node head;
        private Node tail;
        private int size;

        public DoubleList() {
            this.head = new Node(0, 0);
            this.tail = new Node(0, 0);
            head.next = tail;
            tail.pre = head;
            this.size = 0;
        }

        void addFirst(Node node) {
            node.next = head.next;
            node.pre = head;
            head.next.pre = node;
            head.next = node;
            size++;
        }

        void remove(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
            size--;
        }

        Node removeLast() {
            if (tail.pre == head) {
                return null;
            }
            Node last = tail.pre;
            remove(last);
            return last;
        }

        int size() {
            return size;
        }

    }
}
