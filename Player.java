public class Player {
    String playerName;
    Equips equips;

    public Player(String playerName,String armorType,String swordType){
        this.equips = new Equips(armorType, swordType);
        this.playerName = playerName;
    }
    //Constructor overloading.
    public Player(String playerName,String armorType){
        this.equips = new Equips(armorType);
        this.playerName = playerName;
    }
}