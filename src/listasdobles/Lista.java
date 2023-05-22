/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobles;


public class Lista {
    private Node head;
    private Node tail;
    private int size;
    
    public Lista(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getHead()==null;
    
    }
    
    public Node append(int value){
        Node newNode=new Node(value);
        if(isEmpty()){
            setHead(newNode);
            setTail(newNode);
        
        
        }else{
            getTail().setNext(newNode);
            newNode.setPrev(getTail());
            setTail(newNode);
        
        
        }size++;
        
        return newNode;
    
    
    }
    
    public Node deleteEnd(){
        if(size==1){
            setHead(null);
            setTail(null);
            size=0;
            return null;
        
        }else if(isEmpty()){
            return null;
        
        }else{
            Node temp=getTail();
            setTail(getTail().getPrev());
            getTail().setNext(null);
            temp.setPrev(null);
            size--;
            return temp;
        
        
        }
        
    
    
    }
    
    public Node prepend(int value){
        Node newNode=new Node(value);
        if(isEmpty()){
            setHead(newNode);
            setTail(newNode);
            
        }else{
            newNode.setNext(getHead());
            getHead().setPrev(newNode);
            setHead(newNode);
            
        
        
        }size++;
        
        return newNode;
    
    
    }
    
    public void deleteFirst(){
        Node aux=getHead().getNext();
        aux.setPrev(null);
        getHead().setNext(null);
        setHead(aux);
        size--;
        
    
    
    }
    
    public void print(){
        Node aux=getHead();
        while(aux!=null){
            System.out.println(aux.getValue());
            aux=aux.getNext();
        }
        
    
    
    }
    
    public Node get(int index){
        if(index<0 || index>size){
            return null;
        
        
        }else if(index< size/2){
            Node aux=getHead();
            for (int i = 0; i < index; i++) {
                aux=aux.getNext();
                
            }
            return aux;
        
        
        }else{
            Node aux=getTail();
            for (int i = size-1; i > size; i--) {
                aux=aux.getPrev();
                
            }
            return aux;
        
        }
    
    
    }
    
    public void insertInOrder(int value){
    Node newNode = new Node(value);
    if (isEmpty()) {
        setHead(newNode);
        setTail(newNode);
    } else {
        if(value <= getHead().getValue()){
            prepend(value);
        } else if(value >= getTail().getValue()){
            append(value);
        } else {
            Node current = getHead();
            while(current != null && current.getValue() < value){
                current = current.getNext();
            }
            newNode.setNext(current);
            newNode.setPrev(current.getPrev());
            current.getPrev().setNext(newNode);
            current.setPrev(newNode);
            size++;
        }
    }
}

    
    
    
}
