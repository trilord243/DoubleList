/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasdobles;

/**
 *
 * @author Escal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista newList=new Lista();
       
       newList.append(5);
       newList.append(6);
       newList.append(7);
       newList.prepend(0);
       newList.prepend(0);
       newList.prepend(0);
       //newList.deleteFirst();
       //newList.deleteFirst();
        System.out.println(newList.get(4).value);
       //newList.print();
       
    }
    
}
