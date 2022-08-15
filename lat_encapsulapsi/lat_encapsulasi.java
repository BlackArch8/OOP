package lat_encapsulapsi;

class Player{
    private String name;
    private int level;
    private int baseattack;
    private int basehealth;
    private int attackincrement;
    private int healthincrement;
    private int totalDamage;
    
    private boolean isAlive = true;

    private Weapon weapon;
    private Armor armor;

    public Player(String name){
        this.name = name;
        this.level = 1;
        this.baseattack = 100;
        this.basehealth = 100;
        this.attackincrement = 20;
        this.healthincrement = 20;
       
        
    }

    private void setlevelup(){
        this.level += 1;
    }
    public void display(){
        System.out.println("Player\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("MaxHealth\t: " + this.getHealth() +"/" +this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower() );
        System.out.println("Armor\t\t: " + this.armor.getdefence() + "\n");
        
    }


    //attacking
    public void attack(Player musuh){
        int Damage = this.getAttackPower();
        System.out.println(this.name + " is attacking: " + musuh.name + " with damage: " + Damage);

        musuh.Defence(Damage);
        
        this.setlevelup();
        this.display();
        
        

    }
    
    private void Defence(int Damage){
        int defensepower = this.armor.getdefence();
        int damageearned;
        if(Damage > defensepower){
            damageearned = Damage - defensepower;

        }else{
            damageearned = 0;

        }
        this.totalDamage += damageearned;
        System.out.println(this.name + " earned damage: " + damageearned +"\n");
        
        if(this.getHealth() <= 0){
            this.totalDamage = this.maxHealth();
            this.isAlive = false;
        }
        this.display();
        System.out.println();
        if(this.isAlive == false){
          
            System.out.println(this.name + " kalah");
            System.out.println();
            
        }
         

    }
    public int getHealth(){
        return this.maxHealth()- this.totalDamage;
    }



    public int getAttackPower() {
        return this.baseattack + this.weapon.getattack() + this.attackincrement*level;
    }

    public int maxHealth() {
        return this.basehealth + this.healthincrement*level;
    }
    // public int totalHealth() {
    //     return this.basehealth + this.armor.getdefence() + this.healthincrement*level;
    // }

    public void setarmor(Armor armor) {
        this.armor = armor;
    }
    public void setweapon(Weapon weapon) {
        this.weapon = weapon;
    }
    

}
class Weapon{
    private String senjata;
    private int attack;
    
    public Weapon(String senjata){
        this.senjata = senjata;
        if(this.senjata.equals("Pedang")){
            this.attack = 50;
        }else if(this.senjata.equals("Panah")){
            this.attack = 40;
        }else{
            this.attack = 0;
        }

    }
    public int getattack(){
        return this.attack;
    }
}

class Armor{
    private String armor;
    private int defence;
    

    public Armor(String armor){
        this.armor = armor;

        if(this.armor.equals("Baju besi")){
            this.defence = 120;
        }else if(this.armor.equals("Kaos")){
            this.defence = 1;
        }else{
            this.defence = 0;
        }
    }
    public int getdefence(){
        return this.defence;
    }
}


public class lat_encapsulasi {
    public static void main(String[] args) {
        Player player1 = new Player("Kejol");
        Armor armor1 = new Armor("Baju besi");
        player1.setarmor(armor1);
        Weapon weapon1 = new Weapon("Pedang");
        player1.setweapon(weapon1);
        player1.display();

        Player player2 = new Player("Pines");
        Armor armor2 = new Armor("Kaos");
        player2.setarmor(armor2);
        Weapon weapon2 = new Weapon("Panah");
        player2.setweapon(weapon2);
        player2.display();

        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
        player2.attack(player1);
        
        
        
        
        
    }
    
}
