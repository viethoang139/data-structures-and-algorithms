package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;
public class ImplementTriePrefixTree {
    // solution 1
//    private Map<String,String> map;
//    public ImplementTriePrefixTree() {
//        map = new HashMap<>();
//    }
//
//    public void insert(String word) {
//        map.put(word,word);
//    }
//
//    public boolean search(String word) {
//        if(map.containsKey(word)){
//            return true;
//        }
//        return false;
//    }
//
//    public boolean startsWith(String prefix) {
//        for(String key: map.keySet()){
//            if(key.startsWith(prefix)){
//                return true;
//            }
//        }
//        return false;
//    }
    // solution 2
    class Node{
        private char value;
        private boolean isWord;
        private Node[]children;

        public Node(char val){
            this.value = val;
            this.isWord = false;
            this.children = new Node[26];
        }
    }

    Node root;

    public ImplementTriePrefixTree(){
        root = new Node('\0');
    }

    public void insert(String word){
        Node curr = root;
        for(char item : word.toCharArray()){
            if(curr.children[item - 'a'] == null){
                curr.children[item - 'a'] = new Node(item);
            }
            curr = curr.children[item - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word){
        Node res = getLast(word);
        if(res != null && res.isWord) {
            return true;
        }
        return false;
    }

    private Node getLast(String word) {
        Node curr = root;
        for(char item : word.toCharArray()){
            if(curr.children[item - 'a'] == null){
                return null;
            }
            curr = curr.children[item - 'a'];
        }
        return curr;
    }

    public boolean startsWith(String prefix){
        Node res = getLast(prefix);
        if(res != null){
            return true;
        }
        return false;
    }


}
