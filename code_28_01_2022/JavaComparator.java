import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Player[] player = new Player[n];
    Checker checker = new Checker();

    for(int i = 0; i < n; i++){
      player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();

    Arrays.sort(player, checker);
    for(int i = 0; i < player.length; i++){
      System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
    }
}
class Player {
  String name;
  int score;

  Player(String name, int score){
    this.name = name;
    this.score = score;
  }
}

class Checker implements Comparator<Player>{

    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if(a.score == b.score){
            // Order alphabetically by name
            return a.name.compareTo(b.name);
        }    

        // Otherwise, order higher score first  
        return ((Integer) b.score).compareTo(a.score);
    }
}