public class Main{
    public static void main(String[] args) {
        Player player = new Player("Player 1","heavy armor","long sword");
        Player player1 = new Player("Player 2","heavy armor","dagger");

        if(player.equips.getAmount()>player1.equips.getAmount()){
            System.out.println("Player 1 kazandı "+player.equips.getAmount()+"Player 2in canı "+player1.equips.getAmount());
        }
        if(player.equips.getAmount()==player1.equips.getAmount()){
            System.out.println("Berabere");
        }
        if(player.equips.getAmount()<player1.equips.getAmount()){
            System.out.println("Player 2 kazandı "+player1.equips.getAmount()+"Player 1in canı "+player.equips.getAmount());
        }
    }

}