/**
* Both players and encounters have stats. Players' stats are used to roll dice, and encounters' stats can be added to the player's as loot.
*
* */


public class Stats {
    private int hp, str, dex, mag;

     public Stats(int hp, int str, int dex, int mag) {
          this.hp = hp;
          this.str = str;
          this.dex = dex;
          this.mag = mag;
     }

     public int getHp() {
          return hp;
     }

     public int getStr() {
          return str;
     }

     public int getDex() {
          return dex;
     }

     public int getMag() {
          return mag;
     }

     public void setStats(int h, int s, int d, int m) {
         hp = h;
         str = s;
         dex = d;
         mag = m;
     }

     public void addStats(Stats o) {
          int h = o.getHp() + hp;
          int s = o.getStr() + str;
          int d = o.getDex() + dex;
          int m = o.getMag() + mag;

          setStats(h, s, d, m);
     }
}
