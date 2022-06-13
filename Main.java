public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONTER!");
    Monster monster = new Monster();
    Player player = new Player();
    player.drawMonsters();
    player.showDeck();
    System.out.println(monster.toString());
  }
}
