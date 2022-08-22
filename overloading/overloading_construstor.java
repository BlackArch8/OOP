package overiding;


class player{
    String nama;

    player(String nama){
        this.nama = nama;
    }
    player(){
        this.nama = "kejol";
    }
    
    public void show(){
        System.out.println(this.nama);
    }
}

public class overiding_construstor {
    public static void main(String[] args) {
        player player1 = new player("marisa");
        player1.show();
        player player2 = new player();
        player2.show();


    }
}
