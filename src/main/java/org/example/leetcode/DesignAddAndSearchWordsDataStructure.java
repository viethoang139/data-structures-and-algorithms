package org.example.leetcode;

public class DesignAddAndSearchWordsDataStructure {
    class Node{
        private char value;
        private boolean isWord;
        private Node[] children;
        public Node(char value){
            this.value = value;
            this.isWord = false;
            this.children = new Node[26];
        }
    }
    Node root;
    public DesignAddAndSearchWordsDataStructure() {
        root = new Node('\0');
    }

    public void addWord(String word) {
        Node curr = root;
        for(char item : word.toCharArray()){
            if(curr.children[item - 'a'] == null){
                curr.children[item - 'a'] = new Node(item);
            }
            curr = curr.children[item - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        return searchHelper(word,root,0);
    }

    private boolean searchHelper(String word, Node curr, int index){
        for(int i = index; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == '.'){
                for(Node temp: curr.children){
                    if(temp != null && searchHelper(word,temp,i+1)){
                        return true;
                    }
                }
                return false;
            }
            if(curr.children[ch - 'a'] == null){
                return false;
            }
            curr = curr.children[ch - 'a'];
        }
        return curr.isWord;
    }

}
