//constructor overiding
class Constructor_over {
    int angka;
    int pangkat;

    Constructor_over(int angka, int pangkat){
        this.angka = angka;
        this.pangkat = pangkat;
    }
    Constructor_over(int angka){
        this(angka, 0);
    }
    Constructor_over(){
        this(0);
    }
    public void pangkat(){
        double hasil = Math.pow(angka, pangkat);
        System.out.println(hasil);
    }

    
}
