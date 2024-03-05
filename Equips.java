public class Equips{
    int amount = 0;
    public Equips(String armorType,String swordType){
        if("light armor".equals(armorType)){
            lightArmor();
        }
        if("dagger".equals(swordType)){
            dagger();
        }
        if("heavy armor".equals(armorType)){
            heavyArmor();
        }
        if("long sword".equals(swordType)){
            longSword();
        }

    }
    //Constructor overloading.
    public Equips(String armorType){
        if("light armor".equals(armorType)){
            lightArmor();
        }

        if("heavy armor".equals(armorType)){
            heavyArmor();
        }

    }
    public void lightArmor(){
        amount +=5;
    }
    public void heavyArmor(){
        amount +=8;
    }
    public void dagger(){
        amount+=5;
    }
    public void longSword(){
        amount+=8;
    }

    public int getAmount(){
        return amount;
    }
}