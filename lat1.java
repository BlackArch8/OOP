

class player{
    String nama;
    double health;

    Weapon weapon;
    Armor armor;
    player(String nama, double health){
        this.nama = nama;
        this.health = health;
    }

    void equip(Weapon weapon,Armor armor){
        this.weapon = weapon;
        this.armor = armor;
       
    }
    void display(){
        System.out.println("Player: " + this.nama + " health: " + this.health);
        this.weapon.display();
        this.armor.display();
    }
    //attacking

    void attack(player opponent){
        double playerattack = this.weapon.attackpower;
        System.out.println(this.nama + " attacking " + opponent.nama+ " with power " + playerattack);
        
        opponent.defence(playerattack);


    }
    void defence (double playerattack){
        double damage;
        if(playerattack>this.armor.defensepower){
            damage = playerattack - this.armor.defensepower;
        }else{
            damage = 0;
        }
        double health = this.health - damage;
        if(health < 0){
            health = 0;
        }
        System.out.println(this.nama + " gets damage: " + damage);
        System.out.println(this.nama + " health: " + health);

    }

}

class Weapon{
    double attackpower;
    
    Weapon(double attackpower){
        this.attackpower = attackpower;
    }
    void display(){
        System.out.println("attack: " + this.attackpower);

    }
}

class Armor{
   // double defencepower;
    double defensepower;
    

    Armor(double defensepower){
        this.defensepower = defensepower;

    }
    void display(){
        System.out.println("defence: " + this.defensepower);

    }
}







public class lat1 {
    public static void main(String[] args) {
        player player1 = new player("kejol",100);
        Weapon attack1 = new Weapon(100);
        Armor defence1 = new Armor(50);
        player1.equip(attack1,defence1);

        player player2 = new player("pines",100);
        Weapon attack2 = new Weapon(50);
        Armor defence2 = new Armor(50);
        
        player2.equip(attack2,defence2);
        player1.display();
        player2.display();
        
        player1.attack(player2);

        
    }
}
