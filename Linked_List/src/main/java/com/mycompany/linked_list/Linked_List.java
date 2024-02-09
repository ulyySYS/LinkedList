/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linked_list;
import java.util.*;  

/**
 *
 * @author My PC
 */
public class Linked_List {
    Node head = null;
    
    
    public Linked_List(){
        
    }
    
    public void add(int num){
        // Adds new items to the front of the linked list
        
        Node new_node = new Node(num);
        new_node.next = head;
        head = new_node;
    }
    
    
    public boolean isEmpty(){
        //  Checks if the LinkedList is empty
        
        if(head == null){
            return true;
        } else{
            return false;
        }
    }
    
    public void loopThrough(){
        // Loops through the array and prints the data of each Node
        
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            
            current = current.next;
        }
    }
    
    public int size(){
        // Returns the size
        
        int counter = 0;
        Node current = head;
        while(current != null){
            counter++;
            current = current.next;
        }
        
        return counter;
    }
    
    public int searchForKey(int key){
        // Returns the index of the first data that matches the key
        
        Node current = head;
        int counter = 0;
        while(current != null){
            if(current.data == key){
                return counter;
            } 
            
            counter++;
            current = current.next;
        }        
        
        return -1;
    }
    
    public int searchForIndex(int index){
        // Returns the data at the index that's passed in
        Node current = head;
        int counter = 0;
        while(current != null){
            if(counter == index){
                return current.data;
            } 
            
            counter++;
            current = current.next;
        }        
        
        return -1;
    }
    
    public void insertAtIndex(int data,int index){
        //Inserts new data at the index passed in
        
        Node current = head;
        int counter = 0;
        
        while(current != null){
            if(counter == index){
                Node new_node = new Node(data);
                Node prev_node = current;
                Node next_node = current.next;
                
                current.next = new_node;
                new_node.next = next_node;
                
                break;
            }
            counter++;   
            current = current.next;
        }
    }
    
    public Node removeKey(int key){
        // Removes data that matches the ket and returns the node
        
        Node current = head;
        Node prev = null;
        
        while(current != null){
            if(key == current.data && current == head){
                head = current.next;
                break;
            } 
            else if(current.data == key){
                prev.next = current.next;
                break;
            }
            
            prev = current;
            current = current.next;
            
        }
        
        return current;
    }
    
    public Node removeAtIndex(int index){
        // Removes item at index passed in and returns the Node
        int counter = 0;
        Node current = head;
        Node prev = null;
        
        while(current != null){
            if(counter == index && current == head){
                head.next = current.next;
                break;
            } else if(counter == index){
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
            counter++;
        }
        
        
        return current;
    }
    
    
    public void printList(){
        //  Prints the Data of all the list in order in a format
        
        Vector<String> nodes = new Vector<String>();
        Node current = head;
        
        while(current != null){
            if(current == head){
                String data = Integer.toString(current.data);
                nodes.add(String.format("[HEAD: %s]  ->  " , data));
            } 
            else if(current.next == null){
                String data = Integer.toString(current.data);
                nodes.add(String.format("[tail: %s]", data));
            }
            else{
                String data = Integer.toString(current.data);
                nodes.add(String.format("[%s]  ->  ", data));
            }
            
            current = current.next;
        }
        
        
        for(int i = 0; i < nodes.size(); i++){
            System.out.print(nodes.get(i));
        }
        System.out.println();
    }
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Linked_List l = new Linked_List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        
        
        l.printList();
        l.removeAtIndex(4);
        l.loopThrough();
    }
}
