
public class ComparatorDemo {

}
/*Comparators are used to compare two objects In this challenge you'll create a comparator and use it to sort an array.
The player class is provided for you in your editor.It has 2 fields:a name String and a score integer.

Given an array of n Player objetcs,write a comparator that sorts them in order of decreasing score;if 2 or more players have the same score,sort of these players alphabetically by name.
To do this,you must create a Checker class that implements the Comparator interface,then write an int compare(Player a ,Player b)method implementing the Comparator.compare(T o1,T o2) method.

Input Format
Input from stdin is handled by the locked stub code in the Solution class.
The first line contains an integer,n,denoting the number of players.
Each of the n subsequent lines contains a player's name and score,respectively.


Constraints

0<= Score <=1000
2 players can have the same name
Player names consist of lowercase English letters.

 Sample input
 5
 amy 100
 david 100
 heraldo 50
 aakansha 75
 aleksha 150
 
 Sample Output
 aleksha 150
 amy 100
 david 100
 aakansha 75
 heraldo 50
*/


import java.util.*;

//Player class with name and score fields
class Player {
 String name;
 int score;

 Player(String name, int score) {
     this.name = name;
     this.score = score;
 }
}

//Checker class that implements Comparator interface
class Checker implements Comparator<Player> {
 @Override
 public int compare(Player a, Player b) {
     // Compare by score in descending order
     if (a.score != b.score) {
         return b.score - a.score;
     }
     // If scores are the same, compare by name in alphabetical order
     return a.name.compareTo(b.name);
 }
}

public class Solution {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     scanner.nextLine(); // Consume the newline character

     Player[] players = new Player[n];
     for (int i = 0; i < n; i++) {
         String name = scanner.next();
         int score = scanner.nextInt();
         players[i] = new Player(name, score);
     }

     // Sort the players using the Checker comparator
     Arrays.sort(players, new Checker());

     // Print the sorted players
     for (Player player : players) {
         System.out.println(player.name + " " + player.score);
     }
 }
}
