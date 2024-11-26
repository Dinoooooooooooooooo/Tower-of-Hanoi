/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package towerofhanoi;

/**
 *
 * @author Owner
 */
public class TowerofHanoi {

   
    public static int moveDisks(int n, char fromPole, char toPole, char auxPole) {
      
        if (n == 1) {
           
            //System.out.println("Move disk 1 from " + fromPole + " to " + toPole);
            return 1;  // Return 1 move
        }                
        int moves = moveDisks(n - 1, fromPole, auxPole, toPole);               
        //System.out.println("Move disk " + n + " from " + fromPole + " to " + toPole);
        moves += 1;        
        moves += moveDisks(n - 1, auxPole, toPole, fromPole);
        return moves;  
    }

    public static void main(String[] args) {
        int n = 29;        
        int totalMoves = moveDisks(n, 'A', 'C', 'B');               
        System.out.println("It will take " + totalMoves + " moves to transfer " + n + " disks from pole A to pole C.");
        long seconds = totalMoves;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;       
        System.out.println("This will take approximately " + years + " years if you move one disk per second.");
    }
}
