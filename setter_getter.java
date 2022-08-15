
class Data{
    private int angka;

    public Data(){
        this.angka = 0;
    }

    public void setangka(int angka){
        this.angka = angka;

    }

    public int getangka(){
        return this.angka;
    }
    


}
class lingkaran{
    private double diameter;

    public lingkaran(){
        this.diameter = 0;
    }

    public void setjari2(double jari){
        this.diameter = jari * 2;
    }

    public double getdiameter(){
        return this.diameter;
    }

    public double getjari2(){
        return this.diameter/2;
    }



}










public class setter_getter{
    public static void main(String[] args) {
        Data angka1 = new Data();
        System.out.println(angka1.getangka());
        angka1.setangka(100);
        System.out.println(angka1.getangka());

        System.out.println();

        lingkaran ling = new lingkaran();
        System.out.println(ling.getdiameter());
        ling.setjari2(20);
        System.out.println(ling.getdiameter());
        System.out.println(ling.getjari2());


    }
}