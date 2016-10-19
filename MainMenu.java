
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<User> daftarUser = new LinkedList();
        LinkedList<TokoBuku> daftarTokoBuku = new LinkedList();
        String menu = " ";
        
        do {
            System.out.println("E-Bookstore");
            System.out.println("[1] User");
            System.out.println("[2] BookStore Admin");
            System.out.println("[3] Admin");
            System.out.println("[4] Exit");
        } while (!("4").equals(menu));
        
    }
    
}
